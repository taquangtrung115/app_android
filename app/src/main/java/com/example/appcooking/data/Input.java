package com.example.appcooking.data;

import android.content.Context;

import com.example.appcooking.Model.Category;
import com.example.appcooking.Model.Food;
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


        return  tmp;
    }
    public ArrayList<Category> getMockDataCategory(){
        ArrayList<Category> tmp = new ArrayList<>();
        tmp.add(new Category(R.drawable.bunbohue,"Bún"));
        tmp.add(new Category(R.drawable.canhthitbo,"Canh"));
        tmp.add(new Category(R.drawable.canhgachienncmam,"Chiên"));
        tmp.add(new Category(R.drawable.chaosingapore,"Cháo"));
        tmp.add(new Category(R.drawable.avkhoga,"Ăn Vặt"));
        tmp.add(new Category(R.drawable.chekhucbach,"Chè"));
        tmp.add(new Category(R.drawable.goisua,"Gỏi"));
        tmp.add(new Category(R.drawable.hapgahapmuoi,"Hấp"));
        tmp.add(new Category(R.drawable.khoheokho,"Kho"));
        tmp.add(new Category(R.drawable.laugalagiang,"Lẩu"));
        tmp.add(new Category(R.drawable.mutbidao,"Mứt"));
        tmp.add(new Category(R.drawable.nuongsolong,"Nướng"));
        tmp.add(new Category(R.drawable.xaolongheo,"Xào"));
        tmp.add(new Category(R.drawable.xoiga,"Xôi"));
        return tmp;

    }
    public static ArrayList<Food> foodHistory = new ArrayList<>();
    public  void addFoodHistory(Food food){
        if (foodHistory.indexOf(food)>0){
            foodHistory.add(0,food);
        }
    }

    public static ArrayList<Food> getFoodHistory() {
        return foodHistory;
    }
}
