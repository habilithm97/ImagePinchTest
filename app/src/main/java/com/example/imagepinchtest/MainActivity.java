package com.example.imagepinchtest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

import uk.co.senab.photoview.PhotoViewAttacher;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        PhotoViewAttacher attacher;
        ImageView iv = (ImageView)findViewById(R.id.iv);
        attacher = new PhotoViewAttacher(iv);
    }
}