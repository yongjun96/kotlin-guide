package com.lannstark.lec14

sealed class HyundaiCar (
    val name: String,
    val price: Long
)


class Avante : HyundaiCar("아반떼", 1_000L)
class Sonata : HyundaiCar("소나타", 2_000L)
class Grandeur : HyundaiCar("그렌저", 3_000L)


private fun handlerCar(car: HyundaiCar){
    when (car){
        is Avante -> println("아반떼")
        is Grandeur -> println("그렌저")
        is Sonata -> println("소나타")
    }
}