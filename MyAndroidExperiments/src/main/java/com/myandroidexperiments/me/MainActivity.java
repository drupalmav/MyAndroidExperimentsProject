package com.myandroidexperiments.me;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button button_Hello = (Button) findViewById(R.id.btnHello);
        final TextView tvHello = (TextView) findViewById(R.id.tvHello);

        tvHello.setText("No Action Yet");

        button_Hello.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvHello.setText("Hello button just pressed");
            }
        });
    }

    @Override
    protected void onPause() {
        super.onPause();
        finish();
    }
}
