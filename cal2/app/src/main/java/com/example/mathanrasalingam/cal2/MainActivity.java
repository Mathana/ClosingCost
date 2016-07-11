package com.example.mathanrasalingam.cal2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.InputType;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final EditText edittext1 = (EditText) findViewById(R.id.editText1);
        final EditText edittext2 = (EditText) findViewById(R.id.editText2);


        edittext2.setInputType(InputType.TYPE_NULL);
        edittext2.setOnClickListener(new View.OnClickListener() {
           @Override
            public void onClick(View v) {
            String input = edittext1.getText().toString();

            Double inputValue = Double.valueOf(input);

            Double result = inputValue * 2.5/100.00 ;
            edittext2.setText(result.toString());
           }
        });

    }
}
