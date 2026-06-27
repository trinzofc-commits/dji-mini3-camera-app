package com.trinzflycam.app

import android.app.Application
import android.content.Context
import com.dji.sdk.v5.common.error.IDJIError
import com.dji.sdk.v5.common.register.DJISDKInitEvent
import com.dji.sdk.v5.manager.SDKManager
import com.dji.sdk.v5.manager.interfaces.SDKManagerCallback

class MApplication : Application() {

    override fun attachBaseContext(base: Context?) {
        super.attachBaseContext(base)
        com.cySdkyc.clx.Helper.install(this)
    }

    override fun onCreate() {
        super.onCreate()
        initSDK()
    }

    private fun initSDK() {
        SDKManager.getInstance().init(this, object : SDKManagerCallback {
            override fun onInitProcess(event: DJISDKInitEvent, total: Int) {
                // Progress
            }

            override fun onRegisterSuccess() {
                // Success
            }

            override fun onRegisterFailure(error: IDJIError) {
                // Failure
            }

            override fun onProductDisconnect(productId: Int) {
                // Disconnect
            }

            override fun onProductConnect(productId: Int) {
                // Connect
            }

            override fun onProductChanged(productId: Int) {
                // Changed
            }

            override fun onDatabaseDownloadProgress(current: Long, total: Long) {
                // DB Progress
            }
        })
    }
}
