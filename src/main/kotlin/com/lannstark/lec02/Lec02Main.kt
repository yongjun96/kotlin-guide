package com.lannstark.lec02

fun main(){

    val str: String? = "ABC"

    println(str?.length) // Safe Call : null이 아니면 실행 null이면 미실행
    println(str?.length ?: 0) // Elvis
    println(startsWith(null)) // null 아님 단언에서 null이 들어오는 경우 컴파일 에러는 안나지만 런타임 에러 발생

    // 플랫폼 타입 : Java코드를 Kotlin에서 사용할 때 null 관련 정보가 없는 경우
    val person = Person("개발자");
    startsWithNotNull(person.name)
}

fun startsWithNotNull(str: String): Boolean{
    return str.startsWith("A")
}

fun startsWithA1(str: String?): Boolean {
    return str?.startsWith("A") ?: throw IllegalArgumentException("null이 들어왔습니다")
}


fun startsWithA2(str: String?): Boolean? {
    return str?.startsWith("A")
}


fun startsWithA3(str: String?): Boolean {
    return str?.startsWith("A") ?: false
}

fun startsWith(str: String?): Boolean {
    return str!!.startsWith("A")
}