package com.example.appcooking.Model;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.appcooking.R;

public class DentailActivity extends AppCompatActivity {

    ImageView imageView;
    TextView itemName, itemDes;
    Button btnXem;




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
        itemDes.setMovementMethod(new ScrollingMovementMethod());

//        btnXem= findViewById(R.id.btnXem);
//        btnXem.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent = new Intent(DentailActivity.this, VideoActivity.class);
//                startActivity(intent);
//            }
//        });


    }
}