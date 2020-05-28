package com.example.newfirst;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    String itemAtPosition;
    ListView listview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listview = findViewById(R.id.listview);
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.list_of_items));
        listview.setAdapter(arrayAdapter);

        listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                itemAtPosition = listview.getItemAtPosition(position).toString();
                switch (itemAtPosition) {
                    case "calculator":
                        Intent calcIntent = new Intent(MainActivity.this, CalculatorActivity.class);
                        startActivity(calcIntent);
                        break;
                    case "image loading":
                        Intent imageLoadingIntent = new Intent(MainActivity.this, ImageLoadingActivity.class);
                        startActivity(imageLoadingIntent);
                        break;
                    case "caching":
                        Intent cachingIntent = new Intent(MainActivity.this, Caching.class);
                        startActivity(cachingIntent);
                        break;
                    case "bio app":
                        Intent bioAppIntent = new Intent(MainActivity.this, BioActivity.class);
                        startActivity(bioAppIntent);
                        break;
                    case "recycler view":
                        Intent recyclerViewIntent = new Intent(MainActivity.this, LearningRecyclerView.class);
                        startActivity(recyclerViewIntent);
                        break;
                }
            }
        });
    }
}
