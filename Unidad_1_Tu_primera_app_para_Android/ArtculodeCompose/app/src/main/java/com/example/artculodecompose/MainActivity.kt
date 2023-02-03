package com.example.artculodecompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.artculodecompose.ui.theme.ArtículoDeComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ArtículoDeComposeTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {

                }
            }
        }
    }
}

@Composable
fun Imagen() {
    val image = painterResource(R.drawable.bg_compose_background)
    Image(painter = image,
        contentDescription = null,
    )
}

@Composable
fun titulo(titulo : String){
    Text(text = titulo,
        fontSize = 24.sp,
        modifier = Modifier
            .wrapContentWidth(Alignment.Start)
            .padding(start = 16.dp, top = 16.dp, end = 16.dp, bottom = 16.dp)
    )
}

@Composable
fun subTitulo(sub : String){
    Text(text = sub,
        textAlign = TextAlign.Justify,
        modifier = Modifier
            .padding(start = 16.dp, end = 16.dp)

    )
}

@Composable
fun cuerpo(body : String){
    Text(text = body,
        textAlign = TextAlign.Justify,
        modifier = Modifier
            .padding(start = 16.dp, top = 16.dp, end = 16.dp, bottom = 16.dp)
    )

}

@Preview(
    showBackground = true,
    showSystemUi = true
    )
@Composable
fun DefaultPreview() {
    ArtículoDeComposeTheme {
        Column(){
            Imagen()
            titulo(stringResource(R.string.titulo))
            subTitulo(sub = stringResource(id = R.string.subtitulo))
            cuerpo(body = stringResource(id = R.string.cuerpo))
        }

    }
}