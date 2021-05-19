package com.stylingandroid.versioncatalogs.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material.MaterialTheme
import androidx.compose.material.darkColors
import androidx.compose.material.lightColors
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

private val DarkColorPalette = darkColors(
    primary = SaGreen,
    primaryVariant = SaGreenDark,
    secondary = SaPurple,
    secondaryVariant = SaPurpleDark,

    onPrimary = Color.Black,
    onSecondary = Color.White
)

private val LightColorPalette = lightColors(
    primary = SaGreen,
    primaryVariant = SaGreenLight,
    secondary = SaPurple,
    secondaryVariant = SaPurpleLight
)

@Composable
fun VersionCatalogsTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable() () -> Unit
) {
    val colors = if (darkTheme) {
        DarkColorPalette
    } else {
        LightColorPalette
    }

    MaterialTheme(
        colors = colors,
        typography = Typography,
        shapes = Shapes,
        content = content
    )
}
