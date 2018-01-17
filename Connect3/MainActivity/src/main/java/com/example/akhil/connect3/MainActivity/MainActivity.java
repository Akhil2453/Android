package com.example.akhil.connect3.MainActivity;

import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    public void dropIn (View view){
        ImageView ximg = (ImageView) view;
        ximg.setTranslationY(-1000f);
        ximg.setImageResource(R.drawable.o);
        ximg.animate().translationYBy(1000f).setDuration(300);

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
