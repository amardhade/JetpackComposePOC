package com.huddlemvp.data.api

import com.huddlemvp.data.model.ValidateEmailResponse

class ApiHelper(private val apiService: ApiService) {

    suspend fun verifyEmail(reqBody: HashMap<String, String>) = apiService.verifyEmail(reqBody)



    suspend fun doLogin(reqBody: HashMap<String, String>) = apiService.login(reqBody)

}