package com.example.geometria2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Guardar extends AppCompatActivity {

    EditText nombre,tipo,rad,rad2,area;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_guardar);

        nombre = (EditText) findViewById(R.id.txtProyecto);
        tipo = (EditText) findViewById(R.id.txtTipo);
        rad = (EditText) findViewById(R.id.txtR);
        rad2 = (EditText) findViewById(R.id.txtR2);
        area = (EditText) findViewById(R.id.txtArea);
    }

    public void ingresar(View view){

            Toast.makeText(this, "Guardado", Toast.LENGTH_LONG).show();

            Toast.makeText(this, "Complete los campos", Toast.LENGTH_LONG).show();


    }

}
