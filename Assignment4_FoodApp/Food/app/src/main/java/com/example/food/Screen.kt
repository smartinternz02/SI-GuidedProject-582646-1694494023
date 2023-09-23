package com.example.food

sealed class Screen(val route: String){
    object HomeScreen : Screen(route = "home_screen")
    object HotelScreen : Screen(route = "hotels_screen")
    object FooditemsScreen : Screen(route = "food_screen")
    object FoodPricesScreen : Screen(route = "Prices_screen")
}
