package com.example.appimc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class TabelaImc extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tabela_imc);
    }

    public void voltarPrincipal(View view) {
        Intent intent4 = new Intent(getApplicationContext(), MainActivity.class);
        startActivity(intent4);
    }
}