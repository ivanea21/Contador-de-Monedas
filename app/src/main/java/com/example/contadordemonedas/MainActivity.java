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
    EditText diezcent;
    EditText cincocent;
    EditText doscent;
    EditText uncent;
    TextView mostrar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        cincoeuros = (EditText) findViewById(R.id.cincoeuros);
        doseuros = (EditText) findViewById(R.id.doseuros);
        uneuros = (EditText) findViewById(R.id.uneuros);
        cincuentacent = (EditText) findViewById(R.id.cincuentacent);
        veintecent = (EditText) findViewById(R.id.veintecent);
        diezcent = (EditText) findViewById(R.id.diezcent);
        cincocent = (EditText) findViewById(R.id.cincocent);
        doscent = (EditText) findViewById(R.id.doscent);
        uncent = (EditText) findViewById(R.id.uncent);
        mostrar = (TextView) findViewById(R.id.mostrar);

    }

    public void calcular(View view){
       if(cincoeuros.getText().toString().isEmpty()|| doseuros.getText().toString().isEmpty()||uneuros.getText().toString().isEmpty()||
               cincuentacent.getText().toString().isEmpty()||veintecent.getText().toString().isEmpty()||diezcent.getText().toString().isEmpty()||
               cincocent.getText().toString().isEmpty()||doscent.getText().toString().isEmpty()||uncent.getText().toString().isEmpty()){
           mostrar.setText("Hay uno o más campos vacíos");
       }else{
           int cinco = Integer.parseInt(cincoeuros.getText().toString());
           cinco = cinco * 5;
           int dos = Integer.parseInt(doseuros.getText().toString());
           dos = dos * 2;
           Integer uno = Integer.parseInt(uneuros.getText().toString());
           double cincuenta = Double.parseDouble(cincuentacent.getText().toString());
           cincuenta = cincuenta * 0.50;
           double veinte = Double.parseDouble(veintecent.getText().toString());
           veinte = veinte * 0.20;
           double diez = Double.parseDouble(diezcent.getText().toString());
           diez = diez * 0.10;
           double cincoc = Double.parseDouble(cincocent.getText().toString());
           cincoc = cincoc * 0.05;
           double dosc = Double.parseDouble(doscent.getText().toString());
           dosc = dosc * 0.02;
           double unoc = Double.parseDouble(uncent.getText().toString());
           unoc = unoc * 0.01;


           double operacion = cinco + dos + uno + cincuenta + veinte + diez + cincoc + dosc + unoc;
           operacion = Math.round(operacion * 100) / 100d;
           mostrar.setText("Dinero total: " + operacion + " €");
       }
    }
}
