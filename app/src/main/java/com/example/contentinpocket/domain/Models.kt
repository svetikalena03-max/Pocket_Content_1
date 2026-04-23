package com.example.contentinpocket.domain

data class ContentNiche(
    val id: String,
    val title: String
)

data class ContentFormat(
    val id: String,
    val title: String
)

data class ContentTemplate(
    val id: String,
    val niche: String,
    val format: String,
    val text: String
)
