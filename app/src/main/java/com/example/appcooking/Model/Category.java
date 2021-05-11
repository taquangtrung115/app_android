package com.example.appcooking.Model;

import java.util.ArrayList;

public class Category {
    private int maDM;
    private ArrayList<Food> foodArrayList;

    public Category(String tenDM, int hinAnhDM) {

        this.hinAnhDM = hinAnhDM;
        this.tenDM = tenDM;
    }

    public int getHinAnhDM() {
        return hinAnhDM;
    }

    public void setHinAnhDM(int hinAnhDM) {
        this.hinAnhDM = hinAnhDM;
    }

    private int hinAnhDM;


    public Category(String tenDM) {
        this.tenDM = tenDM;
    }



    private String tenDM;

    public int getMaDM() {
        return maDM;
    }

    public void setMaDM(int maDM) {
        this.maDM = maDM;
    }



    public String getTenDM() {
        return tenDM;
    }

    public void setTenDM(String tenDM) {
        this.tenDM = tenDM;
    }

    public ArrayList<Food> getFoodArrayList() {
        return foodArrayList;
    }

    public void setFoodArrayList(ArrayList<Food> foodArrayList) {
        this.foodArrayList = foodArrayList;
    }
}
