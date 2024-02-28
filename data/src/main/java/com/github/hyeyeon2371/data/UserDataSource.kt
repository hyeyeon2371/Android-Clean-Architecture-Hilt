package com.github.hyeyeon2371.data

interface UserDataSource{
    interface Remote {
        fun getUserList(): Result<List<User>>
    }
    interface Local {
        fun getUserList() : Result<List<User>>
    }
}