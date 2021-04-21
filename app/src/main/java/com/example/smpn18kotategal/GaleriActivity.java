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
        Intent intent=new Intent(GaleriActivity.this, album5sActivity.class);
        startActivity(intent);
    }

    public void album2(View view){
        Intent intent=new Intent(GaleriActivity.this, albumupacaraActivity.class);
        startActivity(intent);
    }

    public void album3(View view){
        Intent intent=new Intent(GaleriActivity.this, albumpramukaActivity.class);
        startActivity(intent);
    }

    public void album4(View view){
        Intent intent=new Intent(GaleriActivity.this, albumhutActivity.class);
        startActivity(intent);
    }



}