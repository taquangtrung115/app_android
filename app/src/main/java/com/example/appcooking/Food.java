package com.example.appcooking;

import androidx.cardview.widget.CardView;

public class Food {
    private int maMA;
    private int maDM;
    private String tenMA;
    private String cachLam;
    private int hinhAnh;
    public Food()
    {}
    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    private Category category;
    public Food(int maMA, String tenMA, String cachLam, int hinhAnh) {
        this.maMA = maMA;
        this.tenMA = tenMA;
        this.cachLam = cachLam;
        this.hinhAnh = hinhAnh;
    }

    public Food(int maMA, int maDM, String tenMA, String cachLam, int hinhAnh) {
        this.maMA = maMA;
        this.maDM = maDM;
        this.tenMA = tenMA;
        this.cachLam = cachLam;
        this.hinhAnh = hinhAnh;
    }

    public Food(int id, Category byCatetgoriesID, String name, String description, int hinhAnh) {
        this.maMA = id;
        this.category = byCatetgoriesID;
        this.tenMA=name;
        this.cachLam=description;
        this.hinhAnh=hinhAnh;
    }

    public int getMaMA() {
        return maMA;
    }

    public void setMaMA(int maMA) {
        this.maMA = maMA;
    }

    public int getMaDM() {
        return maDM;
    }

    public void setMaDM(int maDM) {
        this.maDM = maDM;
    }

    public String getTenMA() {
        return tenMA;
    }

    public void setTenMA(String tenMA) {
        this.tenMA = tenMA;
    }

    public String getCachLam() {
        return cachLam;
    }

    public void setCachLam(String cachLam) {
        this.cachLam = cachLam;
    }

    public int getHinhAnh() {
        return hinhAnh;
    }

    public void setHinhAnh(int hinhAnh) {
        this.hinhAnh = hinhAnh;
    }
}
