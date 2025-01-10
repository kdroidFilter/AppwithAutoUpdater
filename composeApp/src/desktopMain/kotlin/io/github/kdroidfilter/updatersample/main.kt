package io.github.kdroidfilter.updatersample

import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import io.github.kdroidfilter.platformtools.appmanager.WindowsConfig

fun main() = application {
    WindowsConfig.requireAdmin = false
    Window(
        onCloseRequest = ::exitApplication,
        title = "App with AutoUpdater",
    ) {
        App()
    }
}