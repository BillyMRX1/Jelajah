package com.example.jelajah.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import com.example.jelajah.MainActivity;
import com.example.jelajah.R;

public class LoginActivity extends AppCompatActivity implements View.OnClickListener{
    private ImageButton btnLogin;
    private ImageButton btnGoogleLogin;
    private Button btnSignUp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        btnLogin = findViewById(R.id.login_btn);
        btnGoogleLogin = findViewById(R.id.login_google_btn);
        btnSignUp = findViewById(R.id.signup_btn);
        btnLogin.setOnClickListener(this);
        btnGoogleLogin.setOnClickListener(this);
        btnSignUp.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.login_btn:
                Intent goHome = new Intent(LoginActivity.this, WelcomeActivity.class);
                startActivity(goHome);
                break;
            case R.id.login_google_btn:
                Intent goHome2 = new Intent(LoginActivity.this, WelcomeActivity.class);
                startActivity(goHome2);
                break;
            case R.id.signup_btn:
                Intent signUp = new Intent(LoginActivity.this, SignUpActivity.class);
                startActivity(signUp);
                break;
        }
    }
}