package com.cupinkie.startatbooted

import android.accessibilityservice.AccessibilityService
import android.content.Intent
import android.util.Log
import android.view.accessibility.AccessibilityEvent
import android.widget.Toast

class AccessibilityService : AccessibilityService() {
    override fun onServiceConnected() {
        super.onServiceConnected()
    }

    override fun onAccessibilityEvent(event: AccessibilityEvent) {
        // 此方法是在主线程中回调过来的，所以消息是阻塞执行的
        val intent = Intent(this, MainActivity::class.java)
        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
        this.startActivity(intent)
        Log.v("Accessibility", "启动啦~")
        Log.v("Accessibility", "启动啦~")
        Log.v("Accessibility", "启动啦~")
        Log.v("Accessibility", "启动啦~")
        Log.v("Accessibility", "启动啦~")
        Log.v("Accessibility", "启动啦~")
        Log.v("Accessibility", "启动啦~")
        Toast.makeText(this, "无障碍启动啦~", Toast.LENGTH_LONG).show()
    }

    override fun onInterrupt() {}
}