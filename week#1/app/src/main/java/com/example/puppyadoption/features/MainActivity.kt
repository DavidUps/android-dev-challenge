package com.example.puppyadoption.features

import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.puppyadoption.core.theme.PuppyAdoptionTheme

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            PuppyAdoptionTheme {
                // A surface container using the 'background' color from the theme
                InitNavigation()
            }
        }
    }
}

@Composable
private fun InitNavigation() {
    Surface {
        NavGraph()
    }
}

@Preview("App")
@Composable
private fun App() {
    PuppyAdoptionTheme {
        InitNavigation()
    }
}