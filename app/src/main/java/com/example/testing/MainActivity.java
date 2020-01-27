package com.example.testing;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText etFirst,etSecond;
    private TextView tvAns;
    private Button btnAdd,btnSubtract,btnDivide;
    Float first,second,result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvAns=findViewById(R.id.tvAns);
        etFirst=findViewById(R.id.etFirst);
        etSecond=findViewById(R.id.etSecond);
        btnAdd=findViewById(R.id.btnAdd);
        btnSubtract=findViewById(R.id.btnSubtract);
        btnDivide=findViewById(R.id.btnDivide);


        final Airthmetic airthmetic=new Airthmetic();
        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                first=Float.parseFloat(etFirst.getText().toString());
                second=Float.parseFloat(etSecond.getText().toString());
            result=airthmetic.add(first,second);
            Intent intent=new Intent(MainActivity.this,ResultActivity.class);
            intent.putExtra("result",result.toString());
            startActivity(intent);
            }
        });

        btnSubtract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                first=Float.parseFloat(etFirst.getText().toString());
                second=Float.parseFloat(etSecond.getText().toString());
                result=airthmetic.substract(first,second);
            }
        });

        btnDivide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                first=Float.parseFloat(etFirst.getText().toString());
                second=Float.parseFloat(etSecond.getText().toString());
                result=airthmetic.divide(first,second);
            }
        });
    }
}
