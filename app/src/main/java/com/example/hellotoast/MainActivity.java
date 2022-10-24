package com.example.hellotoast;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int contador;
    Button boton1,boton2;
    TextView mostrador;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        contador = 0;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        boton1 = findViewById(R.id.button1);
        boton2 = findViewById(R.id.button2);
        boton1.setOnClickListener(view -> {
            contador = 0;
            mostrador.setText(Integer.toString(contador));
        });
        boton2.setOnClickListener(view -> {
            contador++;
            mostrador.setText(Integer.toString(contador));
        });
        mostrador = findViewById(R.id.textView);


    }

}