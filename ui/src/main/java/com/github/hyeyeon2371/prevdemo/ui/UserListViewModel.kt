package com.github.hyeyeon2371.prevdemo.ui

import androidx.lifecycle.ViewModel
import com.github.hyeyeon2371.domain.GetUserListUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class UserListViewModel @Inject constructor(private val getUserListUseCase: GetUserListUseCase) : ViewModel(){
   val userList = getUserListUseCase()

}