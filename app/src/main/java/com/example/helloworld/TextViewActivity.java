package com.example.helloworld;

import android.graphics.Paint;
import android.os.Bundle;
import android.text.Html;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class TextViewActivity extends AppCompatActivity {

    private TextView mtv4;
    private TextView mtv5,mtv6;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_text_view);
        mtv4 =(TextView) findViewById(R.id.tv_4); //未强转
        mtv4.getPaint().setFlags(Paint.STRIKE_THRU_TEXT_FLAG);//中划线
        mtv4.getPaint().setAntiAlias(true);//去锯齿

        mtv5 = findViewById(R.id.tv_5);
        mtv5.getPaint().setFlags(Paint.UNDERLINE_TEXT_FLAG);  //下划线
        mtv5.getPaint().setAntiAlias(true);//去锯齿

        mtv6 = findViewById(R.id.tv_6);
        mtv6.setText(Html.fromHtml("<u>afy_HelloWorld<u>"));
    }
}