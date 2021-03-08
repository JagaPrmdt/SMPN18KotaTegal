package com.example.smpn18kotategal;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ViewFlipper;

public class OsisActivity extends AppCompatActivity {
    ViewFlipper viewFlipper;
    Animation fadein, fadeout;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_osis);

        viewFlipper= (ViewFlipper) findViewById(R.id.viewFlipper);



        fadein= AnimationUtils.loadAnimation(this,R.anim.fade_in);

        fadeout= AnimationUtils.loadAnimation(this,R.anim.fade_out);

        viewFlipper.setInAnimation(fadein);

        viewFlipper.setOutAnimation(fadeout);

        viewFlipper.setAutoStart(true);

        viewFlipper.setFlipInterval(3000);

        viewFlipper.startFlipping();
    }
}