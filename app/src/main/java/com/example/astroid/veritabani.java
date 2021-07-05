package com.example.astroid;

import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

import java.util.ArrayList;

public class veritabani extends SQLiteOpenHelper {


    public veritabani(@Nullable Context context) {
        super(context, "uyelerdb",null ,1 );
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
    db.execSQL("create table uyeler(uyeid integer primary key,adsoyad text,kulad text,sifre text,burc text)");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
    db.execSQL("drop table if exists uyeler");
    this.onCreate(db);
    }


    void ekle(String adsoyad,String kulad,String sifre,String burc){
    SQLiteDatabase vt=this.getWritableDatabase();
    vt.execSQL("insert into uyeler(adsoyad,kulad,sifre,burc) values('"+adsoyad+"','"+kulad+"','"+sifre+"','"+burc+"')");
    vt.close();
    }


    public Boolean checkusernamepassword(String kulad,String sifre){
        SQLiteDatabase vt=this.getWritableDatabase();
        Cursor cursor=vt.rawQuery("select * from uyeler where kulad = ? and sifre = ?",new String[]{kulad,sifre});
        if(cursor.getCount()>0){
            return true;
        }else{
            return false;
        }
  
    }

}
