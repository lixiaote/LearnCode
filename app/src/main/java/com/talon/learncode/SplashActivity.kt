package com.talon.learncode

import android.os.Bundle
import android.widget.Toast
import com.talon.learncode.app.BaseApplication
import com.talon.learncode.databinding.ActivitySplashBinding
import com.talon.learncode.util.ToastUtil

class SplashActivity : BaseActivity() {
    private var binding: ActivitySplashBinding? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySplashBinding.inflate(layoutInflater)
        setContentView(binding!!.root)
        binding?.btnStart?.setOnClickListener {
           // Toast.makeText(this, "hello kotlin", Toast.LENGTH_SHORT).show()
            ToastUtil.toast("hello kotlin")
         }
    }

    override fun initView() {

    }

    override fun initData() {
    }
}



