package com.example.contentinpocket

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import com.example.contentinpocket.navigation.ContentInPocketApp
import com.example.contentinpocket.ui.theme.ContentInPocketTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ContentInPocketTheme {
                Surface(modifier = Modifier.fillMaxSize()) {
                    ContentInPocketApp()
                }
            }
        }
    }
}
