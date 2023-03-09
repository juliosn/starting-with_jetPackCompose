package com.example.first_jetpack_project

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.first_jetpack_project.ui.theme.First_jetpackprojectTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
                MainAppScreen()
            }
        }
    }


@Composable
fun MainAppScreen() {
    First_jetpackprojectTheme {
        Surface(
            modifier = Modifier.fillMaxSize(),
            color = MaterialTheme.colors.background
        ){
            SaudarUsuarioLogado("Marcelo Legal")
        }
        Text("BRUH")
    }
}

@Composable
fun SaudarUsuarioLogado(nomeDoUsuarioLogado: String){
    Text(text = "Olá, $nomeDoUsuarioLogado!")
}

@Preview(showBackground = true)
@Composable
fun DefaultPrev() {
    MainAppScreen()
}