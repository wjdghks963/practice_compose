package com.example.practice_compose

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable

sealed class Nav(val title:String){
    object Home : Nav("DefaultPreview")
}

@Composable
fun NavigationGraph(navController:NavHostController){
    NavHost(navController = navController, startDestination = Nav.Home.title){
        composable(Nav.Home.title){
            DefaultPreview()
        }
    }
}
