package com.huddlemvp.data.api

data class Resource<out T>(val status: Status, val data: T?,val messageCode: Int, val message: String?) {
    companion object {
        fun <T> success(response: OHResponse<T>): Resource<T> =
            Resource(status = Status.SUCCESS, data = response.data, messageCode = 0, message = null)

        fun <T> apiError(data: T, errorMsg: String): Resource<T> =
            Resource(status = Status.API_ERROR, data = null, messageCode = 0, message = errorMsg)

        fun <T> networkError(data: T, errorMsg: String): Resource<T> =
            Resource(status = Status.NETWORK_ERROR, data = data, messageCode = 0, message = errorMsg)

        fun <T> loading(data: T?): Resource<T> =
            Resource(status = Status.LOADING, data = data, messageCode = 0, message = null)

        fun <T> parseResponse(response: OHResponse<T>): Resource<T> {
            return if (response.success) {
                Resource(status = Status.SUCCESS, data = response.data, messageCode = 0, message = null)
            } else {
                val errorMsg = "email not specified"
                Resource(status = Status.API_ERROR, data = null, messageCode = response.messageCode, message = response.message)
            }

        }
    }

}


enum class Status {
    LOADING, SUCCESS, NETWORK_ERROR, API_ERROR
}
