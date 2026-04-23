package com.example.contentinpocket.navigation

sealed class AppDestination(val route: String) {
    data object Welcome : AppDestination("welcome")
    data object NicheSelection : AppDestination("niche_selection")
    data object FormatSelection : AppDestination("format_selection/{nicheId}") {
        fun createRoute(nicheId: String): String = "format_selection/$nicheId"
    }
    data object Result : AppDestination("result/{nicheId}/{formatId}") {
        fun createRoute(nicheId: String, formatId: String): String = "result/$nicheId/$formatId"
    }
    data object Favorites : AppDestination("favorites")
}
