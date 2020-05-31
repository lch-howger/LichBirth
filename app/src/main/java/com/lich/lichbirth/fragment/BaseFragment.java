package com.lich.lichbirth.fragment;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

import com.lich.lichbirth.activity.BaseActivity;

/**
 * Created by lichhowger on 2020/5/31.
 */
public abstract class BaseFragment extends Fragment {

    public BaseActivity ctx;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(getLayoutId(), container, false);
        if (view != null) {
            initView(view);
        }
        return view;
    }

    public abstract int getLayoutId();

    public abstract void initView(View view);

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof BaseActivity) {
            ctx = (BaseActivity) context;
        }
    }

    public void showToast(String text) {
        ctx.showToast(text);
    }
}
