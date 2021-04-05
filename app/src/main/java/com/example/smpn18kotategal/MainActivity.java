package com.example.smpn18kotategal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ViewFlipper;

public class MainActivity extends AppCompatActivity {
    ViewFlipper viewFlipper;
    Animation fadein, fadeout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        viewFlipper= (ViewFlipper) findViewById(R.id.viewFlipper);



        fadein= AnimationUtils.loadAnimation(this,R.anim.fade_in);

        fadeout= AnimationUtils.loadAnimation(this,R.anim.fade_in);

        viewFlipper.setInAnimation(fadein);

        viewFlipper.setOutAnimation(fadein);

        viewFlipper.setAutoStart(true);

        viewFlipper.setFlipInterval(5000);

        viewFlipper.startFlipping();



    }
    public void profil(View view){
        Intent intent=new Intent(MainActivity.this, ProfilActivity.class);
        startActivity(intent);
    }

    public void guru(View view){
        Intent intent=new Intent(MainActivity.this,GuruActivity.class);
        startActivity(intent);
    }


    public void fasilitas(View view){
        Intent intent=new Intent(MainActivity.this, FasilitasActivity.class);
        startActivity(intent);
    }

    public void ekstrakulikuler(View view){
        Intent intent=new Intent(MainActivity.this, EkskulActivity.class);
        startActivity(intent);
    }
    public void perpus(View view){
        Intent intent=new Intent(MainActivity.this,OpsibukuActivity.class);
        startActivity(intent);
    }

    public void galeri(View view){
        Intent intent=new Intent(MainActivity.this, GaleriActivity.class);
        startActivity(intent);
    }


}
