package com.example.newfirst;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class LearningRecyclerView extends AppCompatActivity {

    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_learning_recycler_view);

        recyclerView = findViewById(R.id.recyclerView);

        List<String> data = new ArrayList<>();
        data.add("Vietnam");
        data.add("Nepal");
        data.add("India");
        data.add("Pakistan");
        data.add("Kuwait");

        MyAdapter myAdapter = new MyAdapter(LearningRecyclerView.this, data);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(myAdapter);
    }
}
