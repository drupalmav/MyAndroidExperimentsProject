package com.myandroidexperiments.me;

import android.app.Activity;
import android.content.Context;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.wifi.WifiManager;
import android.os.Bundle;
import android.text.InputType;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.ToggleButton;

/**
 * Created by home on 6/14/13.
 */
public class wifi extends Activity{

    TextView WifiState;
    Button ONwifi;
    Button OFFwifi;

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.wifi);

        WifiState = (TextView)findViewById(R.id.wifistate);

        /*
        //WORKS - Shows whether Wifi is connected or not
        //Requires this in manifest --> <uses-permission android:name="android.permission.ACCESS_NETWORK_STATE"></uses-permission>
        ConnectivityManager connManager = (ConnectivityManager) getSystemService(CONNECTIVITY_SERVICE);
        NetworkInfo wifi = connManager.getNetworkInfo(ConnectivityManager.TYPE_WIFI);

        if(wifi.isAvailable()){
            WifiState.setText("Yes WIFI is connected");
        }else {
            WifiState.setText("WIFI NOT connected");
        }
        */

        //WORKS - Able to turn the Wifi ON automatically and also detect if already ON
        final WifiManager wifiManager = (WifiManager)getSystemService(Context.WIFI_SERVICE);
        if(wifiManager.isWifiEnabled()){
            WifiState.setText("WiFi is ALREADY enabled - not doing anything");
        }else {
            WifiState.setText("WiFi was NOT enabled, just enabled WiFi");
            wifiManager.setWifiEnabled(true);
        }

        /*
        OFFwifi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                wifiManager.setWifiEnabled(false);
                WifiState.setText("Just turned off the WiFi");
            }
        });
        */
    }

    public void initialize(){
        ONwifi = (Button) findViewById(R.id.onwifi);
        OFFwifi = (Button) findViewById(R.id.offwifi);
    }
}