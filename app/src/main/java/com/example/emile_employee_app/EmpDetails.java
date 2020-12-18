package com.example.emile_employee_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class EmpDetails extends AppCompatActivity {

    ImageView Empl_Img,dash;
    EditText Empl_Names,Empl_Mail,Empl_Dept,Empl_Distr,Empl_Pass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_emp_details);

        dash = findViewById(R.id.dash);
        Empl_Img = findViewById(R.id.Empl_Img);
        Empl_Names = findViewById(R.id.Empl_Names);
        Empl_Mail = findViewById(R.id.Empl_Mail);
        Empl_Dept = findViewById(R.id.Empl_Dept);
        Empl_Distr = findViewById(R.id.Empl_Distr);
        Empl_Pass = findViewById(R.id.Empl_Pass);

        Intent viewDetails = getIntent();
        String EmpName = viewDetails.getStringExtra("EmpName");
        String EmpDept = viewDetails.getStringExtra("EmpDept");
        String EmpMail = viewDetails.getStringExtra("EmpMail");
        String EmpDistr = viewDetails.getStringExtra("EmpDistr");
        String EmpPass = viewDetails.getStringExtra("EmpPass");

        Empl_Names.setText(EmpName);
        Empl_Mail.setText(EmpMail);
        Empl_Dept.setText(EmpDept);
        Empl_Distr.setText(EmpDistr);
        Empl_Pass.setText(EmpPass);

        dash.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent register_go = new Intent(EmpDetails.this, EmpList.class);
                startActivity(register_go);
            }
        });
    }
}