package ru.netology

fun main() {
    val likes = 11
    val ending = if (likes % 10 == 1
        && likes != 11
        && likes != 111
        && likes != 1111
        && likes != 11111) "человеку" else "людям"
    println("Понравилось: $likes $ending")
}