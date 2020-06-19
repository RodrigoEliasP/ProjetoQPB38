package com.example.projetoqpb38;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.google.android.material.textfield.TextInputEditText;

public class cadastroScreen extends AppCompatActivity implements View.OnClickListener {
    ViewHolder mViewMain = new ViewHolder();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro_screen);

        this.mViewMain.imgBackButtonB38 = findViewById(R.id.imgBackButtonB38);
        this.mViewMain.btnConfirmarB38 = findViewById(R.id.btnConfirmarB38);
        this.mViewMain.txtNomeB38 = findViewById(R.id.txtNomeB38);
        this.mViewMain.txtEmailB38 = findViewById(R.id.txtEmailB38);
        this.mViewMain.txtSenhaB38 = findViewById(R.id.txtSenhaB38);

        this.mViewMain.imgBackButtonB38.setOnClickListener(this);
        this.mViewMain.btnConfirmarB38.setOnClickListener(this);
    }
    @Override
    public void onClick(View view){
        switch (view.getId()) {
            case R.id.imgBackButtonB38:
                finish();
                break;
            case R.id.btnConfirmarB38:
                validarCampos();
                break;
        }
    }
    public boolean isEmailValido(String email){
        return Patterns.EMAIL_ADDRESS.matcher(email).matches();
    }

    private void validarCampos()  {
        if(this.mViewMain.txtNomeB38.getText().toString().equals("")){
            this.mViewMain.txtNomeB38.setError("Campo vazio, favor preencher");
        }else if(this.mViewMain.txtEmailB38.getText().toString().equals("")){
            this.mViewMain.txtEmailB38.setError("Campo vazio, favor preencher");
        }else if(!isEmailValido(this.mViewMain.txtEmailB38.getText().toString())){
            this.mViewMain.txtEmailB38.setError("Formato de email incorreto");
        }else if(this.mViewMain.txtSenhaB38.getText().toString().equals("")){
            this.mViewMain.txtSenhaB38.setError("Campo vazio, favor preencher");
        }
    }
    private static class ViewHolder{
        private ImageView imgBackButtonB38;
        private Button btnConfirmarB38;
        private TextInputEditText txtNomeB38;
        private TextInputEditText txtEmailB38;
        private TextInputEditText txtSenhaB38;
    }
}
