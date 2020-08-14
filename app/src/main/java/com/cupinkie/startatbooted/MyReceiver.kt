package com.cupinkie.startatbooted

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.util.Log
import android.widget.Toast

class MyReceiver : BroadcastReceiver() {

    override fun onReceive(context: Context, intent: Intent) {
        // This method is called when the BroadcastReceiver is receiving an Intent broadcast.
        Log.v("Receive", "启动啦~")
        Log.v("Receive", "启动啦~")
        Log.v("Receive", "启动啦~")
        Log.v("Receive", "启动啦~")
        Log.v("Receive", "启动啦~")
        Log.v("Receive", "启动啦~")
        Log.v("Receive", "启动啦~")
        Toast.makeText(context, "监听器启动啦~", Toast.LENGTH_LONG).show()
        val intent = Intent(context, MainActivity::class.java)
        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
        context.startActivity(intent)
    }
}
