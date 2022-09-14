package com.example.recyclerviewtutorial;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView rv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<Student> names = new ArrayList<>();
        names.add(new Student("Waleed", 12));
        names.add(new Student("Haris", 20));
        names.add(new Student("Murtaza", 18));
        names.add(new Student("Ali", 19));

        rv = findViewById(R.id.rv);
        StudentAdapter studentAdapter = new StudentAdapter(names);
        
        rv.setLayoutManager(new LinearLayoutManager(this));
        rv.setAdapter(studentAdapter);
    }
}