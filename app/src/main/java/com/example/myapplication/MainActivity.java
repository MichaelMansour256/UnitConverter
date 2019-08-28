package com.example.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {

    ///Button temp = findViewById(R.id.b_temp);
    ///Button time = findViewById(R.id.b_time);
    ///Button weight = findViewById(R.id.b_weight);
    ///Button len = findViewById(R.id.b_len);
    ///Button curr = findViewById(R.id.b_curr);
    ///Button vol = findViewById(R.id.b_vol);
    ///Button speed = findViewById(R.id.b_speed);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button temp = findViewById(R.id.b_temp);
        Button time = findViewById(R.id.b_time);
        Button weight = findViewById(R.id.b_weight);
        Button len = findViewById(R.id.b_len);
        Button curr = findViewById(R.id.b_curr);
        Button vol = findViewById(R.id.b_vol);
        Button speed = findViewById(R.id.b_speed);

        temp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ///System.out.println("lllllllllll");
                Intent itemp = new Intent(getApplicationContext(),Temperature.class);
                startActivity(itemp);
            }
        });

        weight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent iw = new Intent(getApplicationContext(),Weight.class);
                startActivity(iw);
            }
        });

        curr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent icurr = new Intent(getApplicationContext(),currency.class);
                startActivity(icurr);
            }
        });

        speed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent isp = new Intent(getApplicationContext(),speed.class);
                startActivity(isp);
            }
        });

        time.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent itime = new Intent(getApplicationContext(),timeZone.class);
                startActivity(itime);
            }
        });

        vol.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ivol = new Intent(getApplicationContext(),volume.class);
                startActivity(ivol);
            }
        });

        len.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ilen = new Intent(getApplicationContext(),Length.class);
                startActivity(ilen);
            }
        });
    }


}
