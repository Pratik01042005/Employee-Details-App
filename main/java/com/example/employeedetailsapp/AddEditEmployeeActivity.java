package com.example.employeedetailsapp;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class AddEditEmployeeActivity extends AppCompatActivity {

    EditText etName, etPosition, etSalary;
    Button btnSave;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_employee);

        // Enable back arrow
        if (getSupportActionBar() != null) {
            getSupportActionBar().setTitle("Add / Edit Employee");
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }

        etName = findViewById(R.id.etName);
        etPosition = findViewById(R.id.etPosition);
        etSalary = findViewById(R.id.etSalary);
        btnSave = findViewById(R.id.btnSave);

        btnSave.setOnClickListener(v -> saveEmployee());
    }

    // Back arrow click
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            finish(); // GO BACK
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    private void saveEmployee() {
        String name = etName.getText().toString().trim();
        String position = etPosition.getText().toString().trim();
        String salary = etSalary.getText().toString().trim();

        if (name.isEmpty() || position.isEmpty() || salary.isEmpty()) {
            Toast.makeText(this, "❗ Please fill all fields", Toast.LENGTH_SHORT).show();
            return;
        }

        try {
            // Here you will later add DB save code
            Toast.makeText(this, "✅ Employee saved successfully", Toast.LENGTH_SHORT).show();
            finish();
        } catch (Exception e) {
            Toast.makeText(this, "❌ Failed to save employee", Toast.LENGTH_SHORT).show();
        }
    }
}