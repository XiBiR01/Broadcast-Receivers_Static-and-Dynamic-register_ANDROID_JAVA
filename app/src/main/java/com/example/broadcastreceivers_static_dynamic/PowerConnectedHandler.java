package com.example.broadcastreceivers_static_dynamic;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class PowerConnectedHandler extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
//        TO get the Action provided within <intent-filter> in Android.manifest-->
        String on=intent.getAction();
        if (on.equals(Intent.ACTION_POWER_CONNECTED)){
            Toast.makeText(context, "Charging", Toast.LENGTH_SHORT).show();
        }
    }
}
