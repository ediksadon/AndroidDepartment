package com.android.data.net.dto

import com.google.gson.annotations.SerializedName

class UserDto(
    @SerializedName("id") val id: String?,

    @SerializedName("name") val name: String?,

    @SerializedName("email") val email: String?,
)