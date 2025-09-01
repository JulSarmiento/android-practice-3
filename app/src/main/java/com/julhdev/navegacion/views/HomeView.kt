package com.julhdev.navegacion.views

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.navigation.NavController
import com.julhdev.navegacion.components.ActionBtn
import com.julhdev.navegacion.components.MainBtn
import com.julhdev.navegacion.components.Space
import com.julhdev.navegacion.components.TitleBar
import com.julhdev.navegacion.components.TitleVew

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
        /**
         * Vista principal de la aplicación con una barra superior y un botón de acción flotante.
         * Contiene el contenido específico de la vista de inicio.
         * usage: HomeView()
         */
fun HomeView(navController: NavController) {
  Scaffold(
    topBar = {
      CenterAlignedTopAppBar(
        title = { TitleBar("Header") },
        colors = TopAppBarDefaults.centerAlignedTopAppBarColors(
          containerColor = Color.Gray
        )
      )
    },
    floatingActionButton = {
      ActionBtn()
    }
  ) {
    ContentHomeView(
      navController = navController,
    )
  }
}

@Composable
        /**
         * Contenido específico de la vista de inicio.
         * usage: ContentHomeView(Modifier.fillMaxSize())
         */
fun ContentHomeView( navController: NavController) {
  Column(
    modifier = Modifier.fillMaxSize(),
    verticalArrangement = Arrangement.Center,
    horizontalAlignment = Alignment.CenterHorizontally
  ) {
    TitleVew(name = "Home View")
    Space()
    MainBtn(
      name = "Go to Details",
      backColor = Color.Gray,
      textColor = Color.White
    ) {
      navController.navigate("details")
    }
  }
}