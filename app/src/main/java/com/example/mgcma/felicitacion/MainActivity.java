package com.example.mgcma.felicitacion;

import android.graphics.Typeface;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Typeface miFuente = Typeface.createFromAsset(getAssets(), "Merry Xmas.ttf");
        TextView titulo = findViewById(R.id.textView);
        titulo.setTypeface(miFuente);

        Typeface miFuente2 = Typeface.createFromAsset(getAssets(), "SnowForSanta.ttf");
        TextView fecha = findViewById(R.id.textView1);
        fecha.setTypeface(miFuente2);

        //MediaPlayer mediaPlayer = MediaPlayer.create(this,R.raw.noche);
        //mediaPlayer.start();


    }
}
