package com.androidapp.hajj;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;

public class HomeActivity extends AppCompatActivity {

    String[] locations={"Al-Jumum,Al-Kamil","Al-Khurmah" ,"Al-Lith,Al-Qunfidhah" ,"Ta'if","Jeddah","Khulays","Mecca","Rabigh","Ranyah","Turubah","Adam","Aredaa","Moy","Mesaan","Bahra"};
    String [] food_types={"Drinks","Food"};
    private Spinner sp;
    private Spinner sp2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);


        sp=(Spinner)findViewById(R.id.locationSP);
        SpinnerAdapter adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, locations);
        sp.setAdapter(adapter);
        sp.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }


        });


        sp2 =(Spinner) findViewById(R.id.foodsp);
        SpinnerAdapter adapter2 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, locations);
        sp2.setAdapter(adapter2);
        sp2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }


        });


    }
    public boolean onCreateOptionsMenu(Menu menu)
    {
        MenuInflater mi=getMenuInflater();
        mi.inflate(R.menu.menu,menu);
        return true;
    }

    public void orderService(View view) {
        Intent Intent = new Intent(this, orderActivity.class);
        startActivity(Intent);


    }
    /*

    public boolean onOptionsItemSelected(MenuItem item)
    {

    }*/





}
