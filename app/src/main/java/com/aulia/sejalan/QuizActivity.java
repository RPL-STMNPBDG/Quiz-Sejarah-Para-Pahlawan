package com.aulia.sejalan;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class QuizActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);
    }

    public void btnBackToMenu(View v) {
        Intent btm = new Intent(QuizActivity.this, MenuActivity.class);
        startActivity(btm);
        finish();
    }

    public void btnLevel1(View v) {
        Intent blv = new Intent(QuizActivity.this, LevelSatuActivity.class);
        startActivity(blv);
        finish();
    }

    public void btnLevel2(View v) {
        Intent blv = new Intent(QuizActivity.this, LevelDuaActivity.class);
        startActivity(blv);
        finish();
    }

    public void btnLevel3(View v) {
        Intent blv = new Intent(QuizActivity.this, LevelTigaActivity.class);
        startActivity(blv);
        finish();
    }
}