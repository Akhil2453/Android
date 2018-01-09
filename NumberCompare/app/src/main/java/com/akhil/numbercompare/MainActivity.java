package com.akhil.numbercompare;

import android.support.v7.app.AppCompatActivity;
import java.util.*;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    int n;

    public void makeToast(String string){
        Toast.makeText(MainActivity.this, string, Toast.LENGTH_SHORT).show();
    }
    public void guess(View view){

        EditText guessEditText = (EditText) findViewById(R.id.guessEditText);

        int guessInt = Integer.parseInt(guessEditText.getText().toString());

        if (guessInt < n){
            makeToast("Higher");
        }else if (guessInt > n){
            makeToast("Lower");
        }else {
            makeToast("That's Right!!  Try Again");

            Random rand = new Random();
            n = rand.nextInt(20) + 1;
        }

        //Toast.makeText(MainActivity.this, guessEditText.getText().toString(), Toast.LENGTH_SHORT).show();


    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Random rand = new Random();
        n = rand.nextInt(20) + 1;
    }
}
