package com.example.contentinpocket.data

import com.example.contentinpocket.domain.ContentFormat
import com.example.contentinpocket.domain.ContentNiche
import com.example.contentinpocket.domain.ContentTemplate

class ContentRepository {
    fun getNiches(): List<ContentNiche> = MockData.niches

    fun getFormats(): List<ContentFormat> = MockData.formats

    fun getTemplates(nicheId: String, formatId: String): List<ContentTemplate> {
        return MockData.templates.filter { it.niche == nicheId && it.format == formatId }
    }

    fun getTemplate(nicheId: String, formatId: String): ContentTemplate? {
        return MockData.templates.firstOrNull { it.niche == nicheId && it.format == formatId }
    }

    fun getFavoriteTemplates(ids: Set<String>): List<ContentTemplate> {
        return MockData.templates.filter { it.id in ids }
    }

    fun getNicheById(id: String): ContentNiche? = MockData.niches.find { it.id == id }

    fun getFormatById(id: String): ContentFormat? = MockData.formats.find { it.id == id }
}
