package com.example.navigationexamplestevdza.navigation

const val DETAIL_ARGUMENT_KEY = "id"
const val DETAIL_ARGUMENT_KEY2 = "name"

const val AUTHENTICATION_ROUTE = "authentication"
const val HOME_ROUTE = "home"
const val ROOT_ROUTE = "root"

sealed class Screen(val route: String) {
    object Home: Screen(route = "home_screen")
    object Detail: Screen(route = "detail_screen?id={id}&name={name}"){
        fun passNameAndId(
            id: Int = 0,
            name: String = "Stevdza-San"
        ): String{
            return "detail_screen?id=$id&name=$name"
        }
    }

    object LogIn: Screen(route = "login_screen")
    object SignUp: Screen(route = "sign_up_screen")
}