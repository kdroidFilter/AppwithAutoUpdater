package io.github.kdroidfilter.updatersample

import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application

fun main() = application {
    Window(
        onCloseRequest = ::exitApplication,
        title = "App with AutoUpdater",
    ) {
        App()
    }
}