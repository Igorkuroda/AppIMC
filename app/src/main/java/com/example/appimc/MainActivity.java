package com.example.appimc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText editPeso;
    private EditText editAltura;
    private TextView textResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editPeso = findViewById(R.id.editPeso);
        editAltura = findViewById(R.id.editAltura);
        textResultado = findViewById(R.id.textResultado);
    }

    public void calcularImc(View view){
        double peso = Double.parseDouble(editPeso.getText().toString());
        double altura = Double.parseDouble(editAltura.getText().toString());

        double resultadoImc = peso/(altura*altura);

        if(resultadoImc > 18.5 && resultadoImc < 24.99){
            textResultado.setText("IMC:" +resultadoImc);
            textResultado.setText("Peso  Normal");
        }else if(resultadoImc > 25 && resultadoImc < 29.99){
            textResultado.setText("IMC:" +resultadoImc);
            textResultado.setText("Peso  Acima do peso");
        }else if(resultadoImc > 30 && resultadoImc < 34.99){
            textResultado.setText("IMC:" +resultadoImc);
            textResultado.setText("Obesidade I");
        }else if(resultadoImc > 35 && resultadoImc < 39.99) {
            textResultado.setText("IMC:" + resultadoImc);
            textResultado.setText("Obesidade II (Severa)");
        }else if(resultadoImc > 40) {
            textResultado.setText("IMC:" + resultadoImc);
            textResultado.setText("Obesidade III (mórbida)");
        }else{
            textResultado.setText("IMC Inválido");
        }
    }

    public void calculadoraImcIdoso(View view){
        Intent intent1 = new Intent(getApplicationContext(), IdosoImc.class);
        startActivity(intent1);
    }

    public void irTabelaIcm(View view){
        Intent intent3 = new Intent(getApplicationContext(), TabelaImc.class);
        startActivity(intent3);
    }
}