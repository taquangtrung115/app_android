package com.example.appcooking.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.appcooking.Model.Category;
import com.example.appcooking.R;

import java.util.ArrayList;
import java.util.List;

public class CategoryAdapter extends BaseAdapter {
    private Context context;
    private int layout;
    private ArrayList<Category> categoriesArrayList;

    public CategoryAdapter(Context context, int layout, ArrayList<Category> categoriesArrayList) {
        this.context = context;
        this.layout = layout;
        this.categoriesArrayList = categoriesArrayList;
    }

    @Override
    public int getCount() {
        return categoriesArrayList.size();
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
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater= (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        convertView=inflater.inflate(layout,null);
        //ánh xạ view
        TextView txt_categories=convertView.findViewById(R.id.txtNameCate);
        ImageView imageView=convertView.findViewById(R.id.imgCate);
        //gán dữ liệu//
        Category categories=categoriesArrayList.get(position);
        txt_categories.setText(categories.getTenDM());
        imageView.setImageResource(categories.getHinAnhDM());
        return convertView;
    }
}
