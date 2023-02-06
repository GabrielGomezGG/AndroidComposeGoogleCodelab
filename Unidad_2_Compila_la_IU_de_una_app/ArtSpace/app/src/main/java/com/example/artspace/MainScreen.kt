package com.example.artspace

import android.annotation.SuppressLint
import android.content.ClipData.Item
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.artspace.model.Arte
import com.example.artspace.ui.theme.Shapes
import java.time.LocalDate
import java.time.Month

@SuppressLint("ResourceType")
@Preview(showSystemUi = true)
@Composable
fun MainScreen() {

    val bochis = listOf<Arte>(
        Arte(
            "bochi1",
            R.drawable.bochi1,
            "bochi escritorio",
            LocalDate.of(2017, Month.FEBRUARY, 3)
        ),
        Arte("bochi2", R.drawable.bochi2, "bochi snake", LocalDate.of(2018, Month.FEBRUARY, 5)),
        Arte("bochi3", R.drawable.bochi3, "bochi sus", LocalDate.of(2017, Month.FEBRUARY, 3)),
        Arte("bochi4", R.drawable.bochi4, "bochi reaction", LocalDate.of(2015, Month.FEBRUARY, 12)),
        Arte("bochi5", R.drawable.bochi5, "bochi david", LocalDate.of(2018, Month.FEBRUARY, 7)),
        Arte("bochi6", R.drawable.bochi6, "bochi bocho", LocalDate.of(2022, Month.FEBRUARY, 22)),
    )
    Column(Modifier.fillMaxSize().background(Color(0xFFFAF4D0))) {
        Text(
            modifier = Modifier
                .fillMaxWidth(),
            text = "Bochi Art",
            fontSize = 32.sp,
            textAlign = TextAlign.Center
        )
        LazyRow(Modifier.fillMaxSize()){

            items(bochis){
                ArteScreen(
                    arte = it,
                    modifier = Modifier
                        .width(325.dp)
                )
            }
        }
    }
}


@Composable
fun ArteScreen(arte: Arte, modifier: Modifier = Modifier) {

    Card(
        elevation = 16.dp,
        modifier = Modifier.padding(16.dp),
        shape = Shapes.medium,
        backgroundColor = Color(0xFFFAE3E3)
    ) {
        Column(
            modifier = modifier
                .fillMaxHeight()
                .padding(8.dp),
            verticalArrangement = Arrangement.SpaceAround,
            horizontalAlignment = Alignment.CenterHorizontally)
        {
            Card(elevation = 8.dp, shape = Shapes.small, backgroundColor = Color(0xFFDAF7FF)) {
                Image(
                    modifier = Modifier
                        .border(2.dp, Color.Gray)
                        .padding(24.dp)
                    ,
                    painter = painterResource(id = arte.foto),
                    contentDescription = null,
                    contentScale = ContentScale.FillBounds,
                )
            }
            Card(elevation = 8.dp, shape = Shapes.small, backgroundColor = Color(0xFFD0F5FF)) {
                Column(modifier = Modifier.padding(16.dp)) {
                    Text(text = arte.titulo, fontSize = 24.sp, fontWeight = FontWeight.Light)
                    Row() {
                        Text(text = arte.nombre, fontWeight = FontWeight.Bold)
                        Text(text = " (${arte.fecha.toString()})")
                    }
                }
            }
        }
    }
}