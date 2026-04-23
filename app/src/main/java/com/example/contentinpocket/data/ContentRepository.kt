package com.example.contentinpocket.data

import com.example.contentinpocket.domain.ContentFormat
import com.example.contentinpocket.domain.ContentTemplate
import com.example.contentinpocket.domain.Niche

class ContentRepository {
    fun getNiches(): List<Niche> = MockData.niches

    fun getFormats(): List<ContentFormat> = MockData.formats

    fun getTemplates(nicheId: String, formatId: String): List<ContentTemplate> {
        return MockData.templates.filter { it.nicheId == nicheId && it.formatId == formatId }
    }

    fun getFavoriteTemplates(ids: Set<String>): List<ContentTemplate> {
        return MockData.templates.filter { it.id in ids }
    }

    fun getNicheById(id: String): Niche? = MockData.niches.find { it.id == id }

    fun getFormatById(id: String): ContentFormat? = MockData.formats.find { it.id == id }
}
