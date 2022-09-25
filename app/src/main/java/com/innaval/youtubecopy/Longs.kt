package com.innaval.youtubecopy

fun Long.formatTime() : String {
    println(this)
    val minutes = this / 1000 / 60
    val seconds = this / 1000 % 60
    return String.format("%02d:%02d", minutes, seconds)
}