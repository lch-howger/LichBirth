package com.lich.lichbirth.util;

import androidx.core.content.ContextCompat;

import com.lich.lichbirth.application.MainApplication;

/**
 * Created by lichhowger on 2020/2/4.
 */
public class ColorUtil {

    public static int getColor(int colorId) {
        int color = ContextCompat.getColor(MainApplication.getApp(), colorId);
        return color;
    }
}
