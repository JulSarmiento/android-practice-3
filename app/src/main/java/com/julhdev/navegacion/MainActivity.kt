package com.julhdev.navegacion

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.julhdev.navegacion.navigation.NavManager
import com.julhdev.navegacion.ui.theme.NavegacionTheme

class MainActivity : ComponentActivity() {
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    enableEdgeToEdge()
    setContent {
      NavegacionTheme {
        NavManager()
      }
    }
  }
}



