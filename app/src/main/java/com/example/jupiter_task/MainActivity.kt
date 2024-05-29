package com.example.jupiter_task

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.compose.AppTheme
import com.example.jupiter_task.ui.login.ui.LoginScreen
import com.example.jupiter_task.ui.login.ui.MenuScreen
import com.example.jupiter_task.ui.login.ui.RegisterScreen

//import com.example.jupiter_task.ui.theme.Jupiter_taskTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AppTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(), color = Color.Black
                ) {

                    val navController = rememberNavController()
                    NavHost(navController = navController, startDestination = "Login") {
                       composable("Login") {
                            LoginScreen(
                                //onLoginScreenClick = {},
                                //onSignUpClick = {}
                            )
                        }
                        composable("Register") {
                            RegisterScreen()
                        }
                        composable("Menu") {
                            MenuScreen()
                        }
                    }
                }
            }
        }
    }
}



