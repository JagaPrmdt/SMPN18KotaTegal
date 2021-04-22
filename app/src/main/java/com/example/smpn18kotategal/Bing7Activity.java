package com.example.smpn18kotategal;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;



public class Bing7Activity extends Activity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bing7);
    }

    public void goToSo (View view) {
        goToUrl ( "https://drive.google.com/file/d/15cvvVfLh5DLk2RBtw6KCwqHhQrKSzTol/view?usp=drivesdk");
    }


    private void goToUrl (String url) {
        Uri uriUrl = Uri.parse(url);
        Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uriUrl);
        startActivity(launchBrowser);
    }

}