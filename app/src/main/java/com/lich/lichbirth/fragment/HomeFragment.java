package com.lich.lichbirth.fragment;

import android.view.View;
import android.widget.ImageView;

import com.lich.lichbirth.R;

/**
 * Created by lichhowger on 2020/5/31.
 */
public class HomeFragment extends BaseFragment {

    private ImageView iv_plus;

    @Override
    public int getLayoutId() {
        return R.layout.fragment_home;
    }

    @Override
    public void initView(View view) {
        iv_plus = view.findViewById(R.id.iv_plus);


        iv_plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
showToast("dafds");
            }
        });
    }
}
