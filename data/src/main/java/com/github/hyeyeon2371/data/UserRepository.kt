package com.github.hyeyeon2371.data

import android.service.autofill.UserData
import javax.inject.Inject

class UserRepository @Inject constructor(private val remote:UserDataSource.Remote) {

    fun getUsrList() : Result<List<User>> {
        return remote.getUserList()
    }
}