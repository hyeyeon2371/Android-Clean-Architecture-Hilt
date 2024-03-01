package com.github.hyeyeon2371.presentation

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.github.hyeyeon2371.domain.GetUserListUseCase
import com.github.hyeyeon2371.domain.UserEntity
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class UserListViewModel @Inject constructor(private val getUserListUseCase: GetUserListUseCase) : ViewModel(){
   private val _userList = MutableStateFlow<List<UserEntity>>(listOf())
   val userList : StateFlow<List<UserEntity>> = _userList

   init {
      getUserList()
   }

   fun getUserList(){
      viewModelScope.launch(Dispatchers.IO){
         _userList.value = getUserListUseCase()
      }
   }

}