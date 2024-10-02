package com.example.dndpromax;

import android.service.notification.NotificationListenerService;
import android.service.notification.StatusBarNotification;
import android.util.Log;

public class NotificationListener extends NotificationListenerService{

    public void onNotificationPosted(StatusBarNotification sbn){
        String package = sbn.getPackageName();
        // TODO idk what other data we need
    }

    private void process(String package, String title, String text){
        Log.d();
        // filter?
    }

}