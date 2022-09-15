package com.talon.learncode.app

import android.app.Application
import android.content.Context
import com.talon.learncode.util.ProcessUtil.isMainProcess

class BaseApplication : Application() {

    override fun attachBaseContext(base: Context?) {
        super.attachBaseContext(base)
    }

    companion object {
        lateinit var instance: BaseApplication

        fun getApp(): BaseApplication {

            return instance
        }
    }

    override fun onCreate() {
        super.onCreate()
        instance = this;
        if (isMainProcess(this)) {
            init()
        }
    }

    private fun init() {
    }
}