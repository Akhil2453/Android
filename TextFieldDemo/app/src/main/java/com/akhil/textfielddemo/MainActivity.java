package com.akhil.textfielddemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    public void logIn(View view){

        EditText usernameTextEdit = (EditText) findViewById(R.id.UsernameEditText);
        EditText pwdTextEdit = (EditText) findViewById(R.id.passwordeditText2);

        Log.i("Username", usernameTextEdit.getText().toString());
        Log.i("Password", pwdTextEdit.getText().toString());

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
