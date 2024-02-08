package com.example.navigationexamplestevdza.navigation.nav_graph

import android.util.Log
import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavType
import androidx.navigation.compose.composable
import androidx.navigation.navArgument
import androidx.navigation.navigation
import com.example.navigationexamplestevdza.navigation.DETAIL_ARGUMENT_KEY
import com.example.navigationexamplestevdza.navigation.DETAIL_ARGUMENT_KEY2
import com.example.navigationexamplestevdza.navigation.HOME_ROUTE
import com.example.navigationexamplestevdza.navigation.Screen
import com.example.navigationexamplestevdza.screens.DetailScreen
import com.example.navigationexamplestevdza.screens.HomeScreen

fun NavGraphBuilder.homeNavGraph(
    navController: NavController
){
    navigation(
        startDestination = Screen.Home.route,
        route = HOME_ROUTE
    ){
        composable(
            route = Screen.Home.route
        ) {
            HomeScreen(navController = navController)
        }

        composable(
            route = Screen.Detail.route,
            arguments = listOf(
                navArgument(DETAIL_ARGUMENT_KEY) {
                    type = NavType.IntType
//                    User defaultValue or Nullable in case of optional arguments
                    defaultValue = 0
//                    nullable = true
                },
                navArgument(DETAIL_ARGUMENT_KEY2){
                    type = NavType.StringType
                    defaultValue = "No Name"
                }
            )
        ) {
            Log.d("Args", it.arguments?.getInt(DETAIL_ARGUMENT_KEY).toString())
            Log.d("Args", it.arguments?.getString(DETAIL_ARGUMENT_KEY2).toString())
            DetailScreen(navController = navController)
        }
    }
}