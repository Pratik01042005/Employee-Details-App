package com.example.employeedetailsapp;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    FloatingActionButton fabAdd;
    ArrayList<Employee> employeeList;
    EmployeeAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);
        fabAdd = findViewById(R.id.fabAdd);

        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        employeeList = new ArrayList<>();

        adapter = new EmployeeAdapter(this, employeeList);
        recyclerView.setAdapter(adapter);

        fabAdd.setOnClickListener(v -> {
            startActivity(new Intent(MainActivity.this, AddEditEmployeeActivity.class));
        });

        // Sample data (you can remove later)
        employeeList.add(new Employee("1", "Rahul", "Manager", "50000"));
        employeeList.add(new Employee("2", "Amit", "Developer", "40000"));

        adapter.notifyDataSetChanged();
    }

    // Toast helpers
    public void showDeleteToast() {
        Toast.makeText(this, "🗑 Employee deleted", Toast.LENGTH_SHORT).show();
    }

    public void showUpdateToast() {
        Toast.makeText(this, "✏ Employee updated successfully", Toast.LENGTH_SHORT).show();
    }
}
