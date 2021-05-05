package com.example.appcooking.Model;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;

import com.example.appcooking.R;
import com.example.appcooking.fragment.CategoryFragment;
import com.example.appcooking.fragment.FoodFragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {
    BottomNavigationView navView;
    boolean status = false;
    EditText searchView;
    MenuItem menuItem;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        navView = findViewById(R.id.nav_view);
        loadFragment(new FoodFragment());
        navView.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
        navView.setSelectedItemId(R.id.mnudanhsach);

        searchView= findViewById(R.id.search);
        searchView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,SearchActivity.class);
                startActivity(intent);
            }
        });
    }
    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener = new BottomNavigationView.OnNavigationItemSelectedListener() {
        @SuppressLint("NonConstantResourceId")
        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            Fragment fragment;
            switch (item.getItemId()){
                case R.id.mnudanhsach:
                    //getSupportActionBar().setTitle("Danh Sach");
                    fragment = new FoodFragment();
                    loadFragment(fragment);
                    return true;
                case R.id.mnudanhmuc:
                    //getSupportActionBar().setTitle("Danh Muc");
                    fragment = new CategoryFragment();
                    loadFragment(fragment);
                    return true;

                default:
                    throw new IllegalStateException("Unexpected value: " + item.getItemId());
            }

        }

    };
    public void loadFragment(Fragment fragment){
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.nav_fragment,fragment);
        transaction.addToBackStack(null);
        transaction.commit();
    }
}