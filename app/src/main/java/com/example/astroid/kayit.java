package com.example.astroid;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import android.widget.Toast;


public class kayit extends Activity {

    veritabani vt;
    Context c;
    Button kayit;
    EditText adsoyad,kulad,sifre,sifretekrar;
    TextView tw;

    @Override
    public void onCreate(Bundle savedInstanceBundle) {
        super.onCreate(savedInstanceBundle);
        setContentView(R.layout.kayit);

        c=this;
        vt = new veritabani(this);

        adsoyad=(EditText)findViewById(R.id.adsoyad);
        kulad=(EditText)findViewById(R.id.kulad);
        sifre=(EditText)findViewById(R.id.sifre);
        sifretekrar=(EditText)findViewById(R.id.sifretekrar);
        tw=(TextView)findViewById(R.id.burctxtvw);

        kayit=(Button)findViewById(R.id.kayit);

        final String[] burclar={"secim yapiniz..","koç","boğa","ikizler","yengeç","aslan","başak",
                "terazi","akrep","yay","oğlak","kova","balık"};

        Spinner spinner=(Spinner)findViewById(R.id.spinner);

        final ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_checked, android.R.id.text1, burclar);
        spinner.setAdapter(adapter);


        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {

            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                if(position!=0){
                    String burcum=spinner.getSelectedItem().toString();
                    tw.setText(burcum);
                }else{
                    Toast.makeText(getApplicationContext(),"Burç Seçiniz ",Toast.LENGTH_SHORT).show();
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });



        kayit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String adsoyad = ((EditText)findViewById(R.id.adsoyad)).getText().toString();
                String kulad=((EditText)findViewById(R.id.kulad)).getText().toString();
                String sifre=((EditText)findViewById(R.id.sifre)).getText().toString();
                String sifretekrar=((EditText)findViewById(R.id.sifre)).getText().toString();
                String burc=((TextView)findViewById(R.id.burctxtvw)).getText().toString();

                if(adsoyad.equals("") && kulad.equals("") && sifre.equals("") && sifretekrar.equals("") && burc.equals("")){

                    Toast.makeText(getApplicationContext(), "Girişlerin tamamını doldurunuz. ", Toast.LENGTH_SHORT).show();

                   } else{
                       Intent intent=new Intent(getApplicationContext(),login.class);
                        vt.ekle(adsoyad,kulad,sifre,burc);
                        Toast.makeText(getApplicationContext(), "Kayıt başarılı ", Toast.LENGTH_SHORT).show();
                        startActivity(intent);
                    }
                }

        });

    }
}
