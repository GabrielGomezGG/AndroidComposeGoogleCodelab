package com.example.superheroapp

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.example.superheroapp.model.Hero
import com.example.superheroapp.ui.theme.Shapes

@Composable
fun HeroesDataSource(hero: Hero, modifier: Modifier = Modifier) {
    Card(
        elevation = 2.dp,
        shape = MaterialTheme.shapes.medium,
        modifier = Modifier
            .fillMaxWidth()
            .height(86.dp)
    ) {
        Row(modifier = Modifier.fillMaxWidth().padding(16.dp)) {
            Column(modifier = modifier.weight(3f)) {
                Text(
                    text = stringResource(id = hero.nameRes),
                    style = MaterialTheme.typography.h3
                )
                Text(
                    text = stringResource(id = hero.descriptionRes),
                    style = MaterialTheme.typography.body1
                )
            }
            Spacer(modifier = Modifier.size(16.dp))
            Image(
                painter = painterResource(id = hero.imageRes),
                contentDescription = null,
                Modifier.clip(Shapes.small)
            )
        }
    }
}