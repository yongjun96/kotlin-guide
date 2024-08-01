package com.lannstark.lec03

import com.lannstark.lec03.Person

fun main(){

    // toLong()과 같이 형변환을 해줘야 함
    val num1: Int? = 3
    val num2: Long = num1?.toLong() ?: 0L

    // ${변수}를 사용해서 값을 가져올 수 있음
    val person = Person("김용준", 29)
    println("이름 : ${person.name}")

    // $ 만으로 변수 사용
    val name = "김용준"
    println("이름 : $name")


    // 개행하면 문자열 자석
    val str = """
        ABC
        EFG
        ${name}
    """.trimIndent()
    println(str)

    // 배열로 index의 값을 가져올 수 있음
    val strEng = "ABC"
    println(strEng[0])
    println(strEng[2])

}


// 형변환을 as 를 사용해서 가능
fun printAgeIfPerson1(obj: Any) {
    if(obj is Person){
        val person = obj as Person
        println(person.age)
    }
}


// 형변환을 if문에서 is를 사용해서 확인하면 obj를 그대로 사용할 수 있다.
fun printAgeIfPerson2(obj: Any) {
    if(obj is Person){
        println(obj.age)
    }
}


// 형변환을 if문에서 !is를 사용해서 확인하면 Person과 다른 타입이기 때문에 컴파일 에러가 발생한다.
fun printAgeIfPerson3(obj: Any) {
    if(obj !is Person){

    }else{
        println(obj.age)
    }
}


// obj에 null이 들어오는 경우 as? 를 사용해서 null인 경우 safe call 처럼 전체가 null이 된다.
fun printAgeIfPerson4(obj: Any?) {
    var person = obj as? Person
    println(person?.age)
}