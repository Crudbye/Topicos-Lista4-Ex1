package com.example.lista4_ex1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.google.android.material.textfield.TextInputEditText;

public class DolarActivity extends AppCompatActivity implements View.OnClickListener{
    private EditText et1;
    private TextView tv1;
    private TextView tv2;
    private float resultPeso;
    private float resultReal;
    private double valorDolar;
    private float reaisD;
    private float pesoD;

    private Button bt1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dolar);

        et1 = (EditText) findViewById(R.id.et1);
        tv1 = (TextView) findViewById(R.id.tv1);
        tv2 = (TextView) findViewById(R.id.tv2);


        bt1 = (Button) findViewById(R.id.botao);

        if(savedInstanceState!=null){
            reaisD = savedInstanceState.getFloat("us");
            pesoD = savedInstanceState.getFloat("pss");
            tv1.setText("Em Peso: $ "+pesoD);
            tv2.setText("Em Reais: R$ "+reaisD);
        }

        bt1.setOnClickListener(this);
    }

    protected void onSaveInstanceState(Bundle dados){
        super.onSaveInstanceState(dados);
        dados.putFloat("us", reaisD);
        dados.putFloat("pss", pesoD);
    }
    public void onClick(View v) {

        if(v.getId() == R.id.botao){

            valorDolar = Double.parseDouble(et1.getText().toString());
            pesoD = (float) (valorDolar*42.65);
            reaisD = (float) (valorDolar*5.02);
            tv1.setText("Em Peso: $ "+pesoD);
            tv2.setText("Em Reais: R$ "+reaisD);
        }
    }
}