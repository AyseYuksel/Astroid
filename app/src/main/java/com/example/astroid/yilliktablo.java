package com.example.astroid;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ImageView;

public class yilliktablo extends Activity {
    ImageView img1,img2,img3;

    @Override
    public void onCreate(Bundle savedInstanceBundle) {
        super.onCreate(savedInstanceBundle);
        setContentView(R.layout.yilliktablo);

        img1=(ImageView)findViewById(R.id.imageView4);
        img2=(ImageView)findViewById(R.id.imageView5);
        img3=(ImageView)findViewById(R.id.imageView6);


        img1.setImageResource(R.drawable.tablo);
        img2.setImageResource(R.drawable.tablo2);
        img3.setImageResource(R.drawable.tablo3);

    }
}
