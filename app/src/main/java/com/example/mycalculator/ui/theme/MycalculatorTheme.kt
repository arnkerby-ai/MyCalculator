package com.example.mycalculatord.ui.theme

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable

private val LightColors = lightColorScheme(
    primary = androidx.compose.ui.graphics.Color(0xFF12D1D1),
    secondary = androidx.compose.ui.graphics.Color(0xFF6200EE),
    tertiary = androidx.compose.ui.graphics.Color(0xFF03DAC5)
)

@Composable
fun MycalculatordTheme(content: @Composable () -> Unit) {
    MaterialTheme(
        colorScheme = LightColors,
        typography = MaterialTheme.typography,
        content = content
    )
}