package com.huddlemvp

import android.app.Application
import com.huddlemvp.data.api.ErrorCodes
import java.lang.Error

class OHApplication: Application() {

    override fun onCreate() {
        super.onCreate()
        ErrorCodes.initErrorCodes(applicationContext)
    }
}