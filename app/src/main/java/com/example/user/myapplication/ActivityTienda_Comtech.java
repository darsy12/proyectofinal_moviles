package com.example.user.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ActivityTienda_Comtech extends AppCompatActivity {
 Button irCompus;
    Button irZonaGamer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tienda_comtech);

        //asignamos a la variable de tipo botón el boton que tiene el id button3
        irCompus =(Button)findViewById(R.id.botonCompu);

        irCompus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent irCompus = new Intent(ActivityTienda_Comtech.this, ActivityComtechComputadoras.class);
                startActivity(irCompus);
            }
        });


        irZonaGamer = (Button)findViewById(R.id.button7);

        irZonaGamer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent irZonaGamer = new Intent(ActivityTienda_Comtech.this,ActivityPantalla_ZonaGamer.class);
                startActivity(irZonaGamer);
            }
        });

    }
}
