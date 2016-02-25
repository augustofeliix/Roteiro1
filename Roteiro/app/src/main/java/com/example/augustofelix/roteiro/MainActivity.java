package com.example.augustofelix.roteiro;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.common.api.GoogleApiClient;

public class MainActivity extends AppCompatActivity {

    private EditText mNome;
    private EditText mSobrenome;
    private EditText mUsuario;
    private EditText mSenha;
    private EditText mConfSenha;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mNome = (EditText) findViewById(R.id.Nome);
        mSobrenome = (EditText) findViewById(R.id.Sobrenome);
        mUsuario = (EditText) findViewById(R.id.Usuario);
        mSenha = (EditText) findViewById(R.id.Senha);
        mConfSenha = (EditText) findViewById(R.id.ConfSenha);
        Button mButton = (Button) findViewById(R.id.btn);

        mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                logar();
            }
        });
    }

    public void logar() {

        String usuario = mUsuario.getText().toString();
        String senha = mSenha.getText().toString();
        String nome = mNome.getText().toString();
        String sobrenome = mSobrenome.getText().toString();
        String confSenha = mConfSenha.getText().toString();

        View focus = null;
        boolean exibir = false;
        if (TextUtils.isEmpty(nome)) {
            mNome.setError("Campo está vazio");
            focus = mNome;
            exibir = true;
        }
        if (TextUtils.isEmpty(sobrenome)) {
            mSobrenome.setError("Campo está vazio");
            focus = mSobrenome;
            exibir = true;
        }
        if (TextUtils.isEmpty(usuario)) {
            mUsuario.setError("Campo está vazio");
            focus = mUsuario;
            exibir = true;
        }
        if (TextUtils.isEmpty(senha)) {
            mSenha.setError("Campo está vazio");
            focus = mSenha;
            exibir = true;
        }
        if (TextUtils.isEmpty(confSenha)) {
            mConfSenha.setError("Campo está vazio");
            focus = mConfSenha;
            exibir = true;
        }
        if (exibir) {
            focus.requestFocus();
        } else {
            Intent i = new Intent(MainActivity.this, MainActivity2.class);
            Bundle bundle = new Bundle();
            bundle.putString("nome", usuario);
            i.putExtras(bundle);
            startActivity(i);

        }
    }
}


