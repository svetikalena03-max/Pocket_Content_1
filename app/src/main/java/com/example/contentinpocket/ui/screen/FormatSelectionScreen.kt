package com.example.contentinpocket.ui.screen

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.contentinpocket.domain.ContentFormat

@Composable
fun FormatSelectionScreen(
    formats: List<ContentFormat>,
    selectedFormatId: String?,
    selectedNicheName: String,
    onFormatClick: (String) -> Unit,
    onContinueClick: () -> Unit,
    onBackClick: () -> Unit,
    onFavoritesClick: () -> Unit
) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(20.dp)
    ) {
        HeaderRow(
            title = "Формат контента",
            actionLabel = "Избранное",
            onActionClick = onFavoritesClick
        )

        Spacer(modifier = Modifier.height(14.dp))

        Text(text = "Ниша: $selectedNicheName", style = MaterialTheme.typography.titleMedium)

        Spacer(modifier = Modifier.height(6.dp))

        Text(text = "Выберите, что хотите получить сейчас.", style = MaterialTheme.typography.bodyMedium)

        Spacer(modifier = Modifier.height(16.dp))

        LazyColumn(
            modifier = Modifier.weight(1f),
            verticalArrangement = Arrangement.spacedBy(12.dp)
        ) {
            items(formats) { format ->
                SelectableCard(
                    title = format.title,
                    selected = format.id == selectedFormatId,
                    onClick = { onFormatClick(format.id) }
                )
            }
        }

        Spacer(modifier = Modifier.height(12.dp))

        Button(
            onClick = onContinueClick,
            enabled = selectedFormatId != null,
            modifier = Modifier
                .fillMaxWidth()
                .height(52.dp)
        ) {
            Text(text = "Показать шаблоны")
        }

        Spacer(modifier = Modifier.height(10.dp))

        OutlinedButton(
            onClick = onBackClick,
            modifier = Modifier
                .fillMaxWidth()
                .height(52.dp)
        ) {
            Text(text = "Назад")
        }
    }
}
