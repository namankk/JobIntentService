package com.rultech.naman.jobintentservice;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

public class MyReceiver extends BroadcastReceiver {
    String TAG="namankashyap";
    @Override
    public void onReceive(Context context, Intent intent) {
        String intentMy=intent.getAction();
        Log.i(TAG, "onReceive: broadcastreceiver");
            MyService.enqueueWork(context, new Intent());

    }
}
