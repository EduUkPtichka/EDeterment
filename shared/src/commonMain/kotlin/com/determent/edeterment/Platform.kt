package com.determent.edeterment

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform