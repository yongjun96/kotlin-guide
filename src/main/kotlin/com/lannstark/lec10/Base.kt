package com.lannstark.lec10

open class Base (
    open val number: Int = 100
){
    // 초기화
    init {
        println("Base Class")
        println("number = $number")
    }
}