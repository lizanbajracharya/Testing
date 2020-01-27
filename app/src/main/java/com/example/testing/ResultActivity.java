package com.example.testing;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.TestLooperManager;
import android.widget.TextView;

public class ResultActivity extends AppCompatActivity {
    TextView tvResult;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
    Bundle bundle=getIntent().getExtras();
    String result=bundle.getString("result");
        tvResult=findViewById(R.id.tvResult);
        tvResult.setText("Result is "+result);
    }
}
