package com.example.smpn18kotategal;


import com.github.barteksc.pdfviewer.PDFView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;

import com.github.barteksc.pdfviewer.PDFView;



public class ProfilActivity extends AppCompatActivity {
    private PDFView pdfView;


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profil);

        pdfView =(PDFView) findViewById(R.id.pdfView);

        pdfView.fromAsset("profil.18baru18.pdf").load();



    }

}