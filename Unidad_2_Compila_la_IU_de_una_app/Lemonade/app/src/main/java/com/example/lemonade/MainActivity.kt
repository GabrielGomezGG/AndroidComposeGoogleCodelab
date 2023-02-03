package com.example.lemonade

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.lemonade.ui.theme.LemonadeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LemonadeTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    MyScreen()
                }
            }
        }
    }
}

@Composable
fun MyScreen(modifier: Modifier = Modifier) {

    var position by remember {
        mutableStateOf(1)
    }

    val imagePosition = when (position) {

        1 -> R.drawable.lemon_tree
        2 -> R.drawable.lemon_squeeze
        3 -> R.drawable.lemon_drink
        else -> {
            R.drawable.lemon_restart
        }
    }

    val textPosition = when (position) {

        1 -> R.string.lemon_select
        2 -> R.string.lemon_squeeze
        3 -> R.string.lemon_drink
        else -> {
            R.string.lemon_empty_glass
        }
    }

    Column(
        modifier = modifier
            .fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = stringResource(id = textPosition),
            fontSize = 18.sp
        )
        Spacer(modifier = Modifier.size(16.dp))
        Image(
            painter = painterResource(id = imagePosition),
            contentDescription = null,
            Modifier
                .border(5.dp, color = Color(105,205,216 ))
                .clickable {
                    if (position == 4) {
                        position = 1
                    } else {
                        position++
                    }
                })
    }

}