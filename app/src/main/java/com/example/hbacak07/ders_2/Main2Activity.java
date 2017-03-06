package com.example.hbacak07.ders_2;

import android.graphics.Color;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {
    String metin;
    Button buttonmavi,buttonsari,buttonyesil;//XML(Tasarım dosyası) dosyasındaki kullandığımız nesne tipinde değişken tenımlıyoruz...
    Button buttonkalin,buttonitalik,buttonnormal;
    Button buttonbuyut,buttonkucult;
    TextView textViewmetin;
    int a=15;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        buttonmavi=(Button)findViewById(R.id.buttonmavi);//XML ve JAVA arasındaki nesne ve değişken arasındaki bağlantıyı kuruyoruz...
        buttonsari=(Button)findViewById(R.id.buttonsari);
        buttonyesil=(Button)findViewById(R.id.buttonyesil);
        buttonnormal=(Button)findViewById(R.id.buttonnormal);
        buttonitalik=(Button)findViewById(R.id.buttonitalik);
        buttonkalin=(Button)findViewById(R.id.buttonkalin);
        buttonbuyut=(Button)findViewById(R.id.buttonbuyut);
        buttonkucult=(Button)findViewById(R.id.buttonkucult);
        textViewmetin=(TextView)findViewById(R.id.textViewmetin);
        metin="Habitat, Bilgi ve İletişim Teknolojileri Programı ile bilgiye ulaşım" +
                " kanallarının kullanımını yaygınlaştırarak, haklar konusunda toplumun" +
                " bilgi ve farkındalığının artmasını amaçlar. Bu çerçevede de iletişim araçlarının" +
                " doğru kullanımını, çocukların, gençlerin ve internetle henüz tanışmamış yetişkinlerin  " +
                "bilişim programlarını kullanım becerilerini geliştiren bilişim projeleri yürütür.";
        textViewmetin.setText(metin);
        buttonmavi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textViewmetin.setTextColor(Color.parseColor("#0000FF"));//TextView'in Text rengini değiştiriyoruzzz...
            }
        });
        buttonsari.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textViewmetin.setTextColor(Color.parseColor("#FFFF00"));//TextView'in Text rengini değiştiriyoruzzz...
            }
        });
        buttonyesil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textViewmetin.setTextColor(Color.parseColor("#00FF00"));//TextView'in Text rengini değiştiriyoruzzz...
            }
        });
        buttonkalin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textViewmetin.setTypeface(Typeface.defaultFromStyle(Typeface.BOLD));//TextView in Text Özelliğini (Kalın,italik,normal) ayarlıyoruz...
            }
        });
        buttonitalik.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textViewmetin.setTypeface(Typeface.defaultFromStyle(Typeface.ITALIC));//TextView in Text Özelliğini (Kalın,italik,normal) ayarlıyoruz...
            }
        });
        buttonnormal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textViewmetin.setTypeface(Typeface.defaultFromStyle(Typeface.NORMAL));//TextView in Text Özelliğini (Kalın,italik,normal) ayarlıyoruz...
            }
        });
        buttonbuyut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                a=a+5;
                textViewmetin.setTextSize(a);//Text in text size (boyutunu) değiştiriyoruzz.....
            }
        });
        buttonkucult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                a=a-5;
                textViewmetin.setTextSize(a);//Text in text size (boyutunu) değiştiriyoruzz.....
                 /* float px=tvmetin.getTextSize();//TextView in boyutunu alıyoruz...Px olarak alıyor ama
                float sp=(px/getResources().getDisplayMetrics().scaledDensity);//px'i sp ye çevirme...
                Toast.makeText(MainActivity.this, "Yazı Boyutu: "+sp+"sp", Toast.LENGTH_SHORT).show();*/
            }
        });
    }
}
