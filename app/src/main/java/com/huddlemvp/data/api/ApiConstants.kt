package com.huddlemvp.data.api

const val BASE_URL = "https://dev-api.1huddle.co"
private const val API = "/api/rest"
private const val VERSION_1_5 = "/v1.5"
private const val VERSION_1_6 = "/v1.6"
private const val VERSION_2_0 = "/v2.0"
private const val VERSION_2_1 = "/v2.1"
private const val VERSION_2_5 = "/v2.5"
private const val VERSION_2_7 = "/v2.7"
private const val SUB_DOMAIN_V15 = API + VERSION_1_5
private const val LOGIN = "$SUB_DOMAIN_V15/login"
private const val AUTH = "$SUB_DOMAIN_V15/auth"
const val CHECK_LOGIN_EMAIL = "$LOGIN/check_login_email"
const val USER_LOGIN = "$AUTH/login"
