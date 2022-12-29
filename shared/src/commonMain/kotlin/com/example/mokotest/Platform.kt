package com.example.mokotest

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform