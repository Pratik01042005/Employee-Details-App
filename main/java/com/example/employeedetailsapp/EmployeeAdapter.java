package com.example.employeedetailsapp;

import android.content.*;
import android.view.*;
import android.widget.*;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.google.firebase.database.FirebaseDatabase;

import java.util.ArrayList;

public class EmployeeAdapter extends RecyclerView.Adapter<EmployeeAdapter.ViewHolder> {

    Context context;
    ArrayList<Employee> list;

    public EmployeeAdapter(Context context, ArrayList<Employee> list) {
        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(context).inflate(R.layout.row_employee, parent, false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        Employee emp = list.get(position);

        holder.txtName.setText(emp.getName());
        holder.txtPosition.setText(emp.getPosition());
        holder.txtSalary.setText(emp.getSalary());

        holder.btnDelete.setOnClickListener(v ->
                FirebaseDatabase.getInstance().getReference("employees")
                        .child(emp.getId()).removeValue()
        );

        holder.btnEdit.setOnClickListener(v -> {
            Intent i = new Intent(context, AddEditEmployeeActivity.class);
            i.putExtra("id", emp.getId());
            i.putExtra("name", emp.getName());
            i.putExtra("position", emp.getPosition());
            i.putExtra("salary", emp.getSalary());
            context.startActivity(i);
        });
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    static class ViewHolder extends RecyclerView.ViewHolder {

        TextView txtName, txtPosition, txtSalary;
        Button btnEdit, btnDelete;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            txtName = itemView.findViewById(R.id.txtName);
            txtPosition = itemView.findViewById(R.id.txtPosition);
            txtSalary = itemView.findViewById(R.id.txtSalary);
            btnEdit = itemView.findViewById(R.id.btnEdit);
            btnDelete = itemView.findViewById(R.id.btnDelete);
        }
    }
}
