package com.example.geometria2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button circ;
    Button rect;
    Button trian;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        circ = (Button) findViewById(R.id.btnCirculo);
        rect = (Button) findViewById(R.id.btnRectangulo);
        trian = (Button) findViewById(R.id.btnTriangulo);

        circ.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                circu(view);
            }
        });
    }

    public void circu(View v)
    {
        Intent i = new Intent(this, CalculoCirculo.class);
        startActivity(i);
    }
}