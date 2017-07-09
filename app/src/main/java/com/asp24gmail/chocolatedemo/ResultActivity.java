package com.asp24gmail.chocolatedemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;

public class ResultActivity extends AppCompatActivity implements View.OnClickListener{

    TextView result;
    Button goBack;
    public void initValue(){
        result = (TextView)findViewById(R.id.textView3);
        goBack = (Button)findViewById(R.id.button3);
        goBack.setOnClickListener(this);

        //result
        Intent reference = getIntent();
        ArrayList<Integer> newArray = reference.getIntegerArrayListExtra("arrayList");
        int M = reference.getIntExtra("intM", 0);
        int N = reference.getIntExtra("noChocolates",0);
        int X = 0;
        int count = 0;
        while (newArray.get(X) != 0){
            newArray.set(X, 0);
            X = (X+M)%N;
            count++;
        }
        result.setText("You Ate "+count+" Chocolates");
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        initValue();
    }

    @Override
    public void onClick(View view) {
        Intent intent = new Intent(ResultActivity.this, ActivityOne.class);
        startActivity(intent);
    }
}
