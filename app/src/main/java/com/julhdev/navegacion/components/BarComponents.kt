package com.julhdev.navegacion.components

import android.graphics.drawable.Icon
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.sp

@Composable
        /**
         * Componente de la barra de título.
         * @param name El texto que se mostrará en la barra de título.
         * usage: TitleBar("Mi Aplicación")
         */
fun TitleBar(name: String ) {
  Text(
    text = name,
    fontSize = 25.sp,
    color = Color.White
  )
}

@Composable
        /**
         * Componente del botón de acción flotante.
         * usage: ActionBtn()
         */
fun ActionBtn() {
  FloatingActionButton(
    onClick = { /* Acción del botón */ },
    containerColor = Color.Gray,
    contentColor = Color.White
  ) {
    Icon(
      imageVector = Icons.Default.Add,
      contentDescription = "Add"
    )
  }
}

@Composable
        /**
         * Componente del botón de icono principal.
         * @param icon El vector de imagen que se mostrará como icono.
         * @param onClick La acción a realizar cuando se haga clic en el botón.
         * @param description La descripción del contenido para accesibilidad.
         * usage: MainIconBtn(Icons.Default.Add, { /* Acción */ }, "Agregar")
         */
fun MainIconBtn(
  icon: ImageVector,
  onClick: () -> Unit,
  description: String
) {
  IconButton(
    onClick = onClick
  ) {
    Icon(
      imageVector = icon,
      contentDescription = description,
      tint = Color.White
    )
  }

}