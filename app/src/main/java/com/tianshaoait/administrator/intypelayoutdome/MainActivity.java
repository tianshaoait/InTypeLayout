package com.tianshaoait.administrator.intypelayoutdome;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.tianshaoait.administrator.mylibrary.InTypeLayout;

public class MainActivity extends AppCompatActivity {

    InTypeLayout inTypeLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        inTypeLayout = (InTypeLayout) findViewById(R.id.main_intypelayout);
        String a = "";
        if (a == null) {
            inTypeLayout.show("数据错误", R.mipmap.ic_launcher);
        } else {
            inTypeLayout.clear();
        }
    }
}
