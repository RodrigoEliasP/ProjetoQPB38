package com.example.projetoqpb38;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.material.textfield.TextInputEditText;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    ViewHolder mViewMain = new ViewHolder();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.mViewMain.btnCadastrarB38 = this.findViewById(R.id.btnCadastrarB38);
        this.mViewMain.btnEntrarB38 = this.findViewById(R.id.btnEntrarB38);
        this.mViewMain.txtSenhaB38 = this.findViewById(R.id.txtSenhaB38);
        this.mViewMain.txtUsuarioB38 = this.findViewById(R.id.txtUsuarioB38);
        //onclicks
        this.mViewMain.btnEntrarB38.setOnClickListener(this);
        this.mViewMain.btnCadastrarB38.setOnClickListener(this);
    }
    @Override
    public void onClick(View view){
        switch (view.getId()) {
            case R.id.btnCadastrarB38:
                Intent cadScreen = new Intent(this, cadastroScreen.class);
                startActivity(cadScreen);
                break;
            case R.id.btnEntrarB38:
                validarCampos();
                break;
        }
    }
    private void validarCampos()  {
        if(this.mViewMain.txtUsuarioB38.getText().toString().equals("")){
            this.mViewMain.txtUsuarioB38.setError("Campo vazio, favor preencher");
        }else if(this.mViewMain.txtSenhaB38.getText().toString().equals("")){
            this.mViewMain.txtSenhaB38.setError("Campo vazio, favor preencher");
        }else{
            Intent loggedScreen = new Intent(this, com.example.projetoqpb38.loggedScreen.class);
            startActivity(loggedScreen);
        }
    }
    private static class ViewHolder{
        private TextInputEditText txtUsuarioB38;
        private TextInputEditText txtSenhaB38;
        private Button btnEntrarB38;
        private Button btnCadastrarB38;
    }
}
