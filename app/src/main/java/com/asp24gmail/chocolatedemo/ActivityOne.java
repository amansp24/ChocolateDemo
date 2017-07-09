package com.asp24gmail.chocolatedemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class ActivityOne extends AppCompatActivity implements View.OnClickListener{

    EditText eTxtM;
    Button submit;
    public void initView(){
        eTxtM = (EditText)findViewById(R.id.editText);
        submit = (Button)findViewById(R.id.button);
        submit.setOnClickListener(this);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_one);

        initView();
    }

    @Override
    public void onClick(View view) {
        String intm = eTxtM.getText().toString().trim();
        int m = Integer.parseInt(intm);
        Intent intent = new Intent(ActivityOne.this, ActivityTwo.class);
        intent.putExtra("integerM", m);
        startActivity(intent);
    }
}
