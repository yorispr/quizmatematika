package com.matdas.matematikasekolahdasar;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

public class MateriGambarActivity extends AppCompatActivity {

    protected ImageView imgview;
    protected TextView txtjudul;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_materi_gambar);
        Bundle bun = getIntent().getExtras();
        final String jdl = bun.getString("judul");
        final String URL_gambar =bun.getString("berkas2");
        imgview = (ImageView) findViewById(R.id.imgviewSoal) ;
        txtjudul = (TextView) findViewById(R.id.txtjudulgambar);
//        new DownloadImageTask((ImageView) findViewById(R.id.imgviewSoal))
//                .execute(URL_gambar);
        txtjudul.setText(jdl);
        Picasso.with(this)
                .load(URL_gambar)
                .placeholder(R.drawable.placeholder)   // optional
                .error(R.drawable.error)      // optional
                .resize(400,400)                        // optional
                .into(imgview);
    }

//    private class DownloadImageTask extends AsyncTask<String, Void, Bitmap> {
//        ImageView bmImage;
//
//        public DownloadImageTask(ImageView bmImage) {
//            this.bmImage = bmImage;
//        }
//
//        protected Bitmap doInBackground(String... urls) {
//            String urldisplay = urls[0];
//            Bitmap mIcon11 = null;
//            try {
//                InputStream in = new java.net.URL(urldisplay).openStream();
//                mIcon11 = BitmapFactory.decodeStream(in);
//            } catch (Exception e) {
//                Log.e("Error", e.getMessage());
//                e.printStackTrace();
//            }
//            return mIcon11;
//        }
//
//        protected void onPostExecute(Bitmap result) {
//            bmImage.setImageBitmap(result);
//        }
//    }
}
