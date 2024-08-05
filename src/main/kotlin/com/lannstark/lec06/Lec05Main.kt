package com.lannstark.lec06

fun main() {

    // for-each 문
    val numbers = listOf(1L, 2L, 3L)

    for (number in numbers) {
        println(number)
    }

    println("-----------------------------------------------------")

    // 전통적인 for문
    for(i in 1..3){
        println(i)
    }

    println("-----------------------------------------------------")

    // 전통적인 for문 내려가는 경우
    for(i in 3 downTo 1){
        println(i)
    }

    println("-----------------------------------------------------")

    // 전통적인 for문 정해진 만큼 올리는 경우
    for(i in 1..5 step 2) {
        println(i)
    }

    println("-----------------------------------------------------")

    // while문
    var i = 1
    while (i <= 3){
        println(i)
        i++
    }

}

