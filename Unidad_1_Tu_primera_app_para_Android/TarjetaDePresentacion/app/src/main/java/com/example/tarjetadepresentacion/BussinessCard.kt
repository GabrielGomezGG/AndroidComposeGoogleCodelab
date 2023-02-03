package com.example.tarjetadepresentacion

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Preview(showSystemUi = true)
@Composable
fun MyBusinessCard() {
    Column(
        Modifier
            .fillMaxSize()
            .background(Color(0xFF003a4a))) {
        MyBody(Modifier.weight(4f))
        MyInformation()
        Spacer(modifier = Modifier.size(49.dp))
    }
}