package com.aulia.sejalan;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Pnas7Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pnas7);
    }

    public void btnBackToMenu(View v) {
        Intent btm = new Intent(Pnas7Activity.this, PNasionalActivity.class);
        startActivity(btm);
        finish();
    }
}