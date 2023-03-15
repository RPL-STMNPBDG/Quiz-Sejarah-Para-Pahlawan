package com.aulia.sejalan;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
    }

    public void btnInfo(View v) {
        Intent i = new Intent(MenuActivity.this, InfoActivity.class);
        startActivity(i);
        finish();
    }

    public void btnLogout(View v) {
        new AlertDialog.Builder(this)
                .setIcon(R.mipmap.icon)
                .setTitle(R.string.app_name)
                .setMessage("Apakah Kamu Yakin?")
                .setPositiveButton("YA", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                finish();
            }
        })
                .setNegativeButton("TIDAK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();
            }
        })
        .show();
    }

    public void btnPNasional(View v) {
        Intent pnas = new Intent(MenuActivity.this, PNasionalActivity.class);
        startActivity(pnas);
        finish();
    }

    public void btnQuiz(View v) {
        Intent q = new Intent(MenuActivity.this, QuizActivity.class);
        startActivity(q);
        finish();
    }

    public void btnPRevolusi(View v) {
        Intent prev = new Intent(MenuActivity.this, PRevolusiActivity.class);
        startActivity(prev);
        finish();
    }
}