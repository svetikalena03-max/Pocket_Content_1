package com.example.contentinpocket.ui.screen

import android.widget.Toast
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Bookmark
import androidx.compose.material.icons.filled.BookmarkBorder
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalClipboardManager
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.unit.dp
import com.example.contentinpocket.domain.ContentTemplate

@Composable
fun ResultScreen(
    selectedNiche: String,
    selectedFormat: String,
    templates: List<ContentTemplate>,
    isFavorite: (String) -> Boolean,
    onToggleFavorite: (ContentTemplate) -> Unit,
    onBackClick: () -> Unit,
    onFavoritesClick: () -> Unit
) {
    val clipboardManager = LocalClipboardManager.current
    val context = LocalContext.current

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(20.dp)
    ) {
        HeaderRow(
            title = "Готовый контент",
            actionLabel = "Избранное",
            onActionClick = onFavoritesClick
        )

        Spacer(modifier = Modifier.height(12.dp))

        Text(text = "Ниша: $selectedNiche · Формат: $selectedFormat", style = MaterialTheme.typography.bodyMedium)

        Spacer(modifier = Modifier.height(16.dp))

        if (templates.isEmpty()) {
            EmptyStateCard(text = "Шаблоны не найдены. Выберите другой формат или нишу.")
        } else {
            LazyColumn(
                modifier = Modifier.weight(1f),
                verticalArrangement = Arrangement.spacedBy(12.dp)
            ) {
                items(templates) { template ->
                    Card(
                        shape = androidx.compose.foundation.shape.RoundedCornerShape(16.dp),
                        colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.surface)
                    ) {
                        Column(modifier = Modifier.padding(16.dp)) {
                            Text(text = template.text, style = MaterialTheme.typography.bodyLarge)
                            Spacer(modifier = Modifier.height(14.dp))

                            Row(
                                modifier = Modifier.fillMaxWidth(),
                                horizontalArrangement = Arrangement.SpaceBetween
                            ) {
                                OutlinedButton(
                                    onClick = {
                                        clipboardManager.setText(AnnotatedString(template.text))
                                        Toast.makeText(context, "Текст скопирован", Toast.LENGTH_SHORT).show()
                                    }
                                ) {
                                    Text("Скопировать")
                                }

                                IconButton(onClick = { onToggleFavorite(template) }) {
                                    Icon(
                                        imageVector = if (isFavorite(template.id)) Icons.Default.Bookmark else Icons.Default.BookmarkBorder,
                                        contentDescription = "Добавить в избранное",
                                        tint = MaterialTheme.colorScheme.primary
                                    )
                                }
                            }
                        }
                    }
                }
            }
        }

        Spacer(modifier = Modifier.height(12.dp))

        Button(
            onClick = onBackClick,
            modifier = Modifier
                .fillMaxWidth()
                .height(52.dp)
        ) {
            Text(text = "Выбрать другой вариант")
        }
    }
}
