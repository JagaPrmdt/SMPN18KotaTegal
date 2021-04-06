package com.example.smpn18kotategal;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class Pkn8Activity extends AppCompatActivity {
    private PDFView pdfView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pkn8);


        pdfView =(PDFView) findViewById(R.id.pdfView);

        pdfView.fromAsset("pkn8.pdf").load();
    }
}