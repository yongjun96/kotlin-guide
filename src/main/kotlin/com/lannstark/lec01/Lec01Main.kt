package com.lannstark.lec01

fun main() {

    var number1 = 10L // 가변
    val number2 = 10L // 불변

    var number3: Long? = 1_000L // null이 들어갈 수 있도록 하려면 타입을 붙이고 ? 사용
    var person = Person("김용준") // 객체를 인스턴스화 할 때 new를 붙이면 안된다.

}