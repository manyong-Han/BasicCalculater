package com.example.calculater_test;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    Button b_plus;
    Button b_minus;
    Button b_multi;
    Button b_div;

    EditText e_num1;
    EditText e_num2;
    TextView e_res;

    String num1 = "";
    String num2 = "";
    String res = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b_plus = (Button) findViewById(R.id.b_plus);
        b_minus = (Button) findViewById(R.id.b_minus);
        b_multi = (Button) findViewById(R.id.b_multi);
        b_div = (Button) findViewById(R.id.b_div);

        e_num1 = (EditText) findViewById(R.id.edit_num1);
        e_num2 = (EditText) findViewById(R.id.edit_num2);
        e_res = (TextView) findViewById(R.id.edit_res);

        b_plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1 = e_num1.getText().toString();
                num2 = e_num2.getText().toString();

                if(num1.isEmpty() || num2.isEmpty()){
                    Toast.makeText(MainActivity.this, "숫자를 모두 입력해주세요.", Toast.LENGTH_SHORT).show();
                    return;
                }

                res = String.valueOf(Integer.parseInt(num1) + Integer.parseInt(num2));
                e_res.setText(res);
            }
        });

        b_minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1 = e_num1.getText().toString();
                num2 = e_num2.getText().toString();

                if(num1.isEmpty() || num2.isEmpty()){
                    Toast.makeText(MainActivity.this, "숫자를 모두 입력해주세요.", Toast.LENGTH_SHORT).show();
                    return;
                }

                res = String.valueOf(Integer.parseInt(num1) - Integer.parseInt(num2));
                e_res.setText(res);
            }
        });

        b_multi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1 = e_num1.getText().toString();
                num2 = e_num2.getText().toString();

                if(num1.isEmpty() || num2.isEmpty()){
                    Toast.makeText(MainActivity.this, "숫자를 모두 입력해주세요.", Toast.LENGTH_SHORT).show();
                    return;
                }

                res = String.valueOf(Integer.parseInt(num1) * Integer.parseInt(num2));
                e_res.setText(res);
            }
        });

        b_div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1 = e_num1.getText().toString();
                num2 = e_num2.getText().toString();

                if(num1.isEmpty() || num2.isEmpty()){
                    Toast.makeText(MainActivity.this, "숫자를 모두 입력해주세요.", Toast.LENGTH_SHORT).show();
                    return;
                }

                res = String.valueOf(Integer.parseInt(num1) / Integer.parseInt(num2));
                e_res.setText(res);
            }
        });
    }
}
