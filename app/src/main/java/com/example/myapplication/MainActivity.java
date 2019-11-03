package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
         super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
      final   EditText name = findViewById(R.id.editText);
       final EditText number = findViewById(R.id.editText2);
        final Button but = findViewById(R.id.button);

        but.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double d1 = Double.parseDouble(name.getText().toString());
                double d2 = Double.parseDouble(number.getText().toString());
                double re = d1 + d2*3;
                Toast.makeText(getApplicationContext(),"your order is"+re,Toast.LENGTH_LONG).show();
            }
        });

    }
}
