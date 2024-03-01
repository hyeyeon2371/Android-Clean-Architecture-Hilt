package com.github.hyeyeon2371.domain

interface UserRepository {
    suspend fun getUserList() : List<UserEntity>
}