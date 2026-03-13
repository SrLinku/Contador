package com.lincoln.contador;


import android.graphics.Color;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    //Define as variaveis globais (objetos de tela)
    private int contador = 0;
    private TextView tvContador;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Vincula os componentes XML com Java

        tvContador = findViewById(R.id.tvContador);
        Button btnInc = findViewById(R.id.btnIncrementar);
        Button btnDnc = findViewById(R.id.btnDecrementar);


        // Evento de click para encrementar

        btnInc.setOnClickListener(v -> {
            contador++;
            atualizarInterface();
        });

        //Evento de click para decrementar

        btnDnc.setOnClickListener(v -> {
            if (contador > 0) {
                contador--;
                atualizarInterface();
            }
        });

    }

    private void atualizarInterface() {
        tvContador.setText(String.valueOf(contador));

        //Mudar cor ao atingir a meta
        if (contador > 10 && contador <= 20) {
            tvContador.setTextColor(Color.RED);
        } else if (contador >= 20) {
            tvContador.setTextColor(Color.BLUE);
        } else {
            tvContador.setTextColor(Color.BLACK);
        }
    }
}