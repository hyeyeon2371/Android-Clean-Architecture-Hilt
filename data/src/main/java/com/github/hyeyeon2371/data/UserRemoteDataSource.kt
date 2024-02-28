package com.github.hyeyeon2371.data

class UserRemoteDataSource (private val userApi: UserApi): UserDataSource.Remote {
    override fun getUserList(): Result<List<User>> {
       return userApi.getUserList()
    }
}