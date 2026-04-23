package com.example.contentinpocket.navigation

sealed class AppDestination(val route: String) {
    data object Welcome : AppDestination("welcome")
    data object NicheSelection : AppDestination("niche_selection")
    data object FormatSelection : AppDestination("format_selection")
    data object Result : AppDestination("result")
    data object Favorites : AppDestination("favorites")
}
