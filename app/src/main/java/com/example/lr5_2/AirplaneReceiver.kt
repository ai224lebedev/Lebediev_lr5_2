package com.example.lr5_2

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.util.Log

class AirplaneReceiver : BroadcastReceiver() {
    override fun onReceive(context: Context, intent: Intent) {
        val state = intent.getBooleanExtra("state", false)
        Log.d("AirplaneReceiver", "Авіарежим: ${if (state) "Увімкнено" else "Вимкнено"}")
    }
}