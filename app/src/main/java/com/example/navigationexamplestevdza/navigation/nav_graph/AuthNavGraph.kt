package com.example.navigationexamplestevdza.navigation.nav_graph

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.example.navigationexamplestevdza.navigation.AUTHENTICATION_ROUTE
import com.example.navigationexamplestevdza.navigation.Screen
import com.example.navigationexamplestevdza.screens.LogInScreen
import com.example.navigationexamplestevdza.screens.SignUpScreen

fun NavGraphBuilder.authNavGraph(
    navController: NavController
){
    navigation(
        startDestination = Screen.LogIn.route,
        route = AUTHENTICATION_ROUTE
    ){
        composable(
            route = Screen.LogIn.route
        ){
            LogInScreen(navController = navController)
        }

        composable(
            route = Screen.SignUp.route
        ){
            SignUpScreen(navController = navController)
        }
    }
}