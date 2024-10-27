package com.lannstark.lec16

fun main() {
    val str = "ABC"
    println(str.lastChar())
}

// 확장 함수
// String. -> String Class를 확장 -> 수신객체 타입
// 함수 안에서는 this를 통해 인스턴스 접근
// this -> 수신객체
fun String.lastChar(): Char {
    return this[this.length - 1]
}