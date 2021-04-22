package com.example.smpn18kotategal;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;



public class PerpustakaanActivity extends Activity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_perpustakaan);
    }

    public void mtk7(View view) {
        goToUrl ( "https://drive.google.com/file/d/16mQx-I9iE34ZlY0o1uHMHC4dw7l8lOHa/view?usp=drivesdk");
    }
    public void bind7(View view) {
        goToUrl ( "https://drive.google.com/file/d/16m3EWThNArPwNyNO5vaRb3lUxalWmC0o/view?usp=drivesdk");
    }
    public void bing7(View view) {
        goToUrl ( "https://drive.google.com/file/d/16bDQa-mUBRGmsqCMvRq8sWSH6pnXrkpi/view?usp=drivesdk");
    }
    public void ipa7(View view) {
        goToUrl ( "https://drive.google.com/file/d/16gfw6980qcWdt11UpQk4vhZ3YZZ-kZ9e/view?usp=drivesdk");
    }
    public void ips7(View view) {
        goToUrl ( "https://drive.google.com/file/d/16lcWHgZxprzTB1U_YLL0otqIgFTO4aWW/view?usp=drivesdk");
    }
    public void pai7(View view) {
        goToUrl ( "https://drive.google.com/file/d/16w1R2wQtETy34yzLGNVzCYGn4fDeURcK/view?usp=drivesdk");
    }
    public void bjawa7(View view) {
        goToUrl ( "https://drive.google.com/file/d/16fGH77WUyGSkTyviPY7NgRDgshK5RdbU/view?usp=drivesdk");
    }
    public void pjok7(View view) {
        goToUrl ( "https://drive.google.com/file/d/17-3dz4Ie84IpZTd7nnVxneIeu_B6vGkT/view?usp=drivesdk");
    }
    public void pkn7(View view) {
        goToUrl ( "https://drive.google.com/file/d/172x-3h2ZuAP-f5swdBJlo_RtdRHde-vB/view?usp=drivesdk");
    }
    public void prakarya7(View view) {
        goToUrl ( "https://drive.google.com/file/d/177fAERnbPEbtMccHclQHDZjI-CdQ2Ztf/view?usp=drivesdk");
    }
    public void sby7(View view) {
        goToUrl ( "https://drive.google.com/file/d/179jdo9TtKF1YEZoKZiMZzbseTuJ0RIFO/view?usp=drivesdk");
    }



    private void goToUrl (String url) {
        Uri uriUrl = Uri.parse(url);
        Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uriUrl);
        startActivity(launchBrowser);
    }

}