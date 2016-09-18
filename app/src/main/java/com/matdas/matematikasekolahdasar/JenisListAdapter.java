package com.matdas.matematikasekolahdasar;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by VAPN on 9/8/2016.
 */
public class JenisListAdapter extends ArrayAdapter<Mbelajar>{
    Context context;
    int resLayout;
    List<Mbelajar> listBelajar;
    public JenisListAdapter(Context context,int reslayout,List<Mbelajar> listBelajar){
        super(context,reslayout,listBelajar);
        this.context=context;
        this.resLayout=reslayout;
        this.listBelajar=listBelajar;
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View v = View.inflate(context,resLayout,null);
        final TextView tvJenisSoal = (TextView) v.findViewById(R.id.tvJenisSoal);

        tvJenisSoal.setText(listBelajar.get(position).getJudul());

        return v;
    }

}
