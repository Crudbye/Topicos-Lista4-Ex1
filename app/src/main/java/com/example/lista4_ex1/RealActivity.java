package com.example.lista4_ex1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class RealActivity extends AppCompatActivity implements View.OnClickListener{
    private EditText et1;
    private TextView tv;
    private TextView tv2;
    private float resultPeso;
    private float resultDolar;
    private double valorReal;
    private float dolarD;
    private float pesoD;

    private Button bt1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_real);

        et1 = (EditText) findViewById(R.id.et1);
        tv = (TextView) findViewById(R.id.tv1);
        tv2 = (TextView) findViewById(R.id.tv2);


        bt1 = (Button) findViewById(R.id.botao);

        if(savedInstanceState!=null){
            dolarD = savedInstanceState.getFloat("us");
            pesoD = savedInstanceState.getFloat("pss");
            tv.setText("Em Dolar: R$ "+dolarD);
            tv2.setText("Em Peso: $ "+pesoD);
        }
        bt1.setOnClickListener(this);
    }

    protected void onSaveInstanceState(Bundle dados){
        super.onSaveInstanceState(dados);
        dados.putFloat("us", dolarD);
        dados.putFloat("pss", pesoD);

    }
    public void onClick(View v) {

        if(v.getId() == R.id.botao){

            valorReal = Double.parseDouble(et1.getText().toString());
            dolarD = (float) (valorReal*0.21);
            pesoD = (float) (valorReal*8.79);
            tv.setText("Em Dolar: $ "+dolarD);
            tv2.setText("Em Peso: R$ "+pesoD);
        }
    }
}