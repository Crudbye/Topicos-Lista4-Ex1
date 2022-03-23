package com.example.lista4_ex1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class PesoActivity extends AppCompatActivity implements View.OnClickListener {
    private EditText et1;
    private TextView tv;
    private TextView tv2;
    private float resultReal;
    private float resultDolar;
    private double valorPeso;
    private float dolarD;
    private float realD;

    private Button bt1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_peso);

        et1 = (EditText) findViewById(R.id.et1);
        tv = (TextView) findViewById(R.id.tv1);
        tv2 = (TextView) findViewById(R.id.tv2);


        bt1 = (Button) findViewById(R.id.botao);

        if(savedInstanceState!=null){
            dolarD = savedInstanceState.getFloat("us");
            realD = savedInstanceState.getFloat("pss");
            tv.setText("Em Dolar: R$ "+dolarD);
            tv2.setText("Em Real: $ "+realD);
        }
        bt1.setOnClickListener(this);
    }

    protected void onSaveInstanceState(Bundle dados){
        super.onSaveInstanceState(dados);
        dados.putFloat("us", dolarD);
        dados.putFloat("pss", realD);

    }
    public void onClick(View v) {

        if(v.getId() == R.id.botao){

            valorPeso = Double.parseDouble(et1.getText().toString());
            dolarD = (float) (valorPeso*0.024);
            realD = (float) (valorPeso*0.12);
            tv.setText("Em Dolar: $ "+dolarD);
            tv2.setText("Em Real: R$ "+realD);
        }
    }
}