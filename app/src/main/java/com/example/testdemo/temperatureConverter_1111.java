package com.example.testdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class temperatureConverter_1111 extends AppCompatActivity {
    private Button convertionBTN;
    private TextView showAns;
    private EditText getVal;
    private RadioButton c2f,f2c;
    private Double x;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_temperature_converter1111);

        //referencing
        convertionBTN = (Button) findViewById(R.id.convrtBtn);
        showAns = (TextView) findViewById(R.id.showAnsId);
        getVal = (EditText) findViewById(R.id.getValId);
        c2f = (RadioButton) findViewById(R.id.c2fId);
        f2c = (RadioButton) findViewById(R.id.f2cId);

       convertionBTN.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               if (getVal.getText().toString().isEmpty()){
                   showAns.setText("Pleease Enter Temperature Number: ");
               }else {
                   x = Double.parseDouble(String.valueOf(getVal.getText()));
                   if (c2f.isChecked()) {
                       x = (x * 9) / 5 + 32;
                       //this is equation
                       showAns.setText(String.valueOf(x));
                   }else if (f2c.isChecked()){
                           x = (x-32) * 5/9;
                           showAns.setText(String.valueOf(x) );
                       }
               }
           }
       });
    }
}


