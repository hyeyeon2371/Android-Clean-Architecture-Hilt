package com.github.hyeyeon2371.data

import com.github.hyeyeon2371.domain.UserEntity

data class User (val id : Int ,val login : String, val url: String) {
    fun User.toDomain() = UserEntity(id, login, url)
}
