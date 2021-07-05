package com.example.astroid;

import android.app.Activity;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;

import org.w3c.dom.Text;


public class ozellik extends Activity {
    TextView twburc,twicerik;
    ImageView img;


    @Override
    public void onCreate(Bundle savedInstanceBundle) {
        super.onCreate(savedInstanceBundle);
        setContentView(R.layout.ozellik);

        twburc=(TextView)findViewById(R.id.textView24);
        twicerik=(TextView)findViewById(R.id.textView25);
        img=(ImageView)findViewById(R.id.imageView7);
        img.setImageResource(R.drawable.astrology);

        final String[] burclar={"secim yapiniz..","koç","boğa","ikizler","yengeç","aslan","başak",
                "terazi","akrep","yay","oğlak","kova","balık"};

        Spinner spinner=(Spinner)findViewById(R.id.spinner2);
        final ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_checked, android.R.id.text1, burclar);
        spinner.setAdapter(adapter);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                if(position!=0){
                    twburc.setText(burclar[position]);
                    if(position==1){
                        img.setImageResource(R.drawable.koc2);
                        twicerik.setText(" Enerjik, atak, cesur, lider özelliği taşıyan, sağlam iradeli, hırslı. bencil, egemen, bağımsız karakterli, çabuk sinirlenen, sabırsız, kavgacı.");
                    }
                    else if(position==2){
                        img.setImageResource(R.drawable.boga2);
                        twicerik.setText("Düzenli yaşam seven, tutkularına sarılan, pratik, güvenilir, sabırlı, iş yaşamında uyumlu, sistemli, zenginliği ve iyi yaşamı seven, midesine düşkün, soğukkanlı, iradeli, sadık, sevecen, tutucu, inatçı.");
                    }  else if(position==3){
                        img.setImageResource(R.drawable.ikizler2);
                        twicerik.setText("Akıllı, uyumlu, her işe yatkın, entelektüel, mantıklı, canlı, konuşkan, hareketli, yabancı dillere yetenekli, zamana uyan, heyecanlı, değişken, huzursuz, kurnaz, meraklı, kararsız.");
                    }  else if(position==4){
                        img.setImageResource(R.drawable.yengec2);
                        twicerik.setText(" İnatçı, sabırlı, duyarlı, iyi kalpli, sevimli, hayal gücü yüksek, koruyucu, becerikli, zeki, evcimen, heyecanlı, alıngan, çabuk sinirlenen, değişken, somurtkan, bağışlamaz, dengesiz.");
                    }  else if(position==5){
                        img.setImageResource(R.drawable.aslan2);
                        twicerik.setText("Neşeli, umutlu, yüce gönüllü, eli açık, yaratıcı, coşkun, heyecanlı, geniş düşünceli, kendini beğenmiş, sabit fikirli, kibirli.");
                    }  else if(position==6){
                        img.setImageResource(R.drawable.basak2);
                        twicerik.setText("Telaşlı olmayan, rahat, kavgadan ve tartışmadan kaçınan, ayırt edici, inceleyici, dürüst, düzenli, titiz, dakik, kuruntulu, ince eleyip sık dokuyan, geleneklere bağlı, önemsiz konularda fazla duran.");
                    }  else if(position==7){
                        img.setImageResource(R.drawable.terazi2);
                        twicerik.setText("Dürüst, kurallara bağlı, uyumlu, büyüleyici, insanlarla iyi geçinen, duygusal, diplomatik, kararsız, kinci, kolay etkilenen, saf, temiz ruhlu.");
                    }  else if(position==8){
                        img.setImageResource(R.drawable.akrep2);
                        twicerik.setText(" Sağlam iradeye sahip, kararlı, güçlü, sezgi gücü yüksek, anlayışlı, yardımsever, kıskanç, dik kafalı, kinci, inatçı, kuşkucu.");
                    }  else if(position==9){
                        img.setImageResource(R.drawable.yay2);
                        twicerik.setText("Açık sözlü, dürüst, iyimser, güleryüzlü, açık düşünceli, uyumlu, felsefe ve yargı yeteneği olan, özgürlüğü seven, güvenilir, olayları abartıcı, huzursuz, aşırı uçlarda yaşayan, kaprisli.");
                    }  else if(position==10){
                        img.setImageResource(R.drawable.oglak2);
                        twicerik.setText(" Nazik, sevimli, güvenilir, kararlı, tutkulu, özenli, düzenli, sabırlı, disiplinli, katı görünüşlü, çok kesin tavırlı, tutucu.");
                    }  else if(position==11){
                        img.setImageResource(R.drawable.kova2);
                        twicerik.setText(" Heyecanlı, insancıl, bağımsız, yaratıcı, ileri görüşlü, arkadaş canlısı, dik kafalı.");
                    }
                    else if(position==12){
                        img.setImageResource(R.drawable.balik2);
                        twicerik.setText("Anlaşılması zor, sevimli, duygusal, duyarlı, uyumlu, kolay etkilenen, iyi kalpli, anlayışlı, heyecanlı, gizliliği seven, kararsız, kolay etkilenen.");
                    }

                }
            }
            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }
        });


    }
}
