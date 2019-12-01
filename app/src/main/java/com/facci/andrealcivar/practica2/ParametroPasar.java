package com.facci.andrealcivar.practica2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class ParametroPasar extends AppCompatActivity {

    EditText cajaDato;
    Button botonEnviar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_parametro_pasar);
        cajaDato = (EditText) findViewById(R.id.txtParametro);
        botonEnviar = (Button) findViewById(R.id.btnEnviarParametro);
        botonEnviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ParametroPasar.this, ParametroRecibir.class);
                Bundle bundle = new Bundle();
                bundle.putString("dato", cajaDato.getText().toString());
                intent.putExtras(bundle);
                startActivity(intent);
            }
        });

    }
}
