package com.androidapp.hajj;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import java.util.Timer;
import java.util.TimerTask;

public class logoPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_logo_page);

        new Timer().schedule(new TimerTask(){
            public void run() {
                logoPage.this.runOnUiThread(new Runnable() {
                    public void run() {
                        startActivity(new Intent(logoPage.this, MainActivity.class));
                    }
                });
            }
        }, 3000);
    }
}
