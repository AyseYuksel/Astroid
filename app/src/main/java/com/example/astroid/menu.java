package com.example.astroid;

import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class menu extends Activity {
    Button sorgubuton,tablobuton,ozellikbuton;


    @Override
    public void onCreate(Bundle savedInstanceBundle) {
        super.onCreate(savedInstanceBundle);
        setContentView(R.layout.menu);

        sorgubuton=(Button)findViewById(R.id.burcsorgula);
        tablobuton=(Button)findViewById(R.id.tablobutton);
        ozellikbuton=(Button)findViewById(R.id.ozellikbuton);

        sorgubuton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            Intent intent=new Intent(getApplicationContext(),burcsorgula.class);
            startActivity(intent);


            }
        });
        tablobuton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1=new Intent(getApplicationContext(),yilliktablo.class);
                startActivity(intent1);

            }
        });

        ozellikbuton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2=new Intent(getApplicationContext(),ozellik.class);
                startActivity(intent2);

            }
        });


    }
}
