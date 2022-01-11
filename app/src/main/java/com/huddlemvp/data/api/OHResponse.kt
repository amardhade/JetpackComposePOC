package com.huddlemvp.data.api
import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class OHResponse<T> {

    @SerializedName("success")
    @Expose
    var success: Boolean = false

    @SerializedName("message")
    @Expose
    var message: String? = null

    @SerializedName("message_code")
    @Expose
    var messageCode: Int = 0

    @SerializedName("data")
    @Expose
    var data: T ?= null
}