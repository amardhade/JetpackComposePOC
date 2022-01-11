package com.huddlemvp.viewModels

import androidx.lifecycle.ViewModel
import androidx.lifecycle.liveData
import com.huddlemvp.data.api.Resource
import com.huddlemvp.data.api.Resource.Companion.parseResponse
import com.huddlemvp.data.repository.AuthRepository
import kotlinx.coroutines.Dispatchers

class AuthViewModel(private val authRepository: AuthRepository) : ViewModel() {

    fun verifyEmail(email: String) = liveData(Dispatchers.IO) {
        emit(Resource.loading(data = null))
        val params = HashMap<String, String>()
        params["email"] = email
        try {
            emit(parseResponse(authRepository.verifyEmail(params)))
        } catch (e: Exception) {
            emit(Resource.networkError(data = null, errorMsg = e.message!!))
        }
    }


}

