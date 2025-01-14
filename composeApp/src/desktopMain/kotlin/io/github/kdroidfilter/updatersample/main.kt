package io.github.kdroidfilter.updatersample

import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import io.github.kdroidfilter.platformtools.appmanager.WindowsInstallerConfig

fun main() = application {
    WindowsInstallerConfig.requireAdmin = false
    Window(
        onCloseRequest = ::exitApplication,
        title = "App with AutoUpdater",
    ) {
        App()
    }
}