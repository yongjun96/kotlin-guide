package com.lannstark.lec14

fun handleCountry(country: Country) {
    when (country) {
        Country.AMERICA -> println()
        Country.KOREA -> println()
    }
}

enum class Country (
    private val code: String
){
    KOREA("KO"), AMERICA("US")
}