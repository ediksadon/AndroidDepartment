package com.android.domain.usecase

import com.android.domain.repository.UserRepository

class LoginUseCase(private val repository: UserRepository) {

    suspend fun invoke(email: String, password: String) = repository.login(email, password)
}