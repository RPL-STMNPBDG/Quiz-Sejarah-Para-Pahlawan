package com.aulia.sejalan;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Pnas8Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pnas8);
    }

    public void btnBackToMenu(View v) {
        Intent btm = new Intent(Pnas8Activity.this, PNasionalActivity.class);
        startActivity(btm);
        finish();
    }
}