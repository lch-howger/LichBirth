package com.lich.lichbirth.activity;

import android.os.Bundle;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.lich.lichbirth.util.StringUtil;

public abstract class BaseActivity extends AppCompatActivity {

    public BaseActivity ctx;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ctx = this;

        setContentView(getLayoutId());
        initViews();
    }

    public abstract int getLayoutId();

    public abstract void initViews();

    public void showToast(String text) {
        if (!StringUtil.isEmpty(text)) {
            Toast.makeText(ctx, text, Toast.LENGTH_SHORT).show();
        }
    }
}