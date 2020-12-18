package com.example.emile_employee_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class AdminDashboard extends AppCompatActivity {

    ImageView EmpList,logout;
    EditText Empl_Names,Empl_Mail,Empl_Dept,Empl_Distr,Empl_Pass;
    Button btn_create;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_dashboard);

        EmpList = findViewById(R.id.EmpList);
        logout = findViewById(R.id.logout);
        Empl_Names = findViewById(R.id.Empl_Names);
        Empl_Mail = findViewById(R.id.Empl_Mail);
        Empl_Dept = findViewById(R.id.Empl_Dept);
        Empl_Distr = findViewById(R.id.Empl_Distr);
        Empl_Pass = findViewById(R.id.Empl_Pass);
        btn_create = findViewById(R.id.btn_create);

        logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent log_out = new Intent(AdminDashboard.this, MainActivity.class);
                startActivity(log_out);
            }
        });

        EmpList.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent employee_list = new Intent(AdminDashboard.this, EmpList.class);
                startActivity(employee_list);
            }
        });

        btn_create.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(AdminDashboard.this, "New Employee Recorded Successfully", Toast.LENGTH_LONG).show();
            }
        });
    }
}