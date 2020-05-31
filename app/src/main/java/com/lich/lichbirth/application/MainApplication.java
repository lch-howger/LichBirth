package com.lich.lichbirth.application;

import android.app.Application;

/**
 * Created by lichhowger on 2020/1/16.
 */
public class MainApplication extends Application {

    private static MainApplication app;

    @Override
    public void onCreate() {
        super.onCreate();
        app = this;
    }

    public static MainApplication getApp() {
        return app;
    }
}
