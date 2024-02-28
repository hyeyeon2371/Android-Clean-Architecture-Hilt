package com.github.hyeyeon2371.domain

import javax.inject.Inject

class GetUserListUseCase @Inject constructor(private val userRepository: UserRepository){
    operator fun invoke(): List<UserEntity> = userRepository.getUserList()
}