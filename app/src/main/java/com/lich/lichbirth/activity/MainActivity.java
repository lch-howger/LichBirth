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


        HomeFragment homeFragment = new HomeFragment();
        EditFragment editFragment = new EditFragment();
        MeFragment meFragment = new MeFragment();

        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.add(homeFragment, "Home");
        transaction.add(editFragment, "Edit");
        transaction.add(meFragment, "Me");
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
    }

    private void selectPage(int i) {
iv_home.setImageResource(R.mipmap.home);
iv_edit.setImageResource(R.mipmap.edit);
iv_me.setImageResource(R.mipmap.me);
tv_home.setTextColor(ColorUtil.getColor(R.color.c_999));
tv_edit.setTextColor(ColorUtil.getColor(R.color.c_999));
tv_me.setTextColor(ColorUtil.getColor(R.color.c_999));
        if (i == 0) {
            iv_home.setImageResource(R.mipmap.home_fill);
            tv_home.setTextColor(ColorUtil.getColor(R.color.color_theme_blue));
        } else if (i == 1) {
            iv_edit.setImageResource(R.mipmap.edit_fill);
            tv_edit.setTextColor(ColorUtil.getColor(R.color.color_theme_blue));
        }else if (i == 2) {
            iv_me.setImageResource(R.mipmap.me_fill);
            tv_me.setTextColor(ColorUtil.getColor(R.color.color_theme_blue));
        }
    }
}