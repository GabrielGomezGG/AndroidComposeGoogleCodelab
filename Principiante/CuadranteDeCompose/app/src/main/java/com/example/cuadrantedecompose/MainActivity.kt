package com.example.cuadrantedecompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.cuadrantedecompose.ui.theme.CuadranteDeComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CuadranteDeComposeTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    ComposeQuadrantApp()
                }
            }
        }
    }
}

@Composable
fun ComposeQuadrantApp() {

    val title1 = stringResource(id = R.string.first_title)
    val title2 = stringResource(id = R.string.second_title)
    val title3 = stringResource(id = R.string.third_title)
    val title4 = stringResource(id = R.string.fourth_title)
    val body1 = stringResource(id = R.string.first_description)
    val body2 = stringResource(id = R.string.second_description)
    val body3 = stringResource(id = R.string.third_description)
    val body4 = stringResource(id = R.string.fourth_description)
    Box() {
        Column() {
            Row() {
                ComposableInfoCard(Color.Green, title1,body1)
                ComposableInfoCard(Color.Yellow, title2,body2)
            }
            Row() {
                ComposableInfoCard(Color.Cyan, title3,body3)
                ComposableInfoCard(Color.Gray, title4,body4)
            }
        }


    }

}

@Composable
private fun ComposableInfoCard(color: Color, title : String, body: String ) {
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .weight(1f)
            .background(color)
            .padding(16.dp)
    ) {
        Text(text = title, fontWeight = FontWeight.Bold, modifier = Modifier.padding(bottom = 16.dp))
        Spacer(modifier = Modifier.height(6.dp))
        Text(text = body)
    }
}


@Preview(showBackground = true, showSystemUi = true)
@Composable
fun DefaultPreview() {
    CuadranteDeComposeTheme {
        ComposeQuadrantApp()
    }
}