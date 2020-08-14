package com.cupinkie.startatbooted

import android.content.Context
import android.content.Intent
import android.net.Uri
import android.os.Build
import android.os.Bundle
import android.os.PowerManager
import android.util.Log
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.v("Activity", "启动啦~")
        Log.v("Activity", "启动啦~")
        Log.v("Activity", "启动啦~")
        Log.v("Activity", "启动啦~")
        Log.v("Activity", "启动啦~")
        Log.v("Activity", "启动啦~")
        Log.v("Activity", "启动啦~")




        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            val powerManager = getSystemService(Context.POWER_SERVICE) as PowerManager
            val hasIgnored = powerManager.isIgnoringBatteryOptimizations(this.getPackageName())
            //  判断当前APP是否有加入电池优化的白名单，如果没有，弹出加入电池优化的白名单的设置对话框。
            if (!hasIgnored) {
                val intent = Intent(android.provider.Settings.ACTION_REQUEST_IGNORE_BATTERY_OPTIMIZATIONS)
                intent.data = Uri.parse("package:" + this.getPackageName())
                startActivity(intent)
            }
        }
        Toast.makeText(this, "主程序启动啦~", Toast.LENGTH_LONG).show()



    }
}