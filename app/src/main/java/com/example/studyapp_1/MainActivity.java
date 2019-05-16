package com.example.studyapp_1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button textViewButton;
    private Button buttonViewButton,editTextButton,radioButton,checkboxButton,imageViewButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textViewButton=findViewById(R.id.button);
        buttonViewButton=findViewById(R.id.btn_tz);
        editTextButton=findViewById(R.id.btn_edit);
        radioButton=findViewById(R.id.btn_radio);
        checkboxButton=findViewById(R.id.btn_checkbox);
        imageViewButton=findViewById(R.id.btn_imageView);
        SetListener();
    }

    private  void  SetListener()
    {
        OnClick onClick=new OnClick();
        textViewButton.setOnClickListener(onClick);
        buttonViewButton.setOnClickListener(onClick);
        editTextButton.setOnClickListener(onClick);
        radioButton.setOnClickListener(onClick);
        checkboxButton.setOnClickListener(onClick);
        imageViewButton.setOnClickListener(onClick);
    }

    private  class  OnClick implements View.OnClickListener{

        Intent intent=null;
        @Override
        public void onClick(View v) {
            switch (v.getId())
            {
                case  R.id.button:
                    intent=new Intent(MainActivity.this,TextViewActivity.class);
                    break;
                case R.id.btn_tz:
                    intent=new Intent(MainActivity.this,ButtonActivity.class);
                    break;
                case R.id.btn_edit:
                    intent=new Intent(MainActivity.this,EditTextActivity.class);
                    break;
                case R.id.btn_radio:
                    intent=new Intent(MainActivity.this,RadiobuttonActivity.class);
                    break;
                case R.id.btn_checkbox:
                    intent=new Intent(MainActivity.this,CheckBoxActivity.class);
                    break;
                case R.id.btn_imageView:
                    intent=new Intent(MainActivity.this,ImageViewActivity.class);
                    break;
            }
            startActivity(intent);
        }
    }
}
