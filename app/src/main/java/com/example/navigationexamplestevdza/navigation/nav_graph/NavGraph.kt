package com.example.navigationexamplestevdza.navigation.nav_graph

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import com.example.navigationexamplestevdza.navigation.HOME_ROUTE
import com.example.navigationexamplestevdza.navigation.ROOT_ROUTE
import com.example.navigationexamplestevdza.navigation.Screen

@Composable
fun SetupNavGraph(navController: NavHostController) {
    NavHost(
        navController = navController,
        startDestination = HOME_ROUTE,
        route = ROOT_ROUTE
    ) {
        homeNavGraph(navController = navController)
        authNavGraph(navController = navController)
    }

}