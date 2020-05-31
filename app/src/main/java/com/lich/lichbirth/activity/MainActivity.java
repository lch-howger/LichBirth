package com.lich.lichbirth.activity;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.fragment.app.FragmentTransaction;

import com.lich.lichbirth.R;
import com.lich.lichbirth.fragment.EditFragment;
import com.lich.lichbirth.fragment.HomeFragment;
import com.lich.lichbirth.fragment.MeFragment;
import com.lich.lichbirth.util.ColorUtil;

public class MainActivity extends BaseActivity {

    private LinearLayout ll_home;
    private LinearLayout ll_edit;
    private LinearLayout ll_me;
    private ImageView iv_home;
    private ImageView iv_edit;
    private ImageView iv_me;
    private TextView tv_home;
    private TextView tv_edit;
    private TextView tv_me;
    private HomeFragment homeFragment;
    private EditFragment editFragment;
    private MeFragment meFragment;

    @Override
    public int getLayoutId() {
        return R.layout.activity_main;
    }

    @Override
    public void initViews() {
        ll_home = findViewById(R.id.ll_home);
        ll_edit = findViewById(R.id.ll_edit);
        ll_me = findViewById(R.id.ll_me);
        iv_home = findViewById(R.id.iv_home);
        iv_edit = findViewById(R.id.iv_edit);
        iv_me = findViewById(R.id.iv_me);
        tv_home = findViewById(R.id.tv_home);
        tv_edit = findViewById(R.id.tv_edit);
        tv_me = findViewById(R.id.tv_me);


        homeFragment = new HomeFragment();
        editFragment = new EditFragment();
        meFragment = new MeFragment();

        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.add(R.id.ll_main, homeFragment, "Home");
        transaction.add(R.id.ll_main, editFragment, "Edit");
        transaction.add(R.id.ll_main, meFragment, "Me");
        transaction.commitAllowingStateLoss();

        ll_home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                selectPage(0);
            }
        });

        ll_edit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                selectPage(1);
            }
        });

        ll_me.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                selectPage(2);
            }
        });

        selectPage(0);
    }

    private void selectPage(int i) {
        iv_home.setImageResource(R.mipmap.home);
        iv_edit.setImageResource(R.mipmap.edit);
        iv_me.setImageResource(R.mipmap.me);
        tv_home.setTextColor(ColorUtil.getColor(R.color.c_999));
        tv_edit.setTextColor(ColorUtil.getColor(R.color.c_999));
        tv_me.setTextColor(ColorUtil.getColor(R.color.c_999));

        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.hide(homeFragment);
        transaction.hide(editFragment);
        transaction.hide(meFragment);

        if (i == 0) {
            iv_home.setImageResource(R.mipmap.home_fill);
            tv_home.setTextColor(ColorUtil.getColor(R.color.color_theme_blue));
            transaction.show(homeFragment);
        } else if (i == 1) {
            iv_edit.setImageResource(R.mipmap.edit_fill);
            tv_edit.setTextColor(ColorUtil.getColor(R.color.color_theme_blue));
            transaction.show(editFragment);
        } else if (i == 2) {
            iv_me.setImageResource(R.mipmap.me_fill);
            tv_me.setTextColor(ColorUtil.getColor(R.color.color_theme_blue));
            transaction.show(meFragment);
        }

        transaction.commitAllowingStateLoss();
    }
}