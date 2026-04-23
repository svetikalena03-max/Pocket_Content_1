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
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.contentinpocket.domain.ContentNiche

@Composable
fun NicheSelectionScreen(
    niches: List<ContentNiche>,
    selectedNicheId: String?,
    onNicheClick: (String) -> Unit,
    onBackClick: () -> Unit,
    onFavoritesClick: () -> Unit
) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(20.dp)
    ) {
        HeaderRow(
            title = "Выберите нишу",
            actionLabel = "Избранное",
            onActionClick = onFavoritesClick
        )

        Spacer(modifier = Modifier.height(16.dp))

        Text(text = "Это поможет подобрать подходящие шаблоны.", style = MaterialTheme.typography.bodyMedium)

        Spacer(modifier = Modifier.height(16.dp))

        LazyColumn(
            modifier = Modifier.weight(1f),
            verticalArrangement = Arrangement.spacedBy(12.dp)
        ) {
            items(niches) { niche ->
                SelectableCard(
                    title = niche.title,
                    selected = niche.id == selectedNicheId,
                    onClick = { onNicheClick(niche.id) }
                )
            }
        }

        Spacer(modifier = Modifier.height(12.dp))

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
