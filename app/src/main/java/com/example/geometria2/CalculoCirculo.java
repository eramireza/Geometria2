package com.example.geometria2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class CalculoCirculo extends AppCompatActivity {

    EditText r,r2;
    Button cal,guard;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculo_circulo);

        r = (EditText) findViewById(R.id.txtRadio);
        r2 = (EditText) findViewById(R.id.txtRadio2);
        cal = (Button) findViewById(R.id.btnCalcularC);
        guard = (Button) findViewById(R.id.btnGuardarC);

        cal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calculoC(view);
            }
        });

        guard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                guardarC(view);
            }
        });
    }
    public void calculoC(View v){
        Intent i = new Intent(this, CalculoCirculo.class);
        startActivity(i);
    }
    public void guardarC(View v){
        Intent i = new Intent(this, CalculoCirculo.class);
        startActivity(i);
    }
}