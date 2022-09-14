package com.example.recyclerviewtutorial;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class StudentAdapter extends RecyclerView.Adapter<StudentAdapter.StudentViewHolder>{

    ArrayList<Student> student_list;

    public StudentAdapter(ArrayList<Student> student_list) {
        this.student_list = student_list;
    }

    @NonNull
    @Override
    public StudentViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View listItem= layoutInflater.inflate(R.layout.student_item, parent, false);
        StudentViewHolder viewHolder = new StudentViewHolder(listItem);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull StudentViewHolder holder, int position) {
        Student student=student_list.get(position);
        holder.name.setText(student.getName());
        holder.age.setText(String.valueOf(student.getAge()));
    }

    @Override
    public int getItemCount() {
        return student_list.size();
    }

    class StudentViewHolder extends RecyclerView.ViewHolder {

        TextView name;
        TextView age;

        public StudentViewHolder(@NonNull View itemView) {
            super(itemView);
            name = itemView.findViewById(R.id.name);
            age = itemView.findViewById(R.id.age);

        }
    }
}
