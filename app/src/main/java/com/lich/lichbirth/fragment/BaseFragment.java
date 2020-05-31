package com.lich.lichbirth.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

import com.lich.lichbirth.activity.BaseActivity;

/**
 * Created by lichhowger on 2020/5/31.
 */
abstract class BaseFragment extends Fragment {

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
}
