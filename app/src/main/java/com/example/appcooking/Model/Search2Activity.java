package com.example.appcooking.Model;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.SearchView;

import com.example.appcooking.R;
import com.example.appcooking.adapter.FoodAdapter;
import com.example.appcooking.data.DBCooking;
import com.example.appcooking.data.Input;

import java.util.ArrayList;

import me.gujun.android.taggroup.TagGroup;

public class Search2Activity extends AppCompatActivity {

    SearchView searchView;
    ArrayList<Food> arrayList;
    Input input;
    ListView listView;
    FoodAdapter foodAdapter;
    TagGroup tagGroup;
    DBCooking dbCooking;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search2);
        input = new Input(Search2Activity.this);

        arrayList = new ArrayList<>();

        listView = findViewById(R.id.listViewSearch);

        foodAdapter = new FoodAdapter(Search2Activity.this,arrayList);
        listView.setAdapter(foodAdapter);

        searchView = findViewById(R.id.search_view);
        searchView.setIconifiedByDefault(true);
        searchView.setFocusable(true);
        searchView.setIconified(false);
        searchView.requestFocusFromTouch();

        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {


                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {

                searchFurniture(newText);
                return false;
            }
        });
        tagGroup = findViewById(R.id.taggroup);
        tagGroup.setTags(new String[]{"Bún", "Xào", "Chiên", "Ăn Vặt","Canh","Cháo","Chè","Gỏi","Hấp","Kho","Lẩu","Mứt","Nướng","Xôi"});
        tagGroup.setOnTagClickListener(new TagGroup.OnTagClickListener() {
            @Override
            public void onTagClick(String tag) {
                searchView.setQuery(tag, false);


                hideSoftKeyboard(searchView);
            }
        });
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent i = new Intent(Search2Activity.this, DentailActivity.class);
                i.putExtra("name", arrayList.get(position).getTenMA().toString());
                i.putExtra("description",arrayList.get(position).getCachLam().toString());
                i.putExtra("image", arrayList.get(position).getHinhAnh());

                startActivity(i);
            }
        });
    }
    private void searchFurniture(String newText){
        ArrayList<Food> tmp = new ArrayList<>();
        for (Food furniture : input.getMockData()){
            if (furniture.getTenMA().toLowerCase().contains(newText.toLowerCase())){
                tmp.add(furniture);
            }
        }

        if (tmp.size()>0){
            foodAdapter.clear();
            foodAdapter.addAll(tmp);

            foodAdapter.notifyDataSetChanged();

            listView.setVisibility(View.VISIBLE);

        }
        if (newText.isEmpty()){
            listView.setVisibility(View.GONE);
        }
    }
    public void hideSoftKeyboard(View view){
        InputMethodManager imm =(InputMethodManager)getSystemService(Context.INPUT_METHOD_SERVICE);
        imm.hideSoftInputFromWindow(view.getWindowToken(),0);
    }
}