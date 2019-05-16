package com.example.studyapp_1;

import android.graphics.Paint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.widget.TextView;

public class TextViewActivity extends AppCompatActivity {

    public TextView textView,textView1,textView2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_text_view);
        textView=findViewById(R.id.text4);
        textView.getPaint().setFlags(Paint.STRIKE_THRU_TEXT_FLAG);//中划线
        textView.getPaint().setAntiAlias(true);

        textView1=findViewById(R.id.text5);
        textView1.setText(Html.fromHtml("<u><i>简介</i></u>"));

        textView2=findViewById(R.id.text6);
        textView2.setSelected(true);
        textView2.requestFocus();
    }
}
