package com.example.tarjetadepresentacion

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun MyBody(modifier: Modifier = Modifier) {
    Column(modifier = modifier.fillMaxWidth(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Image(
            painter = painterResource(id = R.drawable.android_logo),
            contentDescription = "logo",
            Modifier.size(114.dp)
        )
        Spacer(modifier = Modifier.size(6.dp))
        Text(text = "Gabriel Gomez", fontSize = 50.sp, color = Color.White)
        Text(text = "Programador Android Compose", color = Color(0xFF48dc9a))
    }
}