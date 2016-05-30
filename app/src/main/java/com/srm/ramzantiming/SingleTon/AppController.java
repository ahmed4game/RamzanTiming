package com.srm.ramzantiming.SingleTon;

import android.app.Application;

/**
 * Created by Ahmed on 5/30/2016.
 */
public class AppController extends Application {

    private static AppController ourInstance = new AppController();

    public static AppController getInstance() {
        return ourInstance;
    }

    public AppController() {
    }
}
