package com.example.smpn18kotategal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class perpustakaan2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_perpustakaan2);
    }

    public void mtk8(View view){
        Intent intent=new Intent(perpustakaan2Activity.this, Mtk8Activity.class);
        startActivity(intent);
    }

    public void bind8(View view){
        Intent intent=new Intent(perpustakaan2Activity.this, Bind8Activity.class);
        startActivity(intent);
    }
    public void bing8(View view){
        Intent intent=new Intent(perpustakaan2Activity.this, Bing8Activity.class);
        startActivity(intent);
    }

    public void ipa8(View view){
        Intent intent=new Intent(perpustakaan2Activity.this, Ipa8Activity.class);
        startActivity(intent);
    }

    public void ips8(View view){
        Intent intent=new Intent(perpustakaan2Activity.this, Ips8Activity.class);
        startActivity(intent);
    }

    public void pai8(View view){
        Intent intent=new Intent(perpustakaan2Activity.this, Pai8Activity.class);
        startActivity(intent);
    }

    public void pjok8(View view){
        Intent intent=new Intent(perpustakaan2Activity.this, Pjok8Activity.class);
        startActivity(intent);
    }

    public void pkn8(View view){
        Intent intent=new Intent(perpustakaan2Activity.this, Pkn8Activity.class);
        startActivity(intent);
    }

    public void prakarya8(View view){
        Intent intent=new Intent(perpustakaan2Activity.this, Prakarya8Activity.class);
        startActivity(intent);
    }

    public void sby8(View view){
        Intent intent=new Intent(perpustakaan2Activity.this, Sby8Activity.class);
        startActivity(intent);
    }

    public void bjawa8(View view){
        Intent intent=new Intent(perpustakaan2Activity.this, Bjawa8Activity.class);
        startActivity(intent);
    }
}