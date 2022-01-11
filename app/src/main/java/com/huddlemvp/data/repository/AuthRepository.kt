package com.huddlemvp.data.repository

import com.huddlemvp.data.api.ApiHelper

class AuthRepository(private val apiHelper: ApiHelper) {

    //    suspend fun verifyEmail(reqParams: HashMap<String, String>): OHResponse<ValidateEmailResponse> {
//        val emailResponse = HuddleHandler(apiHelper.verifyEmail(reqParams))
////        if(emailResponse.success) {
////            return emailResponse
////        } else {
////            emailResponse.message = "Invalid credentials"
////            return emailResponse
////        }
//    }
    suspend fun verifyEmail(reqParams: HashMap<String, String>) = apiHelper.verifyEmail(reqParams)

}