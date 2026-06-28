package com.trinzflycam.app

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.trinzflycam.app.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setupStatusListener()
    }

    private fun setupStatusListener() {
        // MSDK V5 tự động xử lý việc hiển thị FPV qua FPVWidget
        binding.statusText.text = "DJI SDK V5 Initialized"
    }

    override fun onDestroy() {
        super.onDestroy()
    }
}
