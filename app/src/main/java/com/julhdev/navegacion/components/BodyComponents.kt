package com.julhdev.navegacion.components

import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
        /**
         * Componente del título principal.
         * @param name El texto que se mostrará como título.
         * usage: TitleVew("Bienvenido")
         */
fun TitleVew(name: String) {
  Text(
    text = name,
    fontSize = 40.sp,
    fontWeight = FontWeight.Bold
  )
}

@Composable
        /**
         * Componente de espacio vertical.
         * usage: Space()
         */
fun Space(){
  Spacer(modifier = Modifier.height(10.dp))
}

@Composable
        /**
         * Componente del botón principal.
         * @param name El texto que se mostrará en el botón.
         * @param backColor El color de fondo del botón.
         * @param textColor El color del texto del botón.
         * @param onClick La acción a realizar cuando se haga clic en el botón.
         * usage: MainBtn("Enviar", Color.Blue, Color.White) { /* Acción */ }
         */
fun MainBtn(
  name: String,
  backColor: Color,
  textColor: Color,
  onClick: () -> Unit
) {
  Button(
    onClick = onClick,
    colors = ButtonDefaults.buttonColors(
      containerColor = backColor,
      contentColor = textColor
    )
  ) {
    Text(text = name)
  }
}