package com.huddlemvp.data.model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class ValidateEmailResponse {

    @SerializedName("user_type")
    @Expose
    var userType: String? = null

    @SerializedName("login_type")
    @Expose
    var loginType: String? = null

    @SerializedName("company_id")
    @Expose
    var companyId: Int = 0

    @SerializedName("is_idp_user")
    @Expose
    var isIdpUser: Boolean = false

    @SerializedName("profile_image")
    @Expose
    var profileImage: String? = null

    @SerializedName("email")
    @Expose
    var email: String? = null

    @SerializedName("idp_user")
    @Expose
    var idpUser: IdpUser? = null

    inner class IdpUser {

        @SerializedName("idp_name")
        @Expose
        var idpName: String? = null

        @SerializedName("saml_url")
        @Expose
        var samlUrl: String? = null

        @SerializedName("call_back_url")
        @Expose
        var callBackUrl: String? = null

    }
}