package com.example.contentinpocket.domain

data class Niche(
    val id: String,
    val title: String
)

data class ContentFormat(
    val id: String,
    val title: String
)

data class ContentTemplate(
    val id: String,
    val nicheId: String,
    val formatId: String,
    val text: String
)
