package com.android.domain.repository

interface UserRepository {

    suspend fun login(email: String, password: String)
}