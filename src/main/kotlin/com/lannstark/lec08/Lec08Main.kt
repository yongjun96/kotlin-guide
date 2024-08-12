package com.lannstark.lec08

fun main(){

    // useNewLine = false -> named argument
    repeat("Hi", useNewLine = false)

    println()

    // 파라미터가 많은 경우 동일한 타입이라 혼동되는 경우 방지
    printNameAndGender(gender = "남자", name = "김용준")

    println()

    var array = arrayOf("A", "B", "C")
    // * -> spread 연산자 : 배열안에 있는 것들은 `,`룰 쓰는 것과 같이 꺼내 온다.
    printAll(*array)

}

fun max(a: Int, b: Int): Int =
    if(a > b){
        a
    }else{
        b
    }

// 한 줄로 작성 시
// `=`를 사용하면 함수의 반환 타입을 생략 가능
fun maxStyle2(a: Int, b: Int) = if(a > b) a else b


// 기본 값을 지정해 줄 수 있고 기본 값이 있는 경우 메서드를 사용할 때 값을 넣지 않으면 기본 값을 사용
fun repeat(str: String,
           num: Int = 5,
           useNewLine: Boolean = true
){
    for(i in 1..num){
        if(useNewLine){
            println(str)
        }else {
            print(str)
        }
    }
}

// named argument
fun printNameAndGender(name: String, gender: String){
    println("이름 : $name")
    println("성별 : $gender")
}

fun printAll(vararg strings: String){
    for(str in strings){
        println(str)
    }
}
