package com.androidapp.hajj;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    public void CITIZEN(View view) {
        Intent Intent = new Intent(this, CitizenLoginActivity.class);
        startActivity(Intent);
    }

    public void HAAJJ(View view) {
        Intent Intent = new Intent(this, HomeActivity.class);
        startActivity(Intent);
    }

}
