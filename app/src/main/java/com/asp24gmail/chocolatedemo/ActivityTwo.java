package com.asp24gmail.chocolatedemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.ArrayList;

public class ActivityTwo extends AppCompatActivity implements View.OnClickListener{

    EditText eTxtNumber;
    Button Submit;
    public void initValue(){
        eTxtNumber = (EditText)findViewById(R.id.editText2);
        Submit = (Button)findViewById(R.id.button2);
        Submit.setOnClickListener(this);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_two);
        initValue();
    }

    @Override
    public void onClick(View view) {
        String number = eTxtNumber.getText().toString().trim();
        int num = Integer.parseInt(number);
        Intent ref = getIntent();
        int numM = ref.getIntExtra("integerM", 0);
        ArrayList<Integer> chocolate = new ArrayList<Integer>();
        for (int i=0; i<num; i++){
            chocolate.add(1);
        }

        Intent intent = new Intent(ActivityTwo.this, ResultActivity.class);
        intent.putExtra("arrayList", chocolate);
        intent.putExtra("noChocolates", num);
        intent.putExtra("intM", numM);
        startActivity(intent);
    }
}
