package com.matdas.matematikasekolahdasar;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button btnbljr,btnlat,btnsetting;
    protected int jenissoal,level;
    SharedPreferences prefs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        prefs = getSharedPreferences("sharedpreference", Context.MODE_PRIVATE);
        final Integer cek = prefs.getInt("level",level);

        btnbljr = (Button) findViewById(R.id.btn_bljar);
        btnbljr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Bundle b = new Bundle();
                jenissoal=1;
                b.putInt("jenissoal",jenissoal);
                Intent i = new Intent(getApplicationContext(),KelasActivity.class);
                i.putExtras(b);
                startActivity(i);
            }
        });

        btnlat = (Button) findViewById(R.id.btn_latihan);
        btnlat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Bundle b = new Bundle();
                jenissoal=2;
                b.putInt("jenissoal",jenissoal);
                Intent i = new Intent(getApplicationContext(),KelasActivity.class);
                i.putExtras(b);
                startActivity(i);


            }
        });

        btnsetting = (Button) findViewById(R.id.btn_setting);
        btnsetting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(v.getContext(),SettingsActivity.class));
            }
        });
    }

}

