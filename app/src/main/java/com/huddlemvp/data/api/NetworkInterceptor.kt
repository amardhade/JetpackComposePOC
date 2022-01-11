package com.huddlemvp.data.api

import okhttp3.Interceptor
import okhttp3.OkHttpClient
import okhttp3.Request
import okhttp3.Response


class NetworkInterceptor : Interceptor {

    private lateinit var response: Response

    override fun intercept(chain: Interceptor.Chain?): Response {
        val original: Request = chain?.request()!!
        val requestWithHeader = original.newBuilder()
        response = chain.proceed(addHeaders(requestWithHeader, original).build())

//        if (!response.isSuccessful && response.code() != 401) {
//            return Response.Builder()
//                    .code(response.code())
//                    .request(chain.request())
//                    .protocol(Protocol.HTTP_2)
//                    .body(ResponseBody.create(MediaType.parse("{}"), "{}"))
//                    .message(response.message())
//                    .build()
//        }
        return response
    }

    private fun addHeaders(requestBuilder: Request.Builder?, original: Request): Request.Builder {
        requestBuilder?.header("session-token", "")
        requestBuilder?.header("api-key", "MIIC4DCCAcigAwIBAgIQKCF4iDA3REFS")
        requestBuilder?.header("api-secret", "MIIC6WQIKdKgAwIBAgIQGATGYHS2YGHH")
        requestBuilder?.header("platform-unique-id", "")
        requestBuilder?.header("locale", "en")
        requestBuilder?.header("platform", "android")
        requestBuilder?.header("user-type", "player")
        requestBuilder?.header("app-version", "1.0.0")
        requestBuilder?.method(original.method(), original.body())
        return requestBuilder!!
    }
}