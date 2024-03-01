package com.github.hyeyeon2371.data

import com.github.hyeyeon2371.domain.UserEntity
import retrofit2.http.GET

interface ApiService {
    @GET("/users")
    suspend fun getUserList(): List<UserEntity>
}