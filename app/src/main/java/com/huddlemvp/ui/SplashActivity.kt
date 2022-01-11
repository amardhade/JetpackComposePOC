package com.huddlemvp.ui

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.PersistableBundle
import android.util.Log
import androidx.core.os.HandlerCompat.postDelayed
import com.google.firebase.remoteconfig.FirebaseRemoteConfig
import com.huddlemvp.R
import com.huddlemvp.base.BaseActivity

class SplashActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.splash_activity)


        val fetchRemoteConfig = FirebaseRemoteConfig.getInstance()
        fetchRemoteConfig.setDefaultsAsync(R.xml.default_configs)

        fetchRemoteConfig.fetchAndActivate().addOnCompleteListener {
            if(it.isSuccessful) {
                Log.d("Config, Success: ", it.result.toString())
//                fetchRemoteConfig.ac
                val primaryColor = fetchRemoteConfig.getString("primary_color")
                Log.d("Config, SucpColor: ", "" +primaryColor)
            }else {
                Log.d("Config, Erro: ", it.result.toString())
            }
        }

    }

    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState, persistentState)


    }
}