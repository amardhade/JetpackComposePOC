package com.huddlemvp.factory

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.huddlemvp.data.api.ApiHelper
import com.huddlemvp.data.repository.AuthRepository
import com.huddlemvp.viewModels.AuthViewModel

class ViewModelFactory(private val apiHelper: ApiHelper): ViewModelProvider.Factory {
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        if(modelClass.isAssignableFrom(AuthViewModel::class.java)) {
            return AuthViewModel(AuthRepository(apiHelper)) as T
        }
        throw IllegalArgumentException("Unknown ViewModel")

    }

}