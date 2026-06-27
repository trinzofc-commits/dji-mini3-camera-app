package com.trinzflycam.app

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.trinzflycam.app.databinding.ActivityMainBinding
import com.dji.sdk.v5.manager.SDKManager
import com.dji.sdk.v5.manager.interfaces.SDKManagerCallback
import com.dji.sdk.v5.common.register.DJISDKInitEvent
import com.dji.sdk.v5.common.error.IDJIError

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setupStatusListener()
    }

    private fun setupStatusListener() {
        // Trong thực tế, bạn sẽ lắng nghe sự kết nối của máy bay ở đây
        // MSDK V5 tự động xử lý việc hiển thị FPV qua FPVWidget
        binding.status_text.text = "DJI SDK V5 Initialized"
    }

    override fun onDestroy() {
        super.onDestroy()
    }
}
