package com.example.myapitest

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.myapitest.ui.navigation.Screen
import com.example.myapitest.ui.screens.HomeScreen
import com.example.myapitest.ui.screens.LoginScreen
import com.example.myapitest.ui.theme.MyApiTestTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyApiTestTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    val navController = rememberNavController()

                    NavHost(
                        navController = navController,
                        startDestination = Screen.Login.route
                    ) {
                        composable(route = Screen.Login.route) {
                            LoginScreen(navController = navController)
                        }

                        composable(route = Screen.Home.route) {
                            HomeScreen(navController = navController)
                        }
                    }
                }
            }
        }
    }
}