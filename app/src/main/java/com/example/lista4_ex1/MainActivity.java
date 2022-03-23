package com.example.lista4_ex1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    private Button real;
    private Button peso;
    private Button dolar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        real = (Button) findViewById(R.id.real);
        peso = (Button) findViewById(R.id.peso);
        dolar = (Button) findViewById(R.id.dolar);

        real.setOnClickListener(this);
        peso.setOnClickListener(this);
        dolar.setOnClickListener(this);
        }

    @Override
    public void onClick(View view) {
            if(view.getId()==R.id.real){
                Intent intent = new Intent(this, RealActivity.class);
                startActivity(intent);
            } else if(view.getId()==R.id.peso){
                Intent intent = new Intent(this, PesoActivity.class);
                startActivity(intent);
        }else if(view.getId()==R.id.dolar){
                Intent intent = new Intent(this, DolarActivity.class);
                startActivity(intent);
            }
            }
    }