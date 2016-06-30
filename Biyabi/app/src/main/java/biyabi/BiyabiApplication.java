package biyabi;

import android.app.Application;
import android.content.Context;

import biyabi.util.RequestManager;

public class BiyabiApplication extends Application{
    public static String SERVER_ROOT = "http://mws1.biyabi.com/WebService.asmx/HomePageShow";
    public static Context applicationContext;

    @Override
    public void onCreate() {
        super.onCreate();
        applicationContext = this;
        RequestManager.init(applicationContext);
    }
}
