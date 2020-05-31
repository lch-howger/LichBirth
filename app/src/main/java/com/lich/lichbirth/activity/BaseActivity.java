package com.lich.lichbirth.activity;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.lich.lichbirth.R;

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
}