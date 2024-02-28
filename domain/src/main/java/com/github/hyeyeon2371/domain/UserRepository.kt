package com.github.hyeyeon2371.domain

interface UserRepository {
    fun getUserList() : List<UserEntity>
}