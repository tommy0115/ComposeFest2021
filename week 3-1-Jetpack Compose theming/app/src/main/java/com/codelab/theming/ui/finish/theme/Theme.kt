/*
 * Copyright 2020 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.codelab.theming.ui.finish.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material.MaterialTheme
import androidx.compose.material.darkColors
import androidx.compose.material.lightColors
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

private val LightColors = lightColors(
    primary = com.codelab.theming.ui.start.theme.Red700,
    primaryVariant = com.codelab.theming.ui.start.theme.Red900,
    onPrimary = Color.White,
    secondary = com.codelab.theming.ui.start.theme.Red700,
    secondaryVariant = com.codelab.theming.ui.start.theme.Red900,
    onSecondary = Color.White,
    error = com.codelab.theming.ui.start.theme.Red800
)

private val DarkColors = darkColors(
    primary = com.codelab.theming.ui.start.theme.Red300,
    primaryVariant = com.codelab.theming.ui.start.theme.Red700,
    onPrimary = Color.Black,
    secondary = com.codelab.theming.ui.start.theme.Red300,
    onSecondary = Color.Black,
    error = com.codelab.theming.ui.start.theme.Red200
)

@Composable
fun JetnewsTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit
) {
    MaterialTheme(
        colors = if (darkTheme) DarkColors else LightColors,
        typography = com.codelab.theming.ui.start.theme.JetnewsTypography,
        shapes = com.codelab.theming.ui.start.theme.JetnewsShapes,
        content = content
    )
}
