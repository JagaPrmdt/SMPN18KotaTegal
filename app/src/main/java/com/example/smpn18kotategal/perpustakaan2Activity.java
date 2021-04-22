package com.example.smpn18kotategal;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;



public class perpustakaan2Activity extends Activity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_perpustakaan2);
    }

    public void mtk7(View view) {
        goToUrl ( "https://drive.google.com/file/d/16mQx-I9iE34ZlY0o1uHMHC4dw7l8lOHa/view?usp=drivesdk");
    }
    public void bind7(View view) {
        goToUrl ( "https://drive.google.com/file/d/16mQx-I9iE34ZlY0o1uHMHC4dw7l8lOHa/view?usp=drivesdk");
    }
    public void bing7(View view) {
        goToUrl ( "https://drive.google.com/file/d/16mQx-I9iE34ZlY0o1uHMHC4dw7l8lOHa/view?usp=drivesdk");
    }
    public void ipa7(View view) {
        goToUrl ( "https://drive.google.com/file/d/16mQx-I9iE34ZlY0o1uHMHC4dw7l8lOHa/view?usp=drivesdk");
    }
    public void ips7(View view) {
        goToUrl ( "https://drive.google.com/file/d/16mQx-I9iE34ZlY0o1uHMHC4dw7l8lOHa/view?usp=drivesdk");
    }
    public void pai7(View view) {
        goToUrl ( "https://drive.google.com/file/d/16mQx-I9iE34ZlY0o1uHMHC4dw7l8lOHa/view?usp=drivesdk");
    }
    public void bjawa7(View view) {
        goToUrl ( "https://drive.google.com/file/d/16mQx-I9iE34ZlY0o1uHMHC4dw7l8lOHa/view?usp=drivesdk");
    }
    public void pjok7(View view) {
        goToUrl ( "https://drive.google.com/file/d/16mQx-I9iE34ZlY0o1uHMHC4dw7l8lOHa/view?usp=drivesdk");
    }
    public void pkn7(View view) {
        goToUrl ( "https://drive.google.com/file/d/16mQx-I9iE34ZlY0o1uHMHC4dw7l8lOHa/view?usp=drivesdk");
    }
    public void prakarya7(View view) {
        goToUrl ( "https://drive.google.com/file/d/16mQx-I9iE34ZlY0o1uHMHC4dw7l8lOHa/view?usp=drivesdk");
    }
    public void sby7(View view) {
        goToUrl ( "https://drive.google.com/file/d/16mQx-I9iE34ZlY0o1uHMHC4dw7l8lOHa/view?usp=drivesdk");
    }



    private void goToUrl (String url) {
        Uri uriUrl = Uri.parse(url);
        Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uriUrl);
        startActivity(launchBrowser);
    }

}