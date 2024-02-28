package com.github.hyeyeon2371.prevdemo.ui

import android.util.Log
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.LocalContext
import com.github.hyeyeon2371.domain.UserEntity

@Composable
fun UserListPage (viewModel : UserListViewModel)  {
    val userList : List<UserEntity> = viewModel.userList

    UserListScreen(userList = userList)
}

@Composable
fun UserListScreen(userList : List<UserEntity>){
    Surface {
        val context = LocalContext.current
        Log.i("API LOG > ", userList.map { userEntity -> userEntity.login }.toString())
    }
}

@Composable
fun UserListPreview(){

}