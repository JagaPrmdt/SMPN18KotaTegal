package com.example.smpn18kotategal;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;



public class perpustakaan3Activity extends Activity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_perpustakaan3);
    }

    public void mtk7(View view) {
        goToUrl ( "https://drive.google.com/file/d/1Qhs8-9NdqdVg1KEXb61lytUv4-0l5gVD/view?usp=drivesdk");
    }
    public void bind7(View view) {
        goToUrl ( "https://drive.google.com/file/d/1imVMpCoi20ikyu0jYEF8Kfw_oVRIKlC3/view?usp=drivesdk");
    }
    public void bing7(View view) {
        goToUrl ( "https://drive.google.com/file/d/1unp_yMK-Zu0UmQrZxeFDopufq60DtOGv/view?usp=drivesdk");
    }
    public void ipa7(View view) {
        goToUrl ( "https://drive.google.com/file/d/16NRxos4CqKzcPCHn3qz8NNGfyXBDx-Qy/view?usp=drivesdk");
    }
    public void ips7(View view) {
        goToUrl ( "https://drive.google.com/file/d/1BcCkP1Oa3H4Y39U-J-Ye6davpG6UU-rb/view?usp=drivesdk");
    }
    public void pai7(View view) {
        goToUrl ( "https://drive.google.com/file/d/1MS4RFPFf64LjM1GaMkLcCuOslhecBIBA/view?usp=drivesdk");
    }
    public void bjawa7(View view) {
        goToUrl ( "https://drive.google.com/file/d/1yphcK8em2zo7I-16X-k3HRPQMp-qXc_h/view?usp=drivesdk");
    }
    public void pjok7(View view) {
        goToUrl ( "https://drive.google.com/file/d/1N-rYhYjn6acygM5o7wwDvM1AcOIM6_Dy/view?usp=drivesdk");
    }
    public void pkn7(View view) {
        goToUrl ( "https://drive.google.com/file/d/1sj_Jk-ga7KudfxSD6yT14KDHogMyPFBL/view?usp=drivesdk");
    }
    public void prakarya7(View view) {
        goToUrl ( "https://drive.google.com/file/d/1GMRMmLsVNVxwt0wf1NgZAQVL9R7Y-PXn/view?usp=drivesdk");
    }
    public void sby7(View view) {
        goToUrl ( "https://drive.google.com/file/d/1PY27r3uSKORYtNoBnNTF3e_uyHK5BNUD/view?usp=drivesdk");
    }



    private void goToUrl (String url) {
        Uri uriUrl = Uri.parse(url);
        Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uriUrl);
        startActivity(launchBrowser);
    }

}