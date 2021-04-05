package com.example.smpn18kotategal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class perpustakaan3Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_perpustakaan3);
    }

    public void mtk9(View view){
        Intent intent=new Intent(perpustakaan3Activity.this, Mtk9Activity.class);
        startActivity(intent);
    }

    public void bind9(View view){
        Intent intent=new Intent(perpustakaan3Activity.this, Bind9Activity.class);
        startActivity(intent);
    }
    public void bing9(View view){
        Intent intent=new Intent(perpustakaan3Activity.this, Bing9Activity.class);
        startActivity(intent);
    }

    public void ipa9(View view){
        Intent intent=new Intent(perpustakaan3Activity.this, Ipa9Activity.class);
        startActivity(intent);
    }

    public void ips9(View view){
        Intent intent=new Intent(perpustakaan3Activity.this, Ips9Activity.class);
        startActivity(intent);
    }

    public void pai9(View view){
        Intent intent=new Intent(perpustakaan3Activity.this, Pai9Activity.class);
        startActivity(intent);
    }

    public void pjok9(View view){
        Intent intent=new Intent(perpustakaan3Activity.this, Pjok9Activity.class);
        startActivity(intent);
    }

    public void pkn9(View view){
        Intent intent=new Intent(perpustakaan3Activity.this, Pkn9Activity.class);
        startActivity(intent);
    }

    public void prakarya9(View view){
        Intent intent=new Intent(perpustakaan3Activity.this, Prakarya9Activity.class);
        startActivity(intent);
    }

    public void sby9(View view){
        Intent intent=new Intent(perpustakaan3Activity.this, Sby9Activity.class);
        startActivity(intent);
    }

    public void bjawa9(View view){
        Intent intent=new Intent(perpustakaan3Activity.this, Bjawa9Activity.class);
        startActivity(intent);
    }
}