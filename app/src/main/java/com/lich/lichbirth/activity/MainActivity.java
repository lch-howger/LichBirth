package com.lich.lichbirth.activity;

import androidx.fragment.app.FragmentTransaction;

import com.lich.lichbirth.R;
import com.lich.lichbirth.fragment.EditFragment;
import com.lich.lichbirth.fragment.HomeFragment;
import com.lich.lichbirth.fragment.MeFragment;

public class MainActivity extends BaseActivity {

    @Override
    public int getLayoutId() {
        return R.layout.activity_main;
    }

    @Override
    public void initViews() {
        HomeFragment homeFragment = new HomeFragment();
        EditFragment editFragment = new EditFragment();
        MeFragment meFragment = new MeFragment();

        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.add(homeFragment, "Home");
        transaction.add(editFragment, "Edit");
        transaction.add(meFragment, "Me");
        transaction.commitAllowingStateLoss();

        
    }
}