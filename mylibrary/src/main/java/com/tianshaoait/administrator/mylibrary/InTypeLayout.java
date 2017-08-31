package com.tianshaoait.administrator.mylibrary;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
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

    private static final int DEFAULT_TEXTSIZE = 16;

    private View content;
    private ColorStateList mTextColor;
    private int mTextSize = DEFAULT_TEXTSIZE;
    private int inTypeImageHeightWidth = 1;

    LinearLayout in_ly;
    ImageView in_img;
    TextView in_tx;

    public InTypeLayout(Context context) {
        super(context, null);
        init(context, null, 0);
    }

    public InTypeLayout(Context context, AttributeSet attrs) {
        super(context, attrs);
        init(context, attrs, 0);
    }

    public InTypeLayout(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        init(context, attrs, defStyle);
    }

    private void init(Context context, AttributeSet attrs, int defStyleAttr) {
        initAttrs(context, attrs, defStyleAttr);
    }

    private void initAttrs(Context context, AttributeSet attrs, int defStyleAttr) {
        TypedArray a = context.obtainStyledAttributes(attrs, R.styleable.InTypeLayout, defStyleAttr, 0);
        mTextColor = a.getColorStateList(R.styleable.InTypeLayout_inTypeTextColor);
        if (mTextColor == null) {
            mTextColor = ColorStateList.valueOf(getResources().getColor(android.R.color.primary_text_light));
        }
        int textSize = a.getDimensionPixelOffset(R.styleable.InTypeLayout_inTypeTextSize, 15);
        if (textSize != -1) {
            this.mTextSize = Util.px2sp(context, textSize);
        }
        inTypeImageHeightWidth = a.getInt(R.styleable.InTypeLayout_inTypeImageHeightWidth, 1);
        a.recycle();
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
        if (mTextColor != null){
            in_tx.setTextColor(mTextColor);
        }
        in_tx.setTextSize(mTextSize);
        if(inTypeImageHeightWidth != 1){
            LinearLayout.LayoutParams params= (LinearLayout.LayoutParams) in_img.getLayoutParams();
            params.height = inTypeImageHeightWidth;
            in_img.setLayoutParams(params);
        }
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
