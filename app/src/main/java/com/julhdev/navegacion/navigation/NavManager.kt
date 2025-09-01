package com.julhdev.navegacion.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.julhdev.navegacion.views.DetailView
import com.julhdev.navegacion.views.HomeView

@Composable
          /**
            * Gestor de navegación que define las rutas y las vistas correspondientes.
            * Utiliza NavController para manejar la navegación entre las vistas.
            * usage: NavManager()
            */
fun NavManager() {
  val navController = rememberNavController()

  NavHost(
    navController = navController,
    startDestination = "home"
  ) {
    composable("home") {
      HomeView(navController)
    }

    composable( "details/{id}/?{optional}", arguments = listOf(
      navArgument("id") {
        type = NavType.IntType
      },
      navArgument("optional") {
        type = NavType.StringType
        defaultValue = "default"
        nullable = true
      }
    )) {
      val id = it.arguments?.getInt("id") ?: -1
      val optional = it.arguments?.getString("optional") ?: ""
      DetailView(navController, id, optional)
    }
  }
}