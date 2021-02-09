package com.example.smpn18kotategal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public void profil(View view){
        Intent intent=new Intent(MainActivity.this, ProfilActivity.class);
        startActivity(intent);
    }

    public void guru(View view){
        Intent intent=new Intent(MainActivity.this,GuruActivity.class);
        startActivity(intent);
    }

    public void prestasi(View view){
        Intent intent=new Intent(MainActivity.this,PrestasiActivity.class);
        startActivity(intent);
    }

    public void fasilitas(View view){
        Intent intent=new Intent(MainActivity.this, FasilitasActivity.class);
        startActivity(intent);
    }

    public void ekstrakulikuler(View view){
        Intent intent=new Intent(MainActivity.this, EkstrakulikulerActivity.class);
        startActivity(intent);
    }

    public void pengumuman(View view){
        Intent intent=new Intent(MainActivity.this, PengumumanActivity.class);
        startActivity(intent);
    }

    public void galeri(View view){
        Intent intent=new Intent(MainActivity.this, GaleriActivity.class);
        startActivity(intent);
    }

}
