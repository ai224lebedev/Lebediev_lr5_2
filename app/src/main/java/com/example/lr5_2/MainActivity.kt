package com.example.lr5_2

import android.content.Intent
import android.content.IntentFilter
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    private val powerReceiver = PowerReceiver()
    private val airplaneReceiver = AirplaneReceiver()

    override fun onStart() {
        super.onStart()
        registerReceiver(powerReceiver, IntentFilter(Intent.ACTION_POWER_CONNECTED))
        registerReceiver(airplaneReceiver, IntentFilter(Intent.ACTION_AIRPLANE_MODE_CHANGED))
    }

    override fun onStop() {
        super.onStop()
        unregisterReceiver(powerReceiver)
        unregisterReceiver(airplaneReceiver)
    }
}