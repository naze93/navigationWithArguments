package com.example.navigation

data class Jeu(
    val id: Int,
    val nom: String
)

val listJeux =  listOf(
    Jeu(1, "SuperAventure"),
    Jeu(2, "CourseEclair"),
    Jeu(3, "PuzzleMagique")
)
