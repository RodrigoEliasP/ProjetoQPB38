package com.example.projetoqpb38;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class loggedScreen extends AppCompatActivity implements View.OnClickListener {
    ViewHolder mViewMain = new ViewHolder();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_logged_screen);
        this.mViewMain.imgBackButtonB38 = findViewById(R.id.imgBackButtonB38);

        this.mViewMain.imgBackButtonB38.setOnClickListener(this);
    }
    @Override
    public void onClick(View view){
        if(view.getId() == R.id.imgBackButtonB38){
            finish();
        }
    }
    private static class ViewHolder{
        private ImageView imgBackButtonB38;
    }
}
