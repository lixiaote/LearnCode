package com.talon.learncode

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.lifecycleScope
import com.talon.learncode.databinding.ActivitySplashBinding
import com.talon.learncode.home.HomeActivity
import com.talon.learncode.util.ToastUtil
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class SplashActivity : AppCompatActivity() {
    private var binding: ActivitySplashBinding? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySplashBinding.inflate(layoutInflater)
        setContentView(binding!!.root)
        binding?.btnStart?.setOnClickListener {
            ToastUtil.toast("hello kotlin")

        }

        delayTask()
    }



    private fun delayTask() {
        //默认主线程. 它会监听Activity生命周期, 不需要手动 cancel()
        lifecycleScope.launch {
            delay(1500L)
            goHome();
        }
    }

    private fun goHome() {
        val intent = Intent(this, HomeActivity::class.java)
        startActivity(intent)
    }

}



