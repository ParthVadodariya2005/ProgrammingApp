package com.parth.programmingapp.navigation


import androidx.compose.runtime.Composable
import androidx.navigation.*
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.parth.programmingapp.presentation.screens.splash.SplashScreen
import com.parth.programmingapp.presentation.screens.welcome.WelcomeScreen
import com.parth.programmingapp.util.Constants.DETAILS_ARRGUMENT_KEY


@Composable
fun SetupNavGraph(navController: NavHostController){
    NavHost(
        navController = navController,
        startDestination = Screen.Splash.route
    )
    {
        composable(route = Screen.Splash.route){
            SplashScreen(navController)
        }
        composable(route = Screen.Welcome.route){
            WelcomeScreen(navController = navController)
        }
        composable(route = Screen.Home.route){

        }
        composable(route = Screen.Details.route,
            arguments = listOf(navArgument(DETAILS_ARRGUMENT_KEY){ type=NavType.IntType })
        ){

        }
        composable(route = Screen.Search.route){

        }
    }
}