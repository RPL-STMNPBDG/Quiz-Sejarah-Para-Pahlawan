package com.aulia.sejalan;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Prev9Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prev9);
    }

    public void btnBackToMenu(View v) {
        Intent btm = new Intent(Prev9Activity.this, PRevolusiActivity.class);
        startActivity(btm);
        finish();
    }
}