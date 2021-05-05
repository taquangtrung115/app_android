package com.example.appcooking.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.fragment.app.FragmentActivity;

import com.example.appcooking.Model.Food;
import com.example.appcooking.R;

import java.util.ArrayList;
import java.util.List;

public class FoodAdapter extends BaseAdapter {
    private Context context;
    private int layout;
    private List<Food> foodList;
    private ArrayList<Food> foodArrayList;

    public FoodAdapter(Context context, int layout, List<Food> foodList, ArrayList<Food> foodArrayList) {
        this.setContext(context);
        this.setLayout(layout);
        this.setFoodList(foodList);
        this.setFoodArrayList(foodArrayList);
    }

    public FoodAdapter(Context context, int layout, List<Food> furnitureList) {
        this.setContext(context);
        this.layout = layout;
        this.foodList = furnitureList;


    }

    @Override
    public int getCount() {
        return getFoodList().size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View view, ViewGroup viewGroup) {
        view= LayoutInflater.from(getContext()).inflate(R.layout.row_food_list,viewGroup,false);
        TextView txtTen = (TextView) view.findViewById(R.id.txtNameFood);
        TextView txtMoTa = view.findViewById(R.id.txtDesFood);
        ImageView img = view.findViewById(R.id.imgFood);

        Food food = foodList.get(position);
        txtTen.setText(food.getTenMA());
        txtMoTa.setText(food.getCachLam());
        img.setImageResource(food.getHinhAnh());
        return view;
    }

    public Context getContext() {
        return context;
    }

    public void setContext(Context context) {
        this.context = context;
    }

    public int getLayout() {
        return layout;
    }

    public void setLayout(int layout) {
        this.layout = layout;
    }

    public List<Food> getFoodList() {
        return foodList;
    }

    public void setFoodList(List<Food> foodList) {
        this.foodList = foodList;
    }

    public ArrayList<Food> getFoodArrayList() {
        return foodArrayList;
    }

    public void setFoodArrayList(ArrayList<Food> foodArrayList) {
        this.foodArrayList = foodArrayList;
    }

    public void clear() {
        this.clear();
    }

    public void addAll(ArrayList<Food> tmp) {
        this.addAll(tmp);
    }
}
