package com.example.smpn18kotategal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class EkskulActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ekskul);
    }

    public void osis (View view){
        Intent intent=new Intent(EkskulActivity.this, OrganisasiosisActivity.class);
        startActivity(intent);
    }

    public void pramuka (View view){
        Intent intent=new Intent(EkskulActivity.this,OrganisasipramukaActivity.class);
        startActivity(intent);
    }

    public void pmr (View view){
        Intent intent=new Intent(EkskulActivity.this,OrganisasipmrActivity.class);
        startActivity(intent);
    }

    public void futsal (View view){
        Intent intent=new Intent(EkskulActivity.this, OrganisasifutsalActivity.class);
        startActivity(intent);
    }
}