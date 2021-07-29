package com.example.decan;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

public class SignUp extends AppCompatActivity {

    private Button signUpButton;
    private Button loginButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
        signUpButton = findViewById(R.id.go_sign_up_button);
        loginButton = findViewById(R.id.go_login_button);
        //Intent intentForSignUpActivity = getIntent();

        signUpButton.setOnClickListener(view ->{
            Toast.makeText(getApplicationContext(), "SignUp Successful", Toast.LENGTH_LONG).show();
        });

        // Moving to Login Page
        loginButton.setOnClickListener(view -> {
            Intent intentToSignUpActivity = new Intent(getApplicationContext(), Login.class );
            startActivity(intentToSignUpActivity);
        });
    }
}