package com.example.testthi;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.auth.FirebaseAuth;

public class SignIn extends AppCompatActivity {
EditText emailTxt, passTxt;
Button signInBtn, signUpNewBtn;
FirebaseAuth firebaseAuth;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sign_in);
emailTxt = findViewById(R.id.emailTxt);
passTxt = findViewById(R.id.passTxt);
signInBtn = findViewById(R.id.signInBtn);
signUpNewBtn = findViewById(R.id.signUpNewBtn);
signInBtn.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        Intent intent = new Intent(SignIn.this, ListProduct.class);
        SignIn.this.startActivity(intent);
    }
});

    }
}
