package com.example.appcooking.fragment;

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

import com.example.appcooking.Model.DentailActivity;
import com.example.appcooking.Model.Food;
import com.example.appcooking.R;
import com.example.appcooking.adapter.FoodAdapter;
import com.example.appcooking.data.DBCooking;
import com.example.appcooking.data.Input;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link FoodFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class FoodFragment extends Fragment {
    ListView listView;
    ArrayList<Food> foodArrayList;
    FoodAdapter foodAdapter;
    Input input;
    //DBHelper dbHelper;
    //DBHelper dbTest;
    DBCooking dbCooking;

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public FoodFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment FoodFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static FoodFragment newInstance(String param1, String param2) {
        FoodFragment fragment = new FoodFragment();
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
        input = new Input(getContext());
        dbCooking = new DBCooking(getContext());
        return inflater.inflate(R.layout.fragment_food, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        listView = view.findViewById(R.id.lstViewFood);
        dbCooking.createTable();
        dbCooking.insertFood();
        foodArrayList = dbCooking.getALLFood();
        foodAdapter = new FoodAdapter(getContext(),foodArrayList);

        listView.setAdapter(foodAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Input.foodHistory.add(foodArrayList.get(position));


                Intent i = new Intent(getActivity(), DentailActivity.class);
                i.putExtra("name", foodArrayList.get(position).getTenMA().toString());
                i.putExtra("description", foodArrayList.get(position).getCachLam().toString());
                i.putExtra("image", foodArrayList.get(position).getHinhAnh());

                startActivity(i);

            }
        });
    }
}