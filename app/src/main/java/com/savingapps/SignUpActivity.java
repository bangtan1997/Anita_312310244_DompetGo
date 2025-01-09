package com.savingapps;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class SignUpActivity extends AppCompatActivity {

    private EditText nameEditText;
    private EditText emailEditText;
    private EditText passwordEditText;
    private Button signUpButton;
    private TextView signInText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        nameEditText = findViewById(R.id.name);
        emailEditText = findViewById(R.id.email);
        passwordEditText = findViewById(R.id.password);
        signUpButton = findViewById(R.id.signUpButton);
        signInText = findViewById(R.id.signInText);

        signUpButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = nameEditText.getText().toString();
                String email = emailEditText.getText().toString();
                String password = passwordEditText.getText().toString();

                if (name.isEmpty() || email.isEmpty() || password.isEmpty()) {
                    Toast.makeText(SignUpActivity.this, "Silakan isi semua field", Toast.LENGTH_SHORT).show();
                } else {
                    // Simpan username dan password ke SharedPreferences
                    SharedPreferences sharedPreferences = getSharedPreferences("User Prefs", MODE_PRIVATE);
                    SharedPreferences.Editor editor = sharedPreferences.edit();
                    editor.putString("username", email); // Menggunakan email sebagai username
                    editor.putString("password", password);
                    editor.apply();

                    Toast.makeText(SignUpActivity.this, "Pendaftaran berhasil untuk " + name, Toast.LENGTH_SHORT).show();

                    Intent intent = new Intent(SignUpActivity.this, SignInActivity.class);
                    startActivity(intent);
                    finish();
                }
            }
        });

        signInText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SignUpActivity.this, SignInActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }
}