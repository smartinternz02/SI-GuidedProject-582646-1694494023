package com.example.food

import android.content.res.Resources.Theme
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import java.security.AccessController
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            FoodTheme()
        }
    }}
@Composable
fun FoodTheme() {
    val navController: NavHostController = rememberNavController()
    SetupNavGraph(navController = navController)
}


