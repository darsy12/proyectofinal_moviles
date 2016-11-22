package com.example.user.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class ActivitySevasaComputadoras extends AppCompatActivity {
    private ListView listaCompus;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sevasa_computadoras);

        listaCompus = (ListView) findViewById(R.id.lvCompus);

        ActivityComputadoras c1 = new ActivityComputadoras("SEAGATE 500 GB","INTEL i7", "8 GB RAM","$500", R.mipmap.audifonos);


        ArrayList<ActivityComputadoras> listCompus = new ArrayList<ActivityComputadoras>();

        AdapterSevasaCompus adapter = new AdapterSevasaCompus(getApplicationContext(), listCompus);
        listaCompus.setAdapter(adapter);
        listCompus.add(c1);
        /*adapter.add(p2);*/
    }




}
