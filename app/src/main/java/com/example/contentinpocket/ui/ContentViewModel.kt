package com.example.contentinpocket.ui

import androidx.lifecycle.ViewModel
import com.example.contentinpocket.data.ContentRepository
import com.example.contentinpocket.domain.ContentFormat
import com.example.contentinpocket.domain.ContentNiche
import com.example.contentinpocket.domain.ContentTemplate
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update

data class ContentUiState(
    val niches: List<ContentNiche> = emptyList(),
    val formats: List<ContentFormat> = emptyList(),
    val selectedNiche: ContentNiche? = null,
    val selectedFormat: ContentFormat? = null,
    val selectedTemplate: ContentTemplate? = null,
    val favorites: List<ContentTemplate> = emptyList()
)

class ContentViewModel(
    private val repository: ContentRepository = ContentRepository()
) : ViewModel() {

    private val favoriteIds = mutableSetOf<String>()

    private val _uiState = MutableStateFlow(
        ContentUiState(
            niches = repository.getNiches(),
            formats = repository.getFormats()
        )
    )
    val uiState: StateFlow<ContentUiState> = _uiState.asStateFlow()

    fun selectNiche(nicheId: String) {
        val niche = repository.getNicheById(nicheId)
        _uiState.update { state ->
            state.copy(
                selectedNiche = niche,
                selectedFormat = null,
                selectedTemplate = null
            )
        }
    }

    fun selectFormat(formatId: String) {
        val format = repository.getFormatById(formatId)
        val nicheId = _uiState.value.selectedNiche?.id.orEmpty()
        val template = if (nicheId.isNotBlank() && format != null) {
            repository.getTemplate(nicheId, format.id)
        } else {
            null
        }

        _uiState.update { state ->
            state.copy(
                selectedFormat = format,
                selectedTemplate = template
            )
        }
    }

    fun toggleFavorite(template: ContentTemplate) {
        if (favoriteIds.contains(template.id)) {
            favoriteIds.remove(template.id)
        } else {
            favoriteIds.add(template.id)
        }

        _uiState.update { state ->
            state.copy(favorites = repository.getFavoriteTemplates(favoriteIds))
        }
    }

    fun removeFromFavorites(templateId: String) {
        favoriteIds.remove(templateId)
        _uiState.update { state ->
            state.copy(favorites = repository.getFavoriteTemplates(favoriteIds))
        }
    }

    fun isFavorite(templateId: String): Boolean = favoriteIds.contains(templateId)
}
