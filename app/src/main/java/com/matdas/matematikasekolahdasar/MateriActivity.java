package com.matdas.matematikasekolahdasar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class MateriActivity extends AppCompatActivity {
    protected Button btnnext;
    protected Button btnsound;
    protected TextView txtjudul;
    protected TextView txtsoal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_materi);
        Bundle bun = getIntent().getExtras();
        final String jdl = bun.getString("judul");
        final String pmbhsan = bun.getString("pembahasan");

        txtjudul = (TextView) findViewById(R.id.txtjudulsoal);
        txtsoal = (TextView) findViewById(R.id.txtsoalpembahasan);

        txtjudul.setText(jdl);
        txtsoal.setText(pmbhsan);
    }
}
