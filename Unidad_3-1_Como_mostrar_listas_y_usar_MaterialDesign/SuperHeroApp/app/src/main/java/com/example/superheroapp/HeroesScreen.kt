package com.example.superheroapp

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.superheroapp.model.HeroesRepository

@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun HeroesScreen() {
    Scaffold(
        topBar = { TopHeroBar() },
        backgroundColor = MaterialTheme.colors.background
    ) {
        LazyColumn(Modifier.padding(16.dp)) {
            items(HeroesRepository.heroes) {
                HeroesDataSource(it)
                Spacer(Modifier.size(8.dp))
            }
        }
    }

}

@Composable
fun TopHeroBar() {
    TopAppBar(backgroundColor = MaterialTheme.colors.background) {
        Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
            Text(text = "SuperHeroes", style = MaterialTheme.typography.h1)
        }
    }
}