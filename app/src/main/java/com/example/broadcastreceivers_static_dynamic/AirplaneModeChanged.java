package com.example.broadcastreceivers_static_dynamic;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class AirplaneModeChanged extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
//        Get the status of Airplane mode from onResume() dynamic Broadcast Receiver-->
        boolean on=intent.getBooleanExtra("state",false);
        if (on){
            Toast.makeText(context, "Airplane Mode On", Toast.LENGTH_SHORT).show();
        }
        else {
            Toast.makeText(context, "Airplane Mode Off", Toast.LENGTH_SHORT).show();
        }
    }
}
