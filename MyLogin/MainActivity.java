package com.example.mylogin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText Username,Password;
    Button BtnLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Username = findViewById(R.id.my_username);
        Password = findViewById(R.id.my_pass);
        BtnLogin = findViewById(R.id.btn_login);

        BtnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //isi action button

                String email = Username.getText().toString().trim();
                String password = Password.getText().toString().trim();

                if(email.isEmpty()){
                    Username.setError("Username Wajib Diisi!");
                    return;
                }
                if (password.isEmpty()){
                    Password.setError("Password Wajib Diisi!");
                    return;
                }
                Intent intent = new Intent(MainActivity.this, Dashboard.class);
                startActivity(intent);
            }
        });
    }
}