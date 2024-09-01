package com.lannstark.lec12

fun main() {

    println(Singleton.a)
    Singleton.a += 10
    println(Singleton.a)

}

class Person private constructor(
    var name: String,
    var age:Int
) {

    // Kotlin 은 static 이 없다.
    // 대신 동행 객체(companion object)를 사용
    // val MIN_AGE = 1 에 0이라는 값이 런타임 시에 할당
    // val MIN_AGE = 1 에 const 를 붙이게 되면 컴파일 시에 변수 할당
    companion object  Factory : Log{
        // const -> 진짜 상수 (기본타입 및 String 에만 사용)
        private const val MIN_AGE = 1

        // Java 에서 companion object 의 이름이 없는 경우 사용할 때 붙여 준다.
        // @JvmStatic
        fun newBaby(name: String): Person{
            return Person(name, MIN_AGE)
        }

        // 추상 메서드 구현
        override fun log() {
            println("log")
        }
    }
}

// 싱클톤 클래스
// 싱글톤은 어차피 인스턴스가 하나이기 때문에 인스턴스화를 하지 않는다.
object Singleton {
    var a: Int = 0
}