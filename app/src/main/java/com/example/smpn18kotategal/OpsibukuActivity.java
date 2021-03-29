package com.example.smpn18kotategal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ViewFlipper;


public class OpsibukuActivity extends AppCompatActivity {
    ViewFlipper viewFlipper;
    Animation fadein, fadeout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_opsibuku);

        viewFlipper= (ViewFlipper) findViewById(R.id.viewFlipper);



        fadein= AnimationUtils.loadAnimation(this,R.anim.fade_in);

        fadeout= AnimationUtils.loadAnimation(this,R.anim.fade_in);

        viewFlipper.setInAnimation(fadein);

        viewFlipper.setOutAnimation(fadein);

        viewFlipper.setAutoStart(true);

        viewFlipper.setFlipInterval(5000);

        viewFlipper.startFlipping();
    }

    public void kls7(View view){
        Intent intent=new Intent(OpsibukuActivity.this, PerpustakaanActivity.class);
        startActivity(intent);
    }

    public void kls8(View view){
        Intent intent=new Intent(OpsibukuActivity.this, perpustakaan2Activity.class);
        startActivity(intent);
    }

    public void kls9(View view){
        Intent intent=new Intent(OpsibukuActivity.this, perpustakaan3Activity.class);
        startActivity(intent);
    }
}