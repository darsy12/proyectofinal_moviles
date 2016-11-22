package com.example.user.myapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Mariord on 18/11/2016.
 */
public class AdapterSevasaCompus extends ArrayAdapter<ActivityComputadoras> {
    List<ActivityComputadoras> sevCompus;
    public AdapterSevasaCompus(Context context, List<ActivityComputadoras> objects) {
        super(context, 0, objects);
        this.sevCompus = objects;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.activity_adapter_comp, parent, false);
        }

        TextView discoDuro = (TextView) convertView.findViewById(R.id.tvDiscoDuro);
        TextView procesador = (TextView) convertView.findViewById(R.id.tvProcesador);
        TextView memRam = (TextView) convertView.findViewById((R.id.tvRam));
        TextView precio = (TextView) convertView.findViewById((R.id.tvPrecio));
        ImageView imagen = (ImageView) convertView.findViewById(R.id.imgPC);


        ActivityComputadoras compus = sevCompus.get(position);

        discoDuro.setText(compus.getDiscoduro());
        procesador.setText(compus.getProcesador());
        memRam.setText(compus.getRam());
        procesador.setText(compus.getProcesador());
        imagen.setImageResource(compus.getImg());

        return convertView;
    }
}
