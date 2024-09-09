package com.lannstark.lec14


fun main(){
    var dtoV1 = PersonDTO("김용준", 29)
    var dtoV2 = PersonDTO("김용준", 100)
    println(dtoV1.name == dtoV2.name)
    println(dtoV1.age == dtoV2.age)
    println(dtoV1)
}

// data 키워드를 붙이면 data class 라고 한다.
// equals / hashCode / toString 을 자동으로 만들어 준다.
data class PersonDTO (
    val name: String,
    val age: Int
){
}