package com.example.emile_employee_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText mail,pass;
    Button btn_login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mail = findViewById(R.id.mail);
        pass = findViewById(R.id.pass);
        btn_login = findViewById(R.id.btn_login);

        btn_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                final String Email = mail.getText().toString().trim();
                final String Password = pass.getText().toString().trim();

                if (Email.equals("admin@gmail.com")){

                    Intent admin = new Intent(MainActivity.this, AdminDashboard.class);
                    startActivity(admin);
                    Toast.makeText(MainActivity.this, "Welcome Back Admin", Toast.LENGTH_LONG).show();

                }else  if (Email.equals("emile@gmail.com")){

                    Intent worker = new Intent(MainActivity.this, UserDashboard.class);
                    startActivity(worker);
                    Toast.makeText(MainActivity.this, "Worker Successfully Logged In", Toast.LENGTH_LONG).show();

                }else {
                    Toast.makeText(MainActivity.this, "Credentials are Incorrect", Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}