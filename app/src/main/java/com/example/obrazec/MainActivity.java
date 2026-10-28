package com.example.obrazec;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private EditText etUsername, etFullName, etCountry, etEmail, etPhone, etPassword;
    private RadioGroup rgGender;
    private CheckBox cbTerms;
    private Button btnCreate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etUsername = findViewById(R.id.etUsername);
        etFullName = findViewById(R.id.etFullName);
        etCountry = findViewById(R.id.etCountry);
        etEmail = findViewById(R.id.etEmail);
        etPhone = findViewById(R.id.etPhone);
        etPassword = findViewById(R.id.etPassword);
        rgGender = findViewById(R.id.rgGender);
        cbTerms = findViewById(R.id.cbTerms);
        btnCreate = findViewById(R.id.btnCreate);

        btnCreate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showSummary();
            }
        });
    }

    private void showSummary() {
        String username = etUsername.getText().toString();
        String fullName = etFullName.getText().toString();
        String country = etCountry.getText().toString();
        String email = etEmail.getText().toString();
        String phone = etPhone.getText().toString();
        String password = etPassword.getText().toString();

        String gender;
        int selectedId = rgGender.getCheckedRadioButtonId();
        if (selectedId == -1) {
            gender = "Not selected";
        } else {
            RadioButton selected = findViewById(selectedId);
            gender = selected.getText().toString();
        }

        String terms = cbTerms.isChecked() ? "Yes" : "No";

        String message = "Username: " + username + "\n"
                + "Full name: " + fullName + "\n"
                + "Country: " + country + "\n"
                + "Email: " + email + "\n"
                + "Phone number: " + phone + "\n"
                + "Password: " + password + "\n"
                + "Gender: " + gender + "\n"
                + "Terms Accepted: " + terms;

        new AlertDialog.Builder(this)
                .setTitle("Registration Details")
                .setMessage(message)
                .setPositiveButton("OK", null)
                .show();
    }
}