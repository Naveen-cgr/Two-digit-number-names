package com.example.numbername;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
            EditText number;
            Button Add_Button;
            TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        number=(EditText) findViewById(R.id.editTextTextPersonName2);
        Add_Button=(Button) findViewById(R.id.button);
        result=(TextView) findViewById(R.id.textView2);

        Add_Button.setOnClickListener(new View.OnClickListener()
        {
            @SuppressLint("SetTextI18n")
            public void onClick(View v) {
                int num = Integer.parseInt(number.getText().toString());
                int n1 = num, n2 = num;
                int b = n1 % 10, a = n2 / 10;

                String[] single_digits = new String[]{"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
                String[] two_digits = new String[]{"", "ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};
                String[] tens_multiple = new String[]{"", "", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"};
                if (a == 1) {
                    result.setText(two_digits[b + 1]);
                } else if (b == 0)
                    result.setText(tens_multiple[a]);
                else
                    result.setText(tens_multiple[a] + "-" + single_digits[b]);
            }
        });

    }
}