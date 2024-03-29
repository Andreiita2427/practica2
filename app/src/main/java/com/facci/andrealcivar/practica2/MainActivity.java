package com.facci.andrealcivar.practica2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button buttonLogin, buttonBuscar, buttonGuardar, botonParametro;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    buttonLogin= (Button) findViewById(R.id.buttonLogin);
    buttonBuscar= (Button) findViewById(R.id.buttonBuscar);
    buttonGuardar= (Button) findViewById(R.id.buttonGuardar);
    botonParametro=(Button)  findViewById(R.id.btnPasarParametro);

    botonParametro.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = new  Intent (MainActivity.this, ParametroPasar.class);
            startActivity(intent);

        }
    });

    buttonLogin.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent(
                    MainActivity.this, ActivityLogin.class);
            startActivity(intent);
        }
    });

    buttonBuscar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(
                        MainActivity.this, ActivityBuscar.class);
                startActivity(intent);
            }
    });

    buttonGuardar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(
                        MainActivity.this, ActivityRegistrar.class);
                startActivity(intent);
            }
    });


    }

}



















