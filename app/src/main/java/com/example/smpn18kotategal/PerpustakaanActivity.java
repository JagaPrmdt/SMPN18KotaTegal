package com.example.smpn18kotategal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class PerpustakaanActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_perpustakaan);





    }

    public void mtk7(View view){
        Intent intent=new Intent(PerpustakaanActivity.this, Mtk7Activity.class);
        startActivity(intent);
    }

    public void bind7(View view){
        Intent intent=new Intent(PerpustakaanActivity.this, Bind7Activity.class);
        startActivity(intent);
    }
    public void bing7(View view){
        Intent intent=new Intent(PerpustakaanActivity.this, Bing7Activity.class);
        startActivity(intent);
    }

    public void ipa7(View view){
        Intent intent=new Intent(PerpustakaanActivity.this, Ipa7Activity.class);
        startActivity(intent);
    }

    public void ips7(View view){
        Intent intent=new Intent(PerpustakaanActivity.this, Ips7Activity.class);
        startActivity(intent);
    }

    public void pai7(View view){
        Intent intent=new Intent(PerpustakaanActivity.this, Pai7Activity.class);
        startActivity(intent);
    }

    public void pjok7(View view){
        Intent intent=new Intent(PerpustakaanActivity.this, Pjok7Activity.class);
        startActivity(intent);
    }

    public void pkn7(View view){
        Intent intent=new Intent(PerpustakaanActivity.this, Pkn7Activity.class);
        startActivity(intent);
    }

    public void prakarya7(View view){
        Intent intent=new Intent(PerpustakaanActivity.this, Prakarya7Activity.class);
        startActivity(intent);
    }

    public void sby7(View view){
        Intent intent=new Intent(PerpustakaanActivity.this, Sby7Activity.class);
        startActivity(intent);
    }

    public void bjawa7(View view){
        Intent intent=new Intent(PerpustakaanActivity.this, Bjawa7Activity.class);
        startActivity(intent);
    }


}