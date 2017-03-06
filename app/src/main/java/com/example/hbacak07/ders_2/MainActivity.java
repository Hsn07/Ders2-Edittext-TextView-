package com.example.hbacak07.ders_2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText editTextisim;//XML(Tasarım dosyası) dosyasındaki kullandığımız nesne tipinde değişken tenımlıyoruz...
    TextView textViewisimler;
    Button buttonekle,buttonuygulama;
    String metin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editTextisim=(EditText)findViewById(R.id.editTextisim);//XML ve JAVA arasındaki nesne ve değişken arasındaki bağlantıyı kuruyoruz...
        textViewisimler=(TextView)findViewById(R.id.textViewisimler);
        buttonekle=(Button)findViewById(R.id.buttonekle);
        buttonuygulama=(Button)findViewById(R.id.buttonuygulama);
        buttonekle.setOnClickListener(new View.OnClickListener() {//Tıklanma iventi
            @Override
            public void onClick(View view) {
                textViewisimler.setText(editTextisim.getText());//Textview'in Text'ine EditText'in Text'ine atıyoruzz.
                //metin=textViewisimler.getText().toString();//String değişkene edittext'kin text'ini atadık
                //Toast.makeText(MainActivity.this, metin, Toast.LENGTH_SHORT).show();//Bunu da ekrana yazdırdık...
                Toast.makeText(MainActivity.this, "TextView yeni değer eklendi...", Toast.LENGTH_SHORT).show();

            }
        });
        buttonuygulama.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {//intent bir sayfadan diğer sayfaya geçmek için kullanıyoruz... Derste işlemedik...
                Intent git=new Intent(MainActivity.this,Main2Activity.class);//Intent oluşturuyoruz...
                startActivity(git);//ve oluşturmu olduğumuz intenti başlatıyoruz...
            }
        });
    }
}
