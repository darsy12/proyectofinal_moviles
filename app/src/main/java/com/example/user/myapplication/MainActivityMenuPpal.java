package com.example.user.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivityMenuPpal extends AppCompatActivity {


// declaramos un boton
    Button irTiendaS;

    // declaramos un boton
    Button irTiendaC;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu_ppal);

        //asignamos a la variable de tipo botón el boton que tiene el id button3
        irTiendaS =(Button)findViewById(R.id.button3);

        //asignamos a la variable de tipo botón el boton que tiene el id button3
        irTiendaC =(Button)findViewById(R.id.button4);


        // le asiganmos el evento de tipo clickListener a nuestro botón
        irTiendaS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent irTiendaS = new Intent(MainActivityMenuPpal.this, ActivityTiendaSevasa.class);

                startActivity(irTiendaS);
            }
        });


        irTiendaC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent irTiendaC = new Intent(MainActivityMenuPpal.this, ActivityTienda_Comtech.class);

                startActivity(irTiendaC);

            }
        });
    }
}
