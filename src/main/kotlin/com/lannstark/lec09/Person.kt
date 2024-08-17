package com.lannstark.lec09

import com.lannstark.lec01.Person


fun main(){
    val person = Person("김용준", 100)
    println(person.name)
    // 바로 값을 넣을 수 있다. (setter)
    person.age = 10
    println(person.age)

    // Java class 를 가져 와서 쓴다고 해도 .field 를 사용할 수 있다.
    val javaPerson = JavaPerson("김용준", 100)
    println(javaPerson.name)
    javaPerson.age = 10
    println(javaPerson.age)
}

// Kotlin 은 생성자(constructor)를 class 를 생성할 때 지정
// constructor 는 생략 가능
// 또한 생성자에서 프로퍼티를 만들 수 있기 때문에 필드를 생략할 수 있다.
class Person (
    val name: String,
    var age: Int
){
    // class(생성되는 시점) 가 초기화 되는 시점에 한번 호출되는 블럭
    init {
        if( age <= 0){
            throw IllegalArgumentException("나이는 ${age}일 수 없습니다");
        }
    }
}

    // {} -> body 또한 존재 하지 않는 다면 생략 가능
    // 프로퍼티 : field + getter + setter
    // Kotlin 은 field 만 만들면 getter + setter 를 자동으로 생성
    //val name = name
    //var age = age

