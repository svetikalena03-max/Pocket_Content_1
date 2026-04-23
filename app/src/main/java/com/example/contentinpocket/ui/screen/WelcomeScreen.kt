package com.example.contentinpocket.ui.screen

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp

@Composable
fun WelcomeScreen(
    onStartClick: () -> Unit,
    onFavoritesClick: () -> Unit
) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(24.dp),
        verticalArrangement = Arrangement.Center
    ) {
        Text(text = "Контент в кармане", style = MaterialTheme.typography.headlineMedium)
        Spacer(modifier = Modifier.height(12.dp))
        Text(
            text = "Готовые идеи и тексты для соцсетей за пару кликов.",
            style = MaterialTheme.typography.bodyLarge,
            textAlign = TextAlign.Start
        )

        Spacer(modifier = Modifier.height(40.dp))

        Button(
            onClick = onStartClick,
            modifier = Modifier
                .fillMaxWidth()
                .height(54.dp)
        ) {
            Text(text = "Начать")
        }

        Spacer(modifier = Modifier.height(12.dp))

        OutlinedButton(
            onClick = onFavoritesClick,
            modifier = Modifier
                .fillMaxWidth()
                .height(54.dp)
        ) {
            Text(text = "Избранное")
        }
    }
}
