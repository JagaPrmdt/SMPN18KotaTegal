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
        goToUrl ( "https://drive.google.com/file/d/17zaH5O0YRtMNueKxCKeNv2U1_An7QOiK/view?usp=drivesdk");
    }
    public void bind7(View view) {
        goToUrl ( "https://drive.google.com/file/d/17i5FpSXODOm_j3SBltygrub5mRmlCLS1/view?usp=drivesdk");
    }
    public void bing7(View view) {
        goToUrl ( "https://drive.google.com/file/d/17ohLAJooXRxPksCppQPFyVcmzS0v64xS/view?usp=drivesdk");
    }
    public void ipa7(View view) {
        goToUrl ( "https://drive.google.com/file/d/17uze9pGnJsaYUJ3hetfvG_R0DU1myQ3u/view?usp=drivesdk");
    }
    public void ips7(View view) {
        goToUrl ( "https://drive.google.com/file/d/17y14veRNcADUQxdZ_gvCG7PJcsrLXuiZ/view?usp=drivesdk");
    }
    public void pai7(View view) {
        goToUrl ( "https://drive.google.com/file/d/1815uJ2k62PjcoX82ZuR4yOXgm1wLIhv4/view?usp=drivesdk");
    }
    public void bjawa7(View view) {
        goToUrl ( "https://drive.google.com/file/d/17ueAz3WJVGUwWS_9ey68c4SobJtRfBGO/view?usp=drivesdk");
    }
    public void pjok7(View view) {
        goToUrl ( "https://drive.google.com/file/d/18EGvQ1hc-7k1xv4cTQy-J7shYT5Vvip3/view?usp=drivesdk");
    }
    public void pkn7(View view) {
        goToUrl ( "https://drive.google.com/file/d/185Pq036qUa9ew6CIYJN1R7SxArpT7jr1/view?usp=drivesdk");
    }
    public void prakarya7(View view) {
        goToUrl ( "https://drive.google.com/file/d/189lG0zwvCNuTnRiyKQPl-9JY_em4tojb/view?usp=drivesdk");
    }
    public void sby7(View view) {
        goToUrl ( "https://drive.google.com/file/d/18BSReGfVIiNrqIbV202SUemUERzDHVi1/view?usp=drivesdk");
    }



    private void goToUrl (String url) {
        Uri uriUrl = Uri.parse(url);
        Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uriUrl);
        startActivity(launchBrowser);
    }

}