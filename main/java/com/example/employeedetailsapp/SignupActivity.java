package com.example.employeedetailsapp;

import android.content.Intent;
import android.os.Bundle;
import android.widget.*;

import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.auth.FirebaseAuth;

public class SignupActivity extends AppCompatActivity {

    EditText email, password;
    Button btnSignup;
    FirebaseAuth auth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

        email = findViewById(R.id.email);
        password = findViewById(R.id.password);
        btnSignup = findViewById(R.id.btnSignup);

        auth = FirebaseAuth.getInstance();

        btnSignup.setOnClickListener(v -> {
            auth.createUserWithEmailAndPassword(
                    email.getText().toString(),
                    password.getText().toString()
            ).addOnSuccessListener(authResult -> {
                startActivity(new Intent(SignupActivity.this, MainActivity.class));
                finish();
            }).addOnFailureListener(e ->
                    Toast.makeText(this, e.getMessage(), Toast.LENGTH_SHORT).show()
            );
        });
    }
}
