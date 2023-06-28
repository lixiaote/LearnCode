package com.talon.learncode.base

import android.os.Bundle
import android.os.PersistableBundle
import android.view.WindowManager
import androidx.annotation.LayoutRes
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding

/**
 * @Description:
 * @author: talon
 * @date: 2023年05月17日 13:51
 */

abstract class BaseMVVMActivity : AppCompatActivity() {

    protected inline fun <reified T : ViewDataBinding> binding(@LayoutRes resId: Int): Lazy<T> =
        lazy {
            DataBindingUtil.setContentView<T>(this, resId)
                .apply { lifecycleOwner = this@BaseMVVMActivity }
        }

    override fun onCreate(savedInstanceState: Bundle?) {
        window.setFlags(
            WindowManager.LayoutParams.FLAG_SECURE, WindowManager.LayoutParams.FLAG_SECURE
        )
        super.onCreate(savedInstanceState)
        startObserve()
        initView()
        initData()
    }

    abstract fun initData()

    abstract fun initView()

    abstract fun startObserve()
}