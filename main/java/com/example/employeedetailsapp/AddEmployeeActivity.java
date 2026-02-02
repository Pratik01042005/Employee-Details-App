package com.example.employeedetailsapp;

import android.os.Bundle;
import android.widget.*;

import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.database.FirebaseDatabase;

public class AddEmployeeActivity extends AppCompatActivity {

    EditText name, position, salary;
    Button btnSave;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_employee);

        name = findViewById(R.id.etName);
        position = findViewById(R.id.etPosition);
        salary = findViewById(R.id.etSalary);
        btnSave = findViewById(R.id.btnSave);

        btnSave.setOnClickListener(v -> {
            String id = FirebaseDatabase.getInstance().getReference("employees").push().getKey();

            Employee emp = new Employee(id,
                    name.getText().toString(),
                    position.getText().toString(),
                    salary.getText().toString());

            FirebaseDatabase.getInstance().getReference("employees")
                    .child(id).setValue(emp);

            finish();
        });
    }
}
