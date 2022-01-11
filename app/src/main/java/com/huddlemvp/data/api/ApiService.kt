package com.huddlemvp.data.api

import com.huddlemvp.data.model.ValidateEmailResponse
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.POST

interface ApiService {

    @POST(CHECK_LOGIN_EMAIL)
    suspend fun verifyEmail(@Body reqBody: HashMap<String, String>): OHResponse<ValidateEmailResponse>

    @POST(USER_LOGIN)
    suspend fun login(@Body passwordValidator: HashMap<String, String>)

}