package com.github.hyeyeon2371.presentation

import android.util.Log
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.platform.LocalContext
import androidx.hilt.navigation.compose.hiltViewModel

@Composable
fun UserListScreen(){
    Surface {
        val context = LocalContext.current

        Column (verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally){
            UserListLayout()
        }
    }
}

@Composable
fun UserListLayout ()  {
    val viewModel = hiltViewModel<UserListViewModel>()
    val userList by viewModel.userList.collectAsState() // 상태변경시 호출
    if(userList.isNotEmpty()){
        Log.e("User list", userList[0].toString())

        Column {
            Text(userList[0].id.toString())
            Text(userList[0].login)
            Text(userList[0].url)
        }
    }
}



@Composable
fun UserListPreview(){

}