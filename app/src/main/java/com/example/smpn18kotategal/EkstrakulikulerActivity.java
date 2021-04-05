package com.example.smpn18kotategal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class EkstrakulikulerActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ekstrakulikuler);
    }

    public void osis1(View view){
        Intent intent=new Intent(EkstrakulikulerActivity.this, OsisActivity.class);
        startActivity(intent);
    }

    public void pramuka2(View view){
        Intent intent=new Intent(EkstrakulikulerActivity.this,PramukaActivity.class);
        startActivity(intent);
    }

    public void pmr3(View view){
        Intent intent=new Intent(EkstrakulikulerActivity.this,PmrActivity.class);
        startActivity(intent);
    }

    public void futsal4(View view){
        Intent intent=new Intent(EkstrakulikulerActivity.this, FutsalActivity.class);
        startActivity(intent);
    }


}