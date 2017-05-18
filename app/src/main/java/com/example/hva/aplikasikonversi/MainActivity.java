package com.example.hva.aplikasikonversi;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.hva.aplikasikonversi.Panjang;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button3 = (Button) findViewById(R.id.buttonBil);
        Button button = (Button) findViewById(R.id.button);
        Button button1 = (Button) findViewById(R.id.button2);
        Button button2 = (Button) findViewById(R.id.button3);

        button.setOnClickListener(new View.OnClickListener() {



            public void onClick(View arg0) {

                // TODO Auto-generated method stub

                Intent i = new Intent(getApplicationContext(), Suhu.class);

                startActivity(i);
                //MainActivity.this.finish();

            }

        });

        button1.setOnClickListener(new View.OnClickListener() {



            public void onClick(View arg0) {

                // TODO Auto-generated method stub

                Intent i = new Intent(getApplicationContext(), Panjang.class);

                startActivity(i);
                //MainActivity.this.finish();

            }

        });

        button2.setOnClickListener(new View.OnClickListener() {



            public void onClick(View arg0) {

                // TODO Auto-generated method stub

                Intent i = new Intent(getApplicationContext(), Berat.class);

                startActivity(i);
                //MainActivity.this.finish();

            }

        });

        button3.setOnClickListener(new View.OnClickListener() {

            public void onClick(View arg0) {

                // TODO Auto-generated method stub

                Intent i = new Intent(getApplicationContext(), Bilangan.class);

                startActivity(i);
                //MainActivity.this.finish();

            }

        });

    }
}
