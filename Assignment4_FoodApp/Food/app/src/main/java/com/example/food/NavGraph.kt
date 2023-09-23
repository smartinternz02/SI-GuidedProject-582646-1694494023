package com.example.food

import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable

@Composable
fun SetupNavGraph(
    navController: NavHostController
){ NavHost(navController = navController,
    startDestination = Screen.HomeScreen.route){
    composable(
        route=Screen.HomeScreen.route
    ){
        HomeScreen(navController=navController)
    }
    composable(
        route=Screen.HotelScreen.route
    ){
        HotelsScreen(navController = navController)
    }
    composable(
        route=Screen.FooditemsScreen.route
    ){
        Fooditems(navController=navController)
    }
    composable(
        route=Screen.FoodPricesScreen.route
    ){
        FoodPrices(navController=navController)
    }
}
}