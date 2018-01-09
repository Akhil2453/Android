package com.akhil.toastdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void clickFunc(View view){

        EditText text = (EditText) findViewById(R.id.Text1);

        Log.i("Info", text.getText().toString());

        Toast.makeText(MainActivity.this, "HI there " + text.getText().toString() + "!!", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
