package com.matdas.matematikasekolahdasar;

import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

import org.apache.http.NameValuePair;
import org.apache.http.message.BasicNameValuePair;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

public class JenisActivity extends AppCompatActivity {

    JSONParser jParser = new JSONParser();
    ArrayList<Mbelajar> jenissoal = new ArrayList<>();
    JSONArray names = null;
    JSONObject names2 = null;
    JenisListAdapter jenisAdapter;
    private TextView tvKelas;
    private ListView listJenisSoal;
    private static final String TAG_PESAN = "message";
    private static final String TAG_HASIL = "result";
    private static final String TAG_id = "id_belajar";
    private static final String TAG_kelas = "kelas";
    private static final String TAG_judul = "judul";
    private static final String TAG_pembahasan = "pembahasan";
    private static final String TAG_berkas1 = "berkas_1";
    private static final String TAG_berkas2 = "berkas_2";
    private static final String TAG_tipe= "tipe";
    private static final String URL_JenisSoal ="http://kspsidayu.com/matdis/service/getsoalbykelas.php";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jenissoal);
        Bundle bun = getIntent().getExtras();
        final int kelas = bun.getInt("id");
        tvKelas = (TextView) findViewById(R.id.tvkelas);
        listJenisSoal = (ListView) findViewById(R.id.listViewJenisSoal);
        if (kelas >0 && kelas <7){
            tvKelas.setText("Kelas "+kelas);
        }else {
            tvKelas.setText("Kelas Kosong");
        }
        new AmbilDataSoal(kelas).execute();

        jenisAdapter = new JenisListAdapter(getApplicationContext(),R.layout.inflate_jenissoal,jenissoal);
        listJenisSoal.setAdapter(jenisAdapter);

        listJenisSoal.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Mbelajar selectmateri = (Mbelajar) parent.getItemAtPosition(position);
                Bundle b = new Bundle();
                b.putString("judul",selectmateri.getJudul());
                if (selectmateri.getBerkas1().equals("kosong") && selectmateri.getBerkas2().equals("kosong")){
                    b.putString("pembahasan",selectmateri.getPembahasan());
                    Intent i = new Intent(getApplicationContext(),MateriActivity.class);
                    i.putExtras(b);
                    startActivity(i);
                }else if (selectmateri.getBerkas1().equals("kosong")&&!selectmateri.getBerkas2().equals("kosong")){
                    b.putString("berkas2",selectmateri.getBerkas2());
                    Intent i = new Intent(getApplicationContext(),MateriGambarActivity.class);
                    i.putExtras(b);
                    startActivity(i);
                }else if (!selectmateri.getBerkas1().equals("kosong")&&selectmateri.getBerkas2().equals("kosong")) {
                    b.putString("berkas1", selectmateri.getBerkas1());
                    Intent i = new Intent(getApplicationContext(), MateriVideoActivity.class);
                    i.putExtras(b);
                    startActivity(i);
                }else {
                    b.putString("pembahasan", selectmateri.getJudul());
                    Intent i = new Intent(getApplicationContext(), MateriActivity.class);
                    i.putExtras(b);
                    startActivity(i);
                }
            }
        });
    }

    class AmbilDataSoal extends AsyncTask<String,String,String> {
        int sukses = 0;
        int kelas;

        public AmbilDataSoal(int kelas) {
            this.kelas = kelas;


        }

        @Override
        protected void onPreExecute() {
            super.onPreExecute();
        }

        @Override
        protected String doInBackground(String... args) {
            List<NameValuePair> params = new ArrayList<NameValuePair>();
            params.add(new BasicNameValuePair("kelas", String.valueOf(kelas)));
            try {
                JSONObject json = jParser.makeHttpRequest(URL_JenisSoal, "GET", params);
                if (json != null) {
                    sukses = json.getInt(TAG_PESAN);

                    if (sukses == 1) {
                        Log.d("Semua Nama: ", json.toString());
                        names = json.getJSONArray(TAG_HASIL);
                    }
                }
            } catch (JSONException e) {
                e.printStackTrace();
            }
            return null;
        }

        @Override
        protected void onPostExecute(String s) {
            try {
                    for (int i = 0; i < names.length(); i++) {
                        JSONObject c = names.getJSONObject(i);

                        final String id = c.getString(TAG_id);
                        final String kelas = c.getString(TAG_kelas);
                        final String judul = c.getString(TAG_judul);
                        final String pembahasan = c.getString(TAG_pembahasan);
                        final String berkas1 = c.getString(TAG_berkas1);
                        final String berkas2 = c.getString(TAG_berkas2);
                        final String tipe = c.getString(TAG_tipe);
//                        Toast.makeText(getApplicationContext(),c.getString(TAG_judul), Toast.LENGTH_LONG).show();
                        Mbelajar a = new Mbelajar(id, kelas, judul, pembahasan, berkas1, berkas2, tipe);
                        jenissoal.add(a);

                    }
                jenisAdapter.notifyDataSetChanged();
            }
            catch(Exception ex) {
                ex.printStackTrace();
            }

        }
    }
}
