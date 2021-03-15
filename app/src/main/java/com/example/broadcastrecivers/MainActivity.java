package com.example.broadcastrecivers;

import androidx.appcompat.app.AppCompatActivity;

import android.content.BroadcastReceiver;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button broadcastReceiver;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        broadcastReceiver = findViewById(R.id.broadreceiverBtn);
        broadcastReceiver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                BroadcastReceiver broadcastReceiver = new BoradCastReciver();
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_GET_CONTENT);
                sendBroadcast(intent);
            }
        });
    }
}