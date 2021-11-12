package com.android.domain.utils

import com.android.domain.model.ErrorModel

sealed class Result<out T> {

    class Success<out T>(val data: T) : Result<T>()
    class Failure(val error: ErrorModel) : Result<Nothing>()
}