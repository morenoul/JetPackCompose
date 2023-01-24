package com.example.jetpackcompose

import android.R
import android.content.res.Configuration
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.semantics.Role.Companion.Image
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.jetpackcompose.ui.theme.JetPackComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JetPackComposeTheme {
                // A surface container using the 'background' color from the theme
                MyComponent()
            }
        }
    }
}

@Composable
fun MyComponent(){
    //Row (modifier = Modifier.padding(top = 16.dp)){
    //Row (modifier = Modifier.padding(start = 16.dp)){
    Row (
        modifier = Modifier
            .background(MaterialTheme.colors.background)
            .padding(16.dp)
    ){
        MyImage()
        MyTexts()
    }
}

//Elemento grafico
@Composable
fun MyTexts() {
    Column(
        modifier = Modifier.padding(start = 8.dp)
    ){
        MyText(
            text = "Jet Pack Compose",
            MaterialTheme.colors.primaryVariant,
            MaterialTheme.typography.subtitle1
        )
        Spacer(
            modifier = Modifier.height(8.dp)
        )
        MyText(text = "Android",
        MaterialTheme.colors.onBackground,
            MaterialTheme.typography.subtitle2
        )
    }
}

@Composable
fun MyText (text: String, color: Color, style : TextStyle) {
    Text(text, color = color, style = style)
}

@Composable
fun MyImage() {
    Image(
        painter = painterResource(id = R.drawable.ic_menu_always_landscape_portrait),
        contentDescription = "Imagen",
        //modifier = Modifier.size(50.dp),
        modifier = Modifier
            .clip(CircleShape)
            .background(MaterialTheme.colors.primary)
            .size(50.dp)
    )
}

//VISUALIZADOR
@Preview(uiMode = Configuration.UI_MODE_NIGHT_YES)
@Composable
fun MyComponentsPreview() {
    MyComponent()
}






