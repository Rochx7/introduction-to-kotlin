package br.com.rocha.firstkotlinproject.module

interface Average {
    val medium:Double

    fun recommend(score: Int)
}