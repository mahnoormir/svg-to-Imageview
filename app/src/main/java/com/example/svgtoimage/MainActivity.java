package com.example.svgtoimage;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {


    ImageView myimageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myimageView = findViewById(R.id.myimageView);
        String url = "https://dev.w3.org/SVG/tools/svgweb/samples/svg-files/acid.svg";
        Utils.fetchSvg(this, url, myimageView);
    }
}