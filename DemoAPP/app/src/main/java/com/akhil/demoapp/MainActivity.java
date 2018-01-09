package com.akhil.demoapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    /*public void clickFunction(View view){

        //Toast.makeText(MainActivity.this, "Hi, there!!", Toast.LENGTH_SHORT).show();

        EditText myTextField = (EditText) findViewById(R.id.myTextField);

        Log.i("Info", myTextField.getText().toString());

        Toast.makeText(MainActivity.this, myTextField.getText().toString() + "!!", Toast.LENGTH_SHORT).show();
    }*/

    public void catFunc(View view){

        ImageView image = (ImageView) findViewById(R.id.imageView2);
        image.setImageResource(R.drawable.cat2);

        Log.i("Info", "cat changed");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
