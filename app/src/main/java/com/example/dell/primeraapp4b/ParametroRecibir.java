package com.example.dell.primeraapp4b;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ParametroRecibir extends AppCompatActivity {
    TextView texto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_parametro_recibir);
        texto = (TextView) findViewById(R.id.lblParametro);
        Bundle bundle = this.getIntent().getExtras();
        //texto.setText(savedInstanceState.getString("data"));
        texto.setText(bundle.getString("dato"));
    }
}
