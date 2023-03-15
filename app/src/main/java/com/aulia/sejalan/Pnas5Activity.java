package com.aulia.sejalan;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Pnas5Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pnas5);
    }

    public void btnBackToMenu(View v) {
        Intent btm = new Intent(Pnas5Activity.this, PNasionalActivity.class);
        startActivity(btm);
        finish();
    }
}