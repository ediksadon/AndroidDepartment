package com.android.domain.model

data class ErrorModel(
    val message: String? = null,
    val code: Int = 500,
    var errorStatus: ErrorStatus = ErrorStatus.SERVER_ERROR
) {
    enum class ErrorStatus {
        NO_CONNECTION,
        TIMEOUT,
        SERVER_ERROR,
        UNAUTHORIZED,
        UNKNOWN,
        BAD_RESPONSE,
    }
}