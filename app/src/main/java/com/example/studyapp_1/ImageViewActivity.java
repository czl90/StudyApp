package com.example.studyapp_1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class ImageViewActivity extends AppCompatActivity {

    private ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image_view);
        imageView=findViewById(R.id.imageView_4);
        Glide.with(this).load("https://abc.2008php.com/2017_Website_appreciate/2017-09-16/20170916221628.jpg").into(imageView);
    }
}
