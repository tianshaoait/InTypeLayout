package com.tianshaoait.administrator.mylibrary;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

/**
 * Created by Administrator on 2017/7/6.
 */

public class InTypeLayout extends LinearLayout {


    private View content;

    LinearLayout in_ly;
    ImageView in_img;
    TextView in_tx;

    public InTypeLayout(Context context) {
        super(context, null);
    }

    public InTypeLayout(Context context, AttributeSet attrs) {
        super(context, attrs, 0);
    }

    @Override
    protected void onFinishInflate() {
        super.onFinishInflate();
        if (getChildCount() > 1) throw new IllegalStateException("只能包含一个子View");
        if (isInEditMode()) return;
        setOrientation(VERTICAL);
        content = getChildAt(0); // assume first child as content
        LayoutInflater.from(getContext()).inflate(R.layout.in_type_ly, this, true);
        in_ly = (LinearLayout) findViewById(R.id.in_ly);
        in_img = (ImageView) findViewById(R.id.in_img);
        in_tx = (TextView) findViewById(R.id.in_tx);
    }

    public void show(String message, int drawable) {
        in_ly.setVisibility(VISIBLE);
        content.setVisibility(GONE);
        in_img.setBackgroundResource(drawable);
        in_tx.setText(message);
    }

    public void clear() {
        in_ly.setVisibility(GONE);
        content.setVisibility(VISIBLE);
    }

}
