package com.savingapps;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class SignInActivity extends AppCompatActivity {

    private ImageView imageView;
    private EditText usernameEditText;
    private EditText passwordEditText;
    private Button signInButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signin);

        imageView = findViewById(R.id.imageView);
        usernameEditText = findViewById(R.id.UsernameEditText);
        passwordEditText = findViewById(R.id.PasswordEditText);
        signInButton = findViewById(R.id.SignInButton);

        signInButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("SignInActivity", "Sign In button clicked");
                // Dapatkan input pengguna
                String username = usernameEditText.getText().toString();
                String password = passwordEditText.getText().toString();

                // Lakukan autentikasi pengguna
                if (username.isEmpty() || password.isEmpty()) {
                    Toast.makeText(SignInActivity.this, "Silakan isi semua field", Toast.LENGTH_SHORT).show();
                } else {
                    // Ambil username dan password dari SharedPreferences
                    SharedPreferences sharedPreferences = getSharedPreferences("User Prefs", MODE_PRIVATE);
                    String savedUsername = sharedPreferences.getString("username", null);
                    String savedPassword = sharedPreferences.getString("password", null);

                    // Verifikasi kredensial
                    if (username.equals(savedUsername) && password.equals(savedPassword)) {
                        Intent intent = new Intent(SignInActivity.this, DashboardActivity.class);
                        startActivity(intent);
                        finish();
                    } else {
                        Toast.makeText(SignInActivity.this, "Kredensial tidak valid", Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });
    }
}