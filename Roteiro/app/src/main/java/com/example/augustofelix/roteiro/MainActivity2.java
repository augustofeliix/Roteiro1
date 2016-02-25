package com.example.augustofelix.roteiro;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    private TextView mTexto;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        mTexto = (TextView) findViewById(R.id.texto);
        Bundle bundle = getIntent().getExtras();
        String texto = bundle.getString("nome");
        mTexto.setText("Olá "+texto + " seja bem vindo");
    }
}
