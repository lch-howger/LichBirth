package com.lich.lichbirth.view;


import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;

import androidx.appcompat.widget.AppCompatImageView;

import com.lich.lichbirth.R;

/**
 * Created by lichhowger on 2020/5/31.
 */
public class TouchImageView extends AppCompatImageView {

    public TouchImageView(Context context) {
        super(context);
    }

    public TouchImageView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public TouchImageView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        int action = event.getAction();
        if (action == MotionEvent.ACTION_DOWN) {
            setImageResource(R.mipmap.ic_plus_dark);
        } else if (action == MotionEvent.ACTION_UP) {
            setImageResource(R.mipmap.ic_plus);
        }
        return super.onTouchEvent(event);
    }
}
