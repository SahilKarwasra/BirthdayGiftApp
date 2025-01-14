package com.example.shivvubirthdaygift.navigation

import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.shivvubirthdaygift.screen.FirstScreen
import com.example.shivvubirthdaygift.screen.SplashScreen
import kotlinx.serialization.Serializable

sealed class DestinationScreen{
    @Serializable
    data object SplashScreenObj : DestinationScreen()
    @Serializable
    data object FirstScreenObj : DestinationScreen()
}

@Composable
fun AppNavigation(
    modifier: Modifier = Modifier
) {
    val navController = rememberNavController()
    NavHost(
        navController = navController,
        startDestination = DestinationScreen.SplashScreenObj
    ) {
        composable<DestinationScreen.SplashScreenObj> {
            SplashScreen(
                navigate = {
                    navController.navigate(DestinationScreen.FirstScreenObj) {
                        popUpTo(DestinationScreen.SplashScreenObj) {
                            inclusive = true
                        }
                    }
                }
            )

        }
        composable<DestinationScreen.FirstScreenObj> {
            val coroutineScope = rememberCoroutineScope()
            FirstScreen(
                coroutineScope = coroutineScope,
            )
        }
    }
}
