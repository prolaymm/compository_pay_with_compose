package com.prolaymm.compository.presentation.routes

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.prolaymm.compository.presentation.screens.HomeScreen
import com.prolaymm.compository.presentation.screens.login_page.LoginPage
import com.prolaymm.compository.presentation.screens.welcome_page.WelcomeMainPage

@Composable
fun CustomNavHost() {

    val myNavController = rememberNavController()
    NavHost(navController = myNavController, startDestination = rHome){

        composable(rWelcome){
            WelcomeMainPage(navController = myNavController)
        }
        composable(rLogin){
            LoginPage(navController = myNavController)
        }
        composable(rHome){
            HomeScreen(navController=myNavController )
        }
    }
}