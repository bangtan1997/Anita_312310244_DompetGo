package SignUpActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

import com.savingapps.SplashActivity;
import com.savingapps.R;

class SignUpActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        // Tombol Kembali
        ImageView backButton = findViewById(R.id.backButton);
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish(); // Kembali ke activity sebelumnya
            }
        });

        // Teks Sign In
        TextView signInText = findViewById(R.id.signInText);
        signInText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Arahkan ke halaman Sign In
                Intent intent = new Intent(SignUpActivity.this, SplashActivity.class);
                startActivity(intent);
            }
        });
    }
}

public class Java {
}
