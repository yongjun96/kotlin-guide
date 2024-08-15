package com.lannstark.lec09

// Kotlin 은 생성자(constructor)를 class 를 생성할 때 지정
// constructor 는 생략 가능
// 또한 생성자에서 프로퍼티를 만들 수 있기 때문에 필드를 생략할 수 있다.
class Person (
    val name: String,
    var age: Int
)

    // {} -> body 또한 존재 하지 않는 다면 생략 가능
    // 프로퍼티 : field + getter + setter
    // Kotlin 은 field 만 만들면 getter + setter 를 자동으로 생성
    //val name = name
    //var age = age

