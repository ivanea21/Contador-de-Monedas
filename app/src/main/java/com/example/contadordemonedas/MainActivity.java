package com.example.contadordemonedas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    EditText cincoeuros;
    EditText doseuros;
    EditText uneuros;
    EditText cincuentacent;
    EditText veintecent;


    TextView mostrar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        cincoeuros = (EditText) findViewById(R.id.cincoeuros);
        doseuros = (EditText) findViewById(R.id.doseuros);
        uneuros = (EditText) findViewById(R.id.uneuros);
        cincuentacent = (EditText) findViewById(R.id.cincuentacent);
        mostrar = (TextView) findViewById(R.id.mostrar);

    }

    public void calcular(View view){
        //int operacion = Integer.parseInt(cincoeuros.getText().toString()) + Integer.parseInt(doseuros.getText().toString());
        int cinco = Integer.parseInt(cincoeuros.getText().toString());
        cinco = cinco * 5;
        double dos = Double.parseDouble(doseuros.getText().toString());
        dos = dos * 2;
        double uno = Double.parseDouble(uneuros.getText().toString());
        double cincuenta = Double.parseDouble(cincuentacent.getText().toString());
        cincuenta = cincuenta * 0.50;



        double operacion = cinco + dos + uno + cincuenta;
        mostrar.setText("EL NUMERO ES " + operacion);
    }
}
