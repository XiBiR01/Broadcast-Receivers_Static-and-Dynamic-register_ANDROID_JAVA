package com.example.broadcastreceivers_static_dynamic;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    AirplaneModeChanged airplaneModeChanged;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        Static Broadcast Receiver in XML-->
/*
       <receiver
        android:name=".PowerConnectedHandler"
        android:enabled="true"
        android:exported="true">
            <intent-filter>
                <action android:name="android.intent.action.ACTION_POWER_CONNECTED"/>
            </intent-filter>
       </receiver>
*/
    }

    @Override
    protected void onResume() {
        super.onResume();
//        Dynamic Broadcast Receiver -->
        airplaneModeChanged=new AirplaneModeChanged();
        IntentFilter filter=new IntentFilter(Intent.ACTION_AIRPLANE_MODE_CHANGED);
        registerReceiver(airplaneModeChanged,filter);

    }

    @Override
    protected void onStop() {
        super.onStop();
//        Unregister Intent to prevent Memory Leak
        unregisterReceiver(airplaneModeChanged);
    }
}