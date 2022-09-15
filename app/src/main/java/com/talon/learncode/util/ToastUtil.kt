package com.talon.learncode.util

import android.widget.Toast
import com.talon.learncode.app.BaseApplication

object ToastUtil {
    fun toast(message: String) {
        Toast.makeText(BaseApplication.getApp(), message, Toast.LENGTH_SHORT).show()
    }
}