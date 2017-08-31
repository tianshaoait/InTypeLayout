package com.tianshaoait.administrator.intypelayoutdome;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.tianshaoait.administrator.mylibrary.InTypeLayout;

public class MainActivity extends AppCompatActivity {

    InTypeLayout inTypeLayout;
    Button button1,button2;
    String aaaaaaaa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        inTypeLayout = (InTypeLayout) findViewById(R.id.main_intypelayout);
        button1 = (Button) findViewById(R.id.main_btn1);
        button2 = (Button) findViewById(R.id.main_btn2);
        if (aaaaaaaa == null) {
            inTypeLayout.show("数据错误", R.mipmap.ic_launcher);
        } else {
            inTypeLayout.clear();
        }
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                aaaaaaaa = null;
                if (aaaaaaaa == null) {
                    inTypeLayout.show("数据错误", R.mipmap.ic_launcher);
                } else {
                    inTypeLayout.clear();
                }
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                aaaaaaaa = "1";
                if (aaaaaaaa == null) {
                    inTypeLayout.show("数据错误", R.mipmap.ic_launcher);
                } else {
                    inTypeLayout.clear();
                }
            }
        });


    }
}
