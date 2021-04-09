package com.example.smpn18kotategal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class GaleriActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_galeri);

    }


    public void album1(View view){
        Intent intent=new Intent(GaleriActivity.this, album1Activity.class);
        startActivity(intent);
    }

    public void album2(View view){
        Intent intent=new Intent(GaleriActivity.this, Album2Activity.class);
        startActivity(intent);
    }

    public void album3(View view){
        Intent intent=new Intent(GaleriActivity.this, Album3Activity.class);
        startActivity(intent);
    }

    public void album4(View view){
        Intent intent=new Intent(GaleriActivity.this, Album4Activity.class);
        startActivity(intent);
    }



}