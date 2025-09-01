package com.julhdev.navegacion.views

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.julhdev.navegacion.components.MainBtn
import com.julhdev.navegacion.components.MainIconBtn
import com.julhdev.navegacion.components.Space
import com.julhdev.navegacion.components.TitleBar
import com.julhdev.navegacion.components.TitleVew


@OptIn(ExperimentalMaterial3Api::class)
@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
          /**
            * Vista de detalles de la aplicación con una barra superior.
            * Contiene el contenido específico de la vista de detalles.
            * usage: DetailView()
            */
fun DetailView(navController: NavController, id: Int, optional: String?){
  Scaffold(
    topBar = {
      TopAppBar(
        title = { TitleBar("Detail") },
        colors = TopAppBarDefaults.mediumTopAppBarColors(
          containerColor = Color.Blue,
        ),
        navigationIcon = {
          MainIconBtn(
            icon = Icons.AutoMirrored.Filled.ArrowBack,
            description = "Back",
            onClick = { navController.popBackStack() }
          )
        }
      )
    },
  ) {
    ContentDetailView(navController, id, optional)
  }
}

@Composable
          /**
            * Contenido específico de la vista de detalles.
            * Muestra un título y un botón para regresar a la vista principal.
            * usage: ContentDetailView()
            */
fun ContentDetailView(navController: NavController, id: Int, optional: String?){
  Column(
    modifier = Modifier.fillMaxSize(),
    verticalArrangement = Arrangement.Center,
    horizontalAlignment = Alignment.CenterHorizontally
  ) {
    TitleVew(name = "Detail View")
    Space()
    TitleVew(name = "ID: $id")
    Space()
    if(optional == "") {
      Spacer(modifier = Modifier.height(0.dp))
    } else {
      TitleVew(name = optional.orEmpty())
      Space()
    }
    MainBtn(
      name = "Return Home",
      backColor = Color.Blue,
      textColor = Color.White
    ) {
      navController.popBackStack()
    }
  }
}