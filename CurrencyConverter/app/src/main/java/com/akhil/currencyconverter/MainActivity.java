package com.akhil.currencyconverter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void onClick(View view){

        EditText currency = (EditText) findViewById(R.id.CurrencyEditText2);

        Double dollar = Double.parseDouble(currency.getText().toString());

        Double rupee = dollar * 63.99;

        //Toast.makeText(MainActivity.this, rupee.toString(), Toast.LENGTH_SHORT).show();
        Toast.makeText(MainActivity.this, String.format("%.2f", rupee), Toast.LENGTH_SHORT).show();

        Log.i("Info", "Convert");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
