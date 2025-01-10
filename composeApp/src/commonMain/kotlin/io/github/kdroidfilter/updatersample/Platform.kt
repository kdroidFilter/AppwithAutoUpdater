package io.github.kdroidfilter.updatersample

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform