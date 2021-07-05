package com.example.astroid;

import android.app.Activity;
import android.app.DatePickerDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Calendar;

public class burcsorgula extends Activity implements DatePickerDialog.OnDateSetListener {
    ImageView img;
    Button sorgula;
    TextView burcgoster,tarihgoster;



    @Override
    public void onCreate(Bundle savedInstanceBundle) {
        super.onCreate(savedInstanceBundle);
        setContentView(R.layout.burcsorgula);


        img=(ImageView)findViewById(R.id.imageView3);
        img.setImageResource(R.drawable.book);
        burcgoster=(TextView)findViewById(R.id.burcgoster);
        tarihgoster=(TextView)findViewById(R.id.textView8);
        sorgula=(Button)findViewById(R.id.sorgula);
        sorgula.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              Calendar c=Calendar.getInstance();
              int yil=c.get(Calendar.YEAR);
              int ay=c.get(Calendar.MONTH);
              int gun=c.get(Calendar.DAY_OF_MONTH);

              DatePickerDialog datePickerDialog=new DatePickerDialog(burcsorgula.this,burcsorgula.this,yil,ay,gun);
              datePickerDialog.show();


            }
        });
    }

    @Override
    public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
        burcgoster.setText("Seçtiğiniz tarihin gösterdiği burç : "+getBurc(dayOfMonth,month));

        if(month==0){
            String ay="ocak";
            tarihgoster.setText(dayOfMonth+" "+ay);
        }else if(month==1){
            String ay="şubat";
            tarihgoster.setText(dayOfMonth+" "+ay);
        }else if(month==2){
            String ay="mart";
            tarihgoster.setText(dayOfMonth+" "+ay);
        }else if(month==3){
            String ay="nisan";
            tarihgoster.setText(dayOfMonth+" "+ay);
        }else if(month==4){
            String ay="mayıs";
            tarihgoster.setText(dayOfMonth+" "+ay);
        }else if(month==5){
            String ay="haziran";
            tarihgoster.setText(dayOfMonth+" "+ay);
        }else if(month==6){
            String ay="temmuz";
            tarihgoster.setText(dayOfMonth+" "+ay);
        }else if(month==7){
            String ay="ağustos";
            tarihgoster.setText(dayOfMonth+" "+ay);
        }else if(month==8){
            String ay="eylül";
            tarihgoster.setText(dayOfMonth+" "+ay);
        }else if(month==9){
            String ay="ekim";
            tarihgoster.setText(dayOfMonth+" "+ay);
        }else if(month==10){
            String ay="kasım";
            tarihgoster.setText(dayOfMonth+" "+ay);
        }else if(month==11){
            String ay="aralık";
            tarihgoster.setText(dayOfMonth+" "+ay);
        }

    }
    private String getBurc(int gun,int ay) {
        String burc = "";
        if (ay == 0) {
            if (gun < 21) {
                burc = "Oğlak Burcu";
                img.setImageResource(R.drawable.oglak2);
            } else {
                burc = "Kova Burcu";
                img.setImageResource(R.drawable.kova2);
            }
        } else if (ay == 1) {
            if (gun < 20) {
                burc = "Kova Burcu";
                img.setImageResource(R.drawable.kova2);
            } else {
                burc = "Balık Burcu";
                img.setImageResource(R.drawable.balik2);
            }
        }
        else if (ay == 2) {
                if (gun < 22) {
                    burc = "Balık Burcu";
                    img.setImageResource(R.drawable.balik2);
                } else {
                    burc = "Koç Burcu";
                    img.setImageResource(R.drawable.koc2);
                }
        }
        else if (ay == 3) {
            if (gun < 21) {
                burc = "Koç Burcu";
                img.setImageResource(R.drawable.koc2);
            } else {
                burc = "Boğa Burcu";
                img.setImageResource(R.drawable.boga2);
            }
        }
        else if (ay == 4) {
            if (gun < 22) {
                burc = "Boğa Burcu";
                img.setImageResource(R.drawable.boga2);
            } else {
                burc = "İkizler Burcu";
                img.setImageResource(R.drawable.ikizler2);
            }
        }
        else if (ay == 5) {
            if (gun < 24) {
                burc = "İkizler Burcu";
                img.setImageResource(R.drawable.ikizler2);
            } else {
                burc = "Yengeç Burcu";
                img.setImageResource(R.drawable.yengec2);
            }
        }
        else if (ay == 6) {
            if (gun < 24) {
                burc = "Yengeç Burcu";
                img.setImageResource(R.drawable.yengec2);
            } else {
                burc = "Aslan Burcu";
                img.setImageResource(R.drawable.aslan2);
            }
        }
        else if (ay == 7) {
            if (gun < 23) {
                burc = "Aslan Burcu";
                img.setImageResource(R.drawable.aslan2);
            } else {
                burc = "Başak Burcu";
                img.setImageResource(R.drawable.basak2);
            }
        }
        else if (ay == 8) {
            if (gun < 23) {
                 burc = "Başak Burcu";
                img.setImageResource(R.drawable.basak2);
            } else {
                burc = "Terazi Burcu";
                img.setImageResource(R.drawable.terazi2);
            }
        }
        else if (ay == 9) {
            if (gun < 23) {
                burc = "Terazi Burcu";
                img.setImageResource(R.drawable.terazi2);
            } else {
                burc = "Akrep Burcu";
                img.setImageResource(R.drawable.terazi2);
            }
        }
        else if (ay == 10) {
            if (gun < 23) {
                burc = "Akrep Burcu";
                img.setImageResource(R.drawable.akrep2);
            } else {
                burc = "Yay Burcu";
                img.setImageResource(R.drawable.yay2);
            }
        }
        else if (ay == 11) {
            if (gun < 22) {
                burc = "Yay Burcu";  img.setImageResource(R.drawable.yay2);
            } else {
                burc = "Oğlak Burcu";
                img.setImageResource(R.drawable.oglak2);
            }
        }

    return burc;
    }

}
