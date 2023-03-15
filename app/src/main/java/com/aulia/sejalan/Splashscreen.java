package com.aulia.sejalan;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class Splashscreen extends Activity {
    //Set waktu lama splash screen
    private static int splashInterval = 2000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splashscreen);

        //Get the view from splash.xml
        setContentView(R.layout.splashscreen);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent i = new Intent(Splashscreen.this, MenuActivity.class);
                startActivity(i);

                //Close SplashScreen.class
                finish();
            }
        }, splashInterval);
    }
}