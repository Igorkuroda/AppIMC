package com.example.appimc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class IdosoImc extends AppCompatActivity {

    private EditText editPesoIdoso;
    private EditText editAlturaIdoso;
    private TextView textResultadoIdoso;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_idoso_imc);

        editPesoIdoso = findViewById(R.id.editPeso);
        editAlturaIdoso = findViewById(R.id.editAltura);
        textResultadoIdoso = findViewById(R.id.textResultado);
    }

    public void calcularImcIdoso(View view){
        double peso = Double.parseDouble(editPesoIdoso.getText().toString());
        double altura = Double.parseDouble(editAlturaIdoso.getText().toString());

        double resultadoImc = peso/(altura*altura);

        if(resultadoImc < 22){
            textResultadoIdoso.setText("IMC:" +resultadoImc);
            textResultadoIdoso.setText("Baixo Peso");
        }else if(resultadoImc > 22 && resultadoImc < 27){
            textResultadoIdoso.setText("IMC:" +resultadoImc);
            textResultadoIdoso.setText("Peso normal");
        }else if(resultadoImc > 27){
            textResultadoIdoso.setText("IMC:" +resultadoImc);
            textResultadoIdoso.setText("Obesidade ");
        }else{
            textResultadoIdoso.setText("IMC Inválido");
        }
    }

    public void voltarPrincipal(View view){
        Intent intent2 = new Intent(getApplicationContext(), MainActivity.class);
        startActivity(intent2);
    }
}