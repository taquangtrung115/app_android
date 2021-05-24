package com.example.appcooking.fragment;

import android.app.DownloadManager;
import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.Volley;
import com.example.appcooking.Model.PlayVideoActivity;
import com.example.appcooking.Model.Video;
import com.example.appcooking.Model.VideoActivity;
import com.example.appcooking.R;
import com.example.appcooking.adapter.VideoAdapter;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link VideoFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class VideoFragment extends Fragment {

    public static String APIKey = "AIzaSyA61QvAZH6FXzAk4FdJVbCl8GS7DiwMNlI";
    String IDList = "PLnEEsieItPVOQbCVYR-u_KU9SwAv1P9Zw";
    String urlJson = "https://www.googleapis.com/youtube/v3/playlistItems?part=snippet&playlistId="+ IDList +"&key="+ APIKey +"&maxResults=50";
    ListView listvideo;
    ArrayList<Video> videoArrayList;
    VideoAdapter videoAdapter;
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public VideoFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment VideoFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static VideoFragment newInstance(String param1, String param2) {
        VideoFragment fragment = new VideoFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_video, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        listvideo = view.findViewById(R.id.listVideo);
        videoArrayList = new ArrayList<>();
        videoAdapter = new VideoAdapter(getContext(),R.layout.row_video,videoArrayList);
        listvideo.setAdapter(videoAdapter);
        listvideo.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(getActivity(), PlayVideoActivity.class);
                intent.putExtra("idVideoYoutube",videoArrayList.get(position).getId());
                startActivity(intent);
            }
        });
        GetjsonYoutube(urlJson);
    }
    private  void GetjsonYoutube(String url)
    {
        RequestQueue requestQueue = Volley.newRequestQueue(getContext());
        JsonObjectRequest jsonObjectRequest =new JsonObjectRequest(Request.Method.GET, url, null, new Response.Listener<JSONObject>() {
            @Override
            public void onResponse(JSONObject response) {
                try {
                    JSONArray jsonArray = response.getJSONArray("items");
                    String title = "";
                    String url = "";
                    String idVideo="";
                    for (int i = 0; i < jsonArray.length();i++)
                    {
                        JSONObject jsonItem = jsonArray.getJSONObject(i);
                        JSONObject jsonSnippet = jsonItem.getJSONObject("snippet");
                        title = jsonSnippet.getString("title");

                        JSONObject jsonThum= jsonSnippet.getJSONObject("thumbnails");
                        JSONObject jsonMedium= jsonThum.getJSONObject("medium");
                        url = jsonMedium.getString("url");

                        JSONObject jsonResouceID = jsonSnippet.getJSONObject("resourceId");
                        idVideo = jsonResouceID.getString("videoId");
                        videoArrayList.add(new Video(title,url,idVideo));
                    }
                    videoAdapter.notifyDataSetChanged();
                }catch (JSONException ex)
                {
                    ex.printStackTrace();
                }
            }
        },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {
                        Toast.makeText(getActivity(), "Lỗi", Toast.LENGTH_SHORT).show();
                    }
                }
        );
        requestQueue.add(jsonObjectRequest);
    }
}