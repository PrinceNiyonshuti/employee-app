package com.example.emile_employee_app;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class EmpList extends AppCompatActivity {

    private RecyclerView myrecyclerView;
    private List<Employee> lstEmployee;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_emp_list);

        myrecyclerView = findViewById(R.id.employee_List);

        //populating array
        lstEmployee = new ArrayList<>();
        lstEmployee.add(new Employee("Emile 1","Information System","emile@gmail.com","Kigali City","emile123",R.drawable.person_1));
        lstEmployee.add(new Employee("Worker 1","Information Technology","Worker@gmail.com","Kigali City","Worker1234",R.drawable.person_2));
        lstEmployee.add(new Employee("Worker 2","Information Security","Worker@gmail.com","Kigali City","Worker1234",R.drawable.person_3));
        lstEmployee.add(new Employee("Worker 3","Computer Science","Worker@gmail.com","Kigali City","Worker1234",R.drawable.person_4));
        lstEmployee.add(new Employee("Worker 4","Information Technology","Worker@gmail.com","Kigali City","Worker1234",R.drawable.person_5));
        lstEmployee.add(new Employee("Worker 4","Information Technology","Worker@gmail.com","Kigali City","Worker1234",R.drawable.person_3));
        lstEmployee.add(new Employee("Worker 4","Information Technology","Worker@gmail.com","Kigali City","Worker1234",R.drawable.person_2));
        lstEmployee.add(new Employee("Worker 4","Information Technology","Worker@gmail.com","Kigali City","Worker1234",R.drawable.person_4));
        lstEmployee.add(new Employee("Worker 4","Information Technology","Worker@gmail.com","Kigali City","Worker1234",R.drawable.person_1));
        lstEmployee.add(new Employee("Worker 4","Information Technology","Worker@gmail.com","Kigali City","Worker1234",R.drawable.person_3));
        lstEmployee.add(new Employee("Worker 4","Information Technology","Worker@gmail.com","Kigali City","Worker1234",R.drawable.person_2));
        lstEmployee.add(new Employee("Worker 4","Information Technology","Worker@gmail.com","Kigali City","Worker1234",R.drawable.person_4));

        // Assigning populated array its view
        RecyclerViewAdapter recyclerAdapter = new RecyclerViewAdapter(getApplicationContext(),lstEmployee);
        myrecyclerView.setLayoutManager(new LinearLayoutManager(this));
        myrecyclerView.setAdapter(recyclerAdapter);

    }
}