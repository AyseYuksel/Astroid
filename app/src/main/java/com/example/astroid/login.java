package com.example.astroid;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class login extends Activity {
    ImageView img;
    veritabani vt;
    Context c;
    Button butonkayit,butongiris;

    @Override
    public void onCreate(Bundle savedInstanceBundle) {
        super.onCreate(savedInstanceBundle);
        setContentView(R.layout.login);
        c=this;
        vt = new veritabani(this);

        img=(ImageView)findViewById(R.id.imageView2);
        img.setImageResource(R.drawable.moon);

        butonkayit=(Button)findViewById(R.id.kaydol);
        butongiris=(Button)findViewById(R.id.gir);

        butonkayit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(),kayit.class);
                startActivity(intent);
            }
        });



        butongiris.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String kuladi=((EditText)findViewById(R.id.kuladi)).getText().toString();
                String sifrem=((EditText)findViewById(R.id.sifrem)).getText().toString();
                Boolean kontrol = vt.checkusernamepassword(kuladi, sifrem);
                
               if (kuladi.equals("") && sifrem.equals("")) {

                   Toast.makeText(getApplicationContext(), "Lütfen Girişleri Boş Bırakmayınız ", Toast.LENGTH_LONG).show();

                } else if (kontrol == false) {
                   Toast.makeText(getApplicationContext(), "Kullanıcı adı veya şifre hatalı girildi.", Toast.LENGTH_LONG).show();

                } else {
                   Intent intent1 = new Intent(getApplicationContext(), menu.class);
                   Toast.makeText(getApplicationContext(), "Başarılı ", Toast.LENGTH_LONG).show();
                   startActivity(intent1);
               }

            }
        });


    }




}
