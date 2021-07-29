package com.example.decan;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button loginButton;
    private Button signUpButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        signUpButton = findViewById(R.id.sign_up_button);
        loginButton = findViewById(R.id.login_button);

        // Moving to SignUp Page
        signUpButton.setOnClickListener(view -> {
            Intent intentToSignUpActivity = new Intent(getApplicationContext(), SignUp.class );
            startActivity(intentToSignUpActivity);
        });

        // Moving to Login Page
        loginButton.setOnClickListener(view -> {
            Intent intentToSignUpActivity = new Intent(getApplicationContext(), Login.class );
            startActivity(intentToSignUpActivity);
        });

    }
}