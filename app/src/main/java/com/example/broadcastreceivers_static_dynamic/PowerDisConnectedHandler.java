package com.example.broadcastreceivers_static_dynamic;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class PowerDisConnectedHandler extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        //        TO get the Action provided within <intent-filter> in Android.manifest-->
        String off=intent.getAction();
        if (off.equals(Intent.ACTION_POWER_DISCONNECTED)){
            Toast.makeText(context, "Not Charging", Toast.LENGTH_SHORT).show();
        }
    }
}
