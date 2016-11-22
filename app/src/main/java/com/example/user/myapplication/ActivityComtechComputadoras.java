package com.example.user.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class ActivityComtechComputadoras extends AppCompatActivity {
    private ListView listaCompus;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_comtech_computadoras);

        listaCompus = (ListView) findViewById(R.id.lvComPC);
        ActivityComputadoras c1 = new ActivityComputadoras("HDD: 500 GB","INTEL Core-i5", "RAM: 4 GB","$300", R.mipmap.mac);
        //ActivityComputadoras c2 = new ActivityComputadoras("HDD: 1 TB","INTEL Core-i7", "RAM: 8 GB","$400");
        //ActivityComputadoras c3 = new ActivityComputadoras("HDD: 750 GB","INTEL Core-i3", "RAM: 6 GB","$350");

        ArrayList<ActivityComputadoras> listCompus = new ArrayList<ActivityComputadoras>();

        AdapterComtechCompus adapter = new AdapterComtechCompus(getApplicationContext(), listCompus);
        listaCompus.setAdapter(adapter);
        adapter.add(c1);
        //adapter.add(c2);
        //adapter.add(c3);
    }
}

