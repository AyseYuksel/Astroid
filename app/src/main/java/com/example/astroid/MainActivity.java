package com.example.astroid;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    Button kayitbuton,girisbuton;
    ImageView img;
    Context context = this;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    kayitbuton=(Button)findViewById(R.id.kayitbuton);
    girisbuton=(Button)findViewById(R.id.girisbuton);
    img=(ImageView)findViewById(R.id.imageView);
    img.setImageResource(R.drawable.telescope);


    kayitbuton.setOnClickListener(new View.OnClickListener(){
        @Override
        public void onClick(View v) {

       Intent intent=new Intent(context,kayit.class);
         startActivity(intent);
        }
    });

    girisbuton.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent=new Intent(context,login.class);
            startActivity(intent);
        }
    });

    }
}