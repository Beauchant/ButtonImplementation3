package ue.project.buttonimplementation3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText txtFirstName;
    EditText txtLastName;
    EditText txtEmail;

    Button btnRegister;
    Button btnClear;

    TextView tvFirstName;
    TextView tvLastName;
    TextView tvEmail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtFirstName = findViewById(R.id.txtFirstName);
        txtLastName = findViewById(R.id.txtLastName);
        txtEmail = findViewById(R.id.txtEmail);

        btnRegister = findViewById(R.id.btnRegister);
        btnClear = findViewById(R.id.btnClear);

        tvFirstName = findViewById(R.id.tvFirstName);
        tvLastName = findViewById(R.id.tvLastName);
        tvEmail = findViewById(R.id.tvEmail);

        btnRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvFirstName.setText("First Name: " + txtFirstName.getText());
                tvLastName.setText("Last Name: " + txtLastName.getText());
                tvEmail.setText("Email: " + txtEmail.getText());
            }
        });

        btnClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvFirstName.setText("First Name");
                tvLastName.setText("Last Name");
                tvEmail.setText("Email");
            }
        });
    }
}