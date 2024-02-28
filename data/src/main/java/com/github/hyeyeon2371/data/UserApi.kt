package com.github.hyeyeon2371.data

import retrofit2.http.GET

interface UserApi {
    @GET("/users")
    fun getUserList(): Result<List<User>>
}