package com.github.hyeyeon2371.data

import com.github.hyeyeon2371.domain.UserEntity
import com.github.hyeyeon2371.domain.UserRepository
import javax.inject.Inject

class UserRepositoryImpl (private val apiService: ApiService) : UserRepository {
    override suspend fun getUserList(): List<UserEntity> {
        return apiService.getUserList()
    }
}