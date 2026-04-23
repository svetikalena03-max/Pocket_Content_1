package com.example.contentinpocket.navigation

import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.example.contentinpocket.ui.ContentViewModel
import com.example.contentinpocket.ui.screen.FavoritesScreen
import com.example.contentinpocket.ui.screen.FormatSelectionScreen
import com.example.contentinpocket.ui.screen.NicheSelectionScreen
import com.example.contentinpocket.ui.screen.ResultScreen
import com.example.contentinpocket.ui.screen.WelcomeScreen

@Composable
fun ContentInPocketApp(
    viewModel: ContentViewModel = viewModel()
) {
    val navController = rememberNavController()
    val state by viewModel.uiState.collectAsState()

    NavHost(
        navController = navController,
        startDestination = AppDestination.Welcome.route
    ) {
        composable(AppDestination.Welcome.route) {
            WelcomeScreen(
                onStartClick = { navController.navigate(AppDestination.NicheSelection.route) },
                onFavoritesClick = { navController.navigate(AppDestination.Favorites.route) }
            )
        }

        composable(AppDestination.NicheSelection.route) {
            NicheSelectionScreen(
                niches = state.niches,
                selectedNicheId = state.selectedNiche?.id,
                onNicheClick = { nicheId ->
                    viewModel.selectNiche(nicheId)
                    navController.navigate(AppDestination.FormatSelection.createRoute(nicheId))
                },
                onBackClick = { navController.popBackStack() },
                onFavoritesClick = { navController.navigate(AppDestination.Favorites.route) }
            )
        }

        composable(
            route = AppDestination.FormatSelection.route,
            arguments = listOf(navArgument("nicheId") { type = NavType.StringType })
        ) { backStackEntry ->
            val nicheId = backStackEntry.arguments?.getString("nicheId").orEmpty()
            if (state.selectedNiche?.id != nicheId && nicheId.isNotBlank()) {
                viewModel.selectNiche(nicheId)
            }
            FormatSelectionScreen(
                formats = state.formats,
                selectedFormatId = state.selectedFormat?.id,
                selectedNicheName = state.selectedNiche?.title.orEmpty(),
                onFormatClick = { formatId -> viewModel.selectFormat(formatId) },
                onContinueClick = { navController.navigate(AppDestination.Result.route) },
                onBackClick = { navController.popBackStack() },
                onFavoritesClick = { navController.navigate(AppDestination.Favorites.route) }
            )
        }

        composable(AppDestination.Result.route) {
            ResultScreen(
                selectedNiche = state.selectedNiche?.title.orEmpty(),
                selectedFormat = state.selectedFormat?.title.orEmpty(),
                templates = state.templates,
                isFavorite = { id -> viewModel.isFavorite(id) },
                onToggleFavorite = { template -> viewModel.toggleFavorite(template) },
                onBackClick = { navController.popBackStack() },
                onFavoritesClick = { navController.navigate(AppDestination.Favorites.route) }
            )
        }

        composable(AppDestination.Favorites.route) {
            FavoritesScreen(
                favorites = state.favorites,
                onRemove = { id -> viewModel.removeFromFavorites(id) },
                onBackClick = { navController.popBackStack() }
            )
        }
    }
}
