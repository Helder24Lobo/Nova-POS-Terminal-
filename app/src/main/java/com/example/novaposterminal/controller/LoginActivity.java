package com.example.novaposterminal.controller;

import android.os.Bundle;
import android.text.TextUtils;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import com.example.novaposterminal.R;

public class LoginActivity extends AppCompatActivity {

    private EditText et_email, et_password;
    private AppCompatButton btn_login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById();
        setOnclickListener();
    }

    private void findViewById() {
        et_email = findViewById(R.id.et_email);
        et_password = findViewById(R.id.et_password);
        btn_login = findViewById(R.id.btn_login);
    }

    private void setOnclickListener() {
        if (btn_login != null) {
            btn_login.setOnClickListener(v -> validateFields());
        }
    }

    private void validateFields() {
        String email = et_email != null ? et_email.getText().toString().trim() : "";
        String password = et_password != null ? et_password.getText().toString().trim() : "";

        if (TextUtils.isEmpty(email)) {
            et_email.setError("Por favor, llena el email con valores válidos");
            et_email.requestFocus();
            return;
        }

        if (TextUtils.isEmpty(password)) {
            et_password.setError("Por favor, llena la contraseña con valores válidos");
            et_password.requestFocus();
            return;
        }

        Toast.makeText(this, "Validación local exitosa. Conectando al Modelo...", Toast.LENGTH_SHORT).show();
    }
}