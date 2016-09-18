package com.matdas.matematikasekolahdasar;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Paint;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class KelasActivity extends AppCompatActivity {

    protected int kelas=0,level;
    protected Button btnkelas1;
    protected Button btnkelas2;
    protected Button btnkelas3;
    protected Button btnkelas4;
    protected Button btnkelas5;
    protected Button btnkelas6;
    SharedPreferences prefs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kelas);
        Bundle bun = getIntent().getExtras();
        final int jenissoal = bun.getInt("jenissoal");
        prefs = getSharedPreferences("sharedpreference", Context.MODE_PRIVATE);
        final Integer cek = prefs.getInt("level",level);
        Toast.makeText(getApplicationContext(),"nilai cek = "+cek,Toast.LENGTH_LONG).show();
        if (jenissoal==1){
            btnkelas1 = (Button) findViewById(R.id.btnkel1);
            btnkelas1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Bundle b = new Bundle();
                    kelas=1;
                    b.putInt("id",kelas);
                    Intent i = new Intent(getApplicationContext(),JenisActivity.class);
                    i.putExtras(b);
                    startActivity(i);
                }
            });
            btnkelas2 = (Button) findViewById(R.id.btnkel2);
            btnkelas2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Bundle b = new Bundle();
                    kelas=2;
                    b.putInt("id",kelas);
                    Intent i = new Intent(getApplicationContext(),JenisActivity.class);
                    i.putExtras(b);
                    startActivity(i);
                }
            });
            btnkelas3 = (Button) findViewById(R.id.btnkel3);
            btnkelas3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Bundle b = new Bundle();
                    kelas=3;
                    b.putInt("id",kelas);
                    Intent i = new Intent(getApplicationContext(),JenisActivity.class);
                    i.putExtras(b);
                    startActivity(i);
                }
            });
            btnkelas4 = (Button) findViewById(R.id.btnkel4);
            btnkelas4.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Bundle b = new Bundle();
                    kelas=4;
                    b.putInt("id",kelas);
                    Intent i = new Intent(getApplicationContext(),JenisActivity.class);
                    i.putExtras(b);
                    startActivity(i);
                }
            });
            btnkelas5 = (Button) findViewById(R.id.btnkel5);
            btnkelas5.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Bundle b = new Bundle();
                    kelas=5;
                    b.putInt("id",kelas);
                    Intent i = new Intent(getApplicationContext(),JenisActivity.class);
                    i.putExtras(b);
                    startActivity(i);
                }
            });
            btnkelas6 = (Button) findViewById(R.id.btnkel6);
            btnkelas6.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Bundle b = new Bundle();
                    kelas=6;
                    b.putInt("id",kelas);
                    Intent i = new Intent(getApplicationContext(),JenisActivity.class);
                    i.putExtras(b);
                    startActivity(i);
                }
            });
        }else if (jenissoal==2){
            btnkelas1 = (Button) findViewById(R.id.btnkel1);
            btnkelas1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Bundle b = new Bundle();
                    kelas=1;
                    b.putInt("id",kelas);
                    Intent i = new Intent(getApplicationContext(),JenisActivity.class);
                    i.putExtras(b);
                    startActivity(i);
                }
            });
            btnkelas2 = (Button) findViewById(R.id.btnkel2);
            if (cek<2) {
                btnkelas2.setPaintFlags(btnkelas2.getPaintFlags() | Paint.STRIKE_THRU_TEXT_FLAG);
                btnkelas2.setEnabled(false);
            }
            btnkelas2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Bundle b = new Bundle();
                    kelas=2;
                    b.putInt("id",kelas);
                    Intent i = new Intent(getApplicationContext(),JenisActivity.class);
                    i.putExtras(b);
                    startActivity(i);
                }
            });
            btnkelas3 = (Button) findViewById(R.id.btnkel3);
            if (cek<3) {
                btnkelas3.setPaintFlags(btnkelas3.getPaintFlags() | Paint.STRIKE_THRU_TEXT_FLAG);
                btnkelas3.setEnabled(false);
            }
            btnkelas3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Bundle b = new Bundle();
                    kelas=3;
                    b.putInt("id",kelas);
                    Intent i = new Intent(getApplicationContext(),JenisActivity.class);
                    i.putExtras(b);
                    startActivity(i);
                }
            });
            btnkelas4 = (Button) findViewById(R.id.btnkel4);
            if (cek<4) {
                btnkelas4.setPaintFlags(btnkelas4.getPaintFlags() | Paint.STRIKE_THRU_TEXT_FLAG);
                btnkelas4.setEnabled(false);
            }
            btnkelas4.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Bundle b = new Bundle();
                    kelas=4;
                    b.putInt("id",kelas);
                    Intent i = new Intent(getApplicationContext(),JenisActivity.class);
                    i.putExtras(b);
                    startActivity(i);
                }
            });
            btnkelas5 = (Button) findViewById(R.id.btnkel5);
            if (cek<5) {
                btnkelas5.setPaintFlags(btnkelas5.getPaintFlags() | Paint.STRIKE_THRU_TEXT_FLAG);
                btnkelas5.setEnabled(false);
            }
            btnkelas5.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Bundle b = new Bundle();
                    kelas=5;
                    b.putInt("id",kelas);
                    Intent i = new Intent(getApplicationContext(),JenisActivity.class);
                    i.putExtras(b);
                    startActivity(i);
                }
            });
            btnkelas6 = (Button) findViewById(R.id.btnkel6);
            if (cek<6) {
                btnkelas6.setPaintFlags(btnkelas6.getPaintFlags() | Paint.STRIKE_THRU_TEXT_FLAG);
                btnkelas6.setEnabled(false);
            }
            btnkelas6.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Bundle b = new Bundle();
                    kelas=6;
                    b.putInt("id",kelas);
                    Intent i = new Intent(getApplicationContext(),JenisActivity.class);
                    i.putExtras(b);
                    startActivity(i);
                    finish();
                }
            });
        }

    }
}
