package com.savingapps;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import androidx.appcompat.app.AppCompatActivity;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Set layout untuk splash screen (opsional)
        setContentView(R.layout.activity_splash);

        // Timer untuk berpindah ke MainActivity
        new Handler().postDelayed(() -> {
            Intent intent = new Intent(SplashActivity.this, MainActivity.class);
            startActivity(intent);
            finish(); // Agar pengguna tidak bisa kembali ke layar splash
        }, 3000); // 3000 ms = 3 detik
    }
}
