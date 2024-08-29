package com.lannstark.lec10

class Derived(
    override val number: Int
) : Base(number){

    // 초기화
    init {
        println("Derived Class")
    }
}