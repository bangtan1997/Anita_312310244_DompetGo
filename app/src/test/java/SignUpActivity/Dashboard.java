package SignUpActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

import com.savingapps.R;

class DashboardActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        // Hubungkan elemen-elemen dari layout
        ImageView scanIcon = findViewById(R.id.scan);
        ImageView sendIcon = findViewById(R.id.send);
        ImageView topupIcon = findViewById(R.id.topup);
        ImageView moreIcon = findViewById(R.id.more);
        ImageView addPaymentMethodIcon = findViewById(R.id.addPaymentMethod);

        // Listener untuk ikon "Scan"
        scanIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(DashboardActivity.this, "Scan clicked!", Toast.LENGTH_SHORT).show();
                // Contoh: Navigasi ke aktivitas lain
                // Intent intent = new Intent(DashboardActivity.this, ScanActivity.class);
                // startActivity(intent);
            }
        });

        // Listener untuk ikon "Send"
        sendIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(DashboardActivity.this, "Send clicked!", Toast.LENGTH_SHORT).show();
                // Contoh: Navigasi ke aktivitas lain
                // Intent intent = new Intent(DashboardActivity.this, SendActivity.class);
                // startActivity(intent);
            }
        });

        // Listener untuk ikon "Top Up"
        topupIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(DashboardActivity.this, "Top Up clicked!", Toast.LENGTH_SHORT).show();
                // Contoh: Navigasi ke aktivitas lain
                // Intent intent = new Intent(DashboardActivity.this, TopUpActivity.class);
                // startActivity(intent);
            }
        });

        // Listener untuk ikon "More"
        moreIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(DashboardActivity.this, "More clicked!", Toast.LENGTH_SHORT).show();
                // Contoh: Navigasi ke aktivitas lain
                // Intent intent = new Intent(DashboardActivity.this, MoreActivity.class);
                // startActivity(intent);
            }
        });

        // Listener untuk tombol "Tambahkan Metode Pembayaran"
        addPaymentMethodIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(DashboardActivity.this, "Add Payment Method clicked!", Toast.LENGTH_SHORT).show();
                // Contoh: Navigasi ke aktivitas lain
                // Intent intent = new Intent(DashboardActivity.this, AddPaymentMethodActivity.class);
                // startActivity(intent);
            }
        });
    }
}