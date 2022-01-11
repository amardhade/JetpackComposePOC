package com.huddlemvp.ui.auth

import android.os.Bundle
import androidx.navigation.Navigation.findNavController
import com.huddlemvp.R
import com.huddlemvp.base.BaseActivity

class AuthActivity: BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_auth)
    }

    override fun onSupportNavigateUp() =
        findNavController(this, R.id.authFragmentHost).navigateUp()

}