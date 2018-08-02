package com.androidapp.hajj;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class citizenSignup extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_citizen_signup);




    }
    public void signUpAction(View view) {


        Intent Intent = new Intent(this, HomeActivity.class);
        startActivity(Intent);
    }
}
