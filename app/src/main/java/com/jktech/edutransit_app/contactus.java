package com.jktech.edutransit_app;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class contactus extends AppCompatActivity {

    private EditText nameEditText, emailEditText, msgEditText;
    private CheckBox agreeCheckBox;
    Button submitButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.contactus);

        nameEditText = findViewById(R.id.nameContactus);
        emailEditText = findViewById(R.id.emailContactus);
        msgEditText = findViewById(R.id.msgContactus);
        agreeCheckBox = findViewById(R.id.checkBox);

        Button submitButton = findViewById(R.id.submitButton);
        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (validateForm()) {
                    // Process the form submission
                    submitForm();
                } else {
                    Toast.makeText(contactus.this, "Please fill in all fields and agree to the privacy policy.", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    private boolean validateForm() {
        String name = nameEditText.getText().toString().trim();
        String email = emailEditText.getText().toString().trim();
        String msg = msgEditText.getText().toString().trim();

        // Check if any field is empty
        if (name.isEmpty() || email.isEmpty() || msg.isEmpty() || !agreeCheckBox.isChecked()) {
            return false;
        }

        // Add more specific validation rules if needed (e.g., email format)

        return true;
    }

    private void submitForm() {
        // Here you can handle the form submission, like sending data to a server
        // For demonstration purposes, we'll just display a toast message
        Toast.makeText(this, "Form submitted successfully!", Toast.LENGTH_SHORT).show();
    }
}
