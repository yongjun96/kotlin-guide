package com.lannstark.lec10

abstract class Animal (
    protected val species: String,  // 동물의 종류
    // Kotlin 은 프로퍼티를 override 할 때 open 을 붙여 줘야 사용 가능
    protected open val legCount: Int,    // 동물의 다리 갯수
){

    abstract fun move()

}