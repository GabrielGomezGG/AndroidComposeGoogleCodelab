package com.example.tarjetadepresentacion

import androidx.compose.foundation.layout.*
import androidx.compose.material.Divider
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Phone
import androidx.compose.material.icons.filled.Share
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun MyInformation(modifier: Modifier = Modifier) {
    val iconPhone: ImageVector = Icons.Filled.Phone
    val iconShare: ImageVector = Icons.Filled.Share
    val iconEmail: ImageVector = Icons.Filled.Email

    Column(Modifier.fillMaxWidth()) {
        MyData(icon = iconPhone, text = "+11 300 065 69")
        MyData(icon = iconShare, text = "https://www.linkedin.com/in/gabrielgomezgg/")
        MyData(icon = iconEmail, text = "gabrielgomezgg1997@gmail.com")
    }

}

@Composable
fun MyData(icon: ImageVector, text: String, modifier: Modifier = Modifier) {

    Column() {
        Divider(Modifier.padding(vertical = 8.dp), color = Color.Gray, thickness = 1.dp)
        Row(Modifier.fillMaxWidth(), verticalAlignment = Alignment.CenterVertically) {
            //Icon(painter = icon, contentDescription = "icono", tint = Color(0xFF48dc9a))
            Icon(
                imageVector = icon,
                contentDescription = "icon",
                Modifier.size(24.dp).weight(1f),
                tint = Color(0xFF48dc9a),
            )
            Text(text = text, Modifier.weight(3f), color = Color.White, fontSize = 18.sp)
        }
    }
}