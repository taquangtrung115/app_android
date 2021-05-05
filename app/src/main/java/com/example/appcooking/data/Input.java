package com.example.appcooking.data;

import android.content.Context;

import com.example.appcooking.Category;
import com.example.appcooking.Food;
import com.example.appcooking.R;

import java.util.ArrayList;

public class Input {
    private Context context;
    Food food = new Food();
    public Input(Context context)
    {
        this.context = context;
    }
    public ArrayList<Food> getMockData(){
        ArrayList<Food> tmp = new ArrayList<>();

        tmp.add(new Food(food.getMaMA(),food.getCategory(),context.getString(R.string.name1),context.getString(R.string.cach_lam1),R.drawable.bac2));
        tmp.add(new Food(food.getMaMA(),food.getCategory(),context.getString(R.string.name2),context.getString(R.string.cach_lam2),R.drawable.bac2));
        tmp.add(new Food(food.getMaMA(),food.getCategory(),context.getString(R.string.name3),context.getString(R.string.cach_lam3),R.drawable.bac2));
        tmp.add(new Food(food.getMaMA(),food.getCategory(),context.getString(R.string.name4),context.getString(R.string.cach_lam4),R.drawable.bac2));
        tmp.add(new Food(food.getMaMA(),food.getCategory(),context.getString(R.string.name5),context.getString(R.string.cach_lam5),R.drawable.bac2));
        tmp.add(new Food(food.getMaMA(),food.getCategory(),context.getString(R.string.name6),context.getString(R.string.cach_lam6),R.drawable.bac2));
        tmp.add(new Food(food.getMaMA(),food.getCategory(),context.getString(R.string.name7),context.getString(R.string.cach_lam7),R.drawable.bac2));
        tmp.add(new Food(food.getMaMA(),food.getCategory(),context.getString(R.string.name8),context.getString(R.string.cach_lam8),R.drawable.bac2));
        tmp.add(new Food(food.getMaMA(),food.getCategory(),context.getString(R.string.name9),context.getString(R.string.cach_lam9),R.drawable.bac2));
        tmp.add(new Food(food.getMaMA(),food.getCategory(),context.getString(R.string.name10),context.getString(R.string.cach_lam10),R.drawable.bac2));
        tmp.add(new Food(food.getMaMA(),food.getCategory(),context.getString(R.string.name11),context.getString(R.string.cach_lam11),R.drawable.bac2));
        tmp.add(new Food(food.getMaMA(),food.getCategory(),context.getString(R.string.name12),context.getString(R.string.cach_lam12),R.drawable.bac2));
        tmp.add(new Food(food.getMaMA(),food.getCategory(),context.getString(R.string.name13),context.getString(R.string.cach_lam13),R.drawable.bac2));
        tmp.add(new Food(food.getMaMA(),food.getCategory(),context.getString(R.string.name14),context.getString(R.string.cach_lam14),R.drawable.bac2));
        tmp.add(new Food(food.getMaMA(),food.getCategory(),context.getString(R.string.name15),context.getString(R.string.cach_lam15),R.drawable.bac2));
        tmp.add(new Food(food.getMaMA(),food.getCategory(),context.getString(R.string.name16),context.getString(R.string.cach_lam16),R.drawable.bac2));
        tmp.add(new Food(food.getMaMA(),food.getCategory(),context.getString(R.string.name17),context.getString(R.string.cach_lam17),R.drawable.bac2));
        tmp.add(new Food(food.getMaMA(),food.getCategory(),context.getString(R.string.name18),context.getString(R.string.cach_lam18),R.drawable.bac2));
        tmp.add(new Food(food.getMaMA(),food.getCategory(),context.getString(R.string.name19),context.getString(R.string.cach_lam19),R.drawable.bac2));
        tmp.add(new Food(food.getMaMA(),food.getCategory(),context.getString(R.string.name20),context.getString(R.string.cach_lam20),R.drawable.bac2));

        return  tmp;
    }
    public ArrayList<Category> getMockDataCategory(){
        ArrayList<Category> tmp = new ArrayList<>();
        tmp.add(new Category(R.drawable.bac2,"Việt Nam"));
        tmp.add(new Category(R.drawable.bac2,"Mỹ"));
        tmp.add(new Category(R.drawable.bac2,"Pháp"));
        tmp.add(new Category(R.drawable.bac2,"Anh"));

        return tmp;

    }
}
