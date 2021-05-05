package com.example.appcooking.Model;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.appcooking.R;

public class DentailActivity extends AppCompatActivity {

    ImageView imageView;
    TextView itemName, itemDes;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dentail);



        Intent intent = getIntent();

        imageView = findViewById(R.id.imgDentail_img);
        itemName = findViewById(R.id.txtDentail_Name);
        itemDes = findViewById(R.id.txtDentail_Des);
        itemName.setText(intent.getStringExtra("name"));
        itemDes.setText(intent.getStringExtra("description"));
        imageView.setImageResource(intent.getIntExtra("image",0));



    }
}