package com.akhil.numshape;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    class Number {
        int number;

        public boolean isTri() {
            int x = 1;
            int tNum = 1;
            while (tNum < number) {
                x++;
                tNum = tNum + x;
            }
            if (tNum == number) {
                return true;
            } else {
                return false;
            }
        }

        public boolean isSq() {
            double sqR = Math.sqrt(number);

            if (sqR == Math.floor(sqR)) {
                return true;
            } else {
                return false;
            }
        }

    }
    public void testNum(View view){

            String message = "";
            EditText usNum = (EditText) findViewById(R.id.UserNumber);
            if(usNum.getText().toString().isEmpty()){
                message = "Please Enter a Number";
            }else {
                Number myNum = new Number();
                myNum.number = Integer.parseInt(usNum.getText().toString());
                if(myNum.isSq()){
                    if(myNum.isTri()){
                        message = myNum.number + " is both Triangular and Square !!";
                    }else{
                        message = myNum.number + " is Square but not Triangular";
                    }
                }else{
                    if(myNum.isTri()){
                        message = myNum.number + " is Triangular but not Square";
                    }else{
                        message = myNum.number + " is Square but not Triangular";
                    }
                }
            }
            Toast.makeText(getApplicationContext(), message, Toast.LENGTH_SHORT).show();
        }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
