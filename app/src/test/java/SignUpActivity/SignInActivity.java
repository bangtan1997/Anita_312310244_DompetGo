package SignUpActivity;

        import android.content.Intent;
        import android.os.Bundle;
        import android.view.View;
        import android.widget.Button;
        import android.widget.EditText;
        import android.widget.Toast;
        import androidx.appcompat.app.AppCompatActivity;

        import com.savingapps.SplashActivity;
        import com.savingapps.R;

public class SignInActivity extends AppCompatActivity {

    private EditText usernameEditText;
    private EditText passwordEditText;
    private Button signInButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signin);

        usernameEditText = findViewById(R.id.usernameEditText);
        passwordEditText = findViewById(R.id.passwordEditText);
        signInButton = findViewById(R.id.signInButton);

        // Event Listener untuk tombol Sign In
        signInButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String username = usernameEditText.getText().toString().trim();
                String password = passwordEditText.getText().toString().trim();

                // Cek apakah username dan password tidak kosong
                if (username.isEmpty() || password.isEmpty()) {
                    Toast.makeText(SignInActivity.this, "Please enter username and password", Toast.LENGTH_SHORT).show();
                } else {
                    // Logika login
                    Toast.makeText(SignInActivity.this, "Sign in successful", Toast.LENGTH_SHORT).show();

                    // Contoh pindah ke Activity lain setelah berhasil login
                    Intent intent = new Intent(SignInActivity.this, SplashActivity.class);
                    startActivity(intent);
                    finish();
                }
            }
        });
    }
}
