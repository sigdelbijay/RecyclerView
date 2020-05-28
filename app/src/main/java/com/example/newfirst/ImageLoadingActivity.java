package com.example.newfirst;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class ImageLoadingActivity extends AppCompatActivity {
    ImageView imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image_loading);

        imageView = findViewById(R.id.imageView);
        Picasso.get().load("https://img.favpng.com/20/14/22/cartoon-vector-graphics-image-animated-film-clip-art-png-favpng-NS9jaq3upVKEHzu0AKMsR1m63.jpg").into(imageView);
    }
}
