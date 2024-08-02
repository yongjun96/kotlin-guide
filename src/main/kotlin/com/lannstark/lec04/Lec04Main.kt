package com.lannstark.lec04

fun main(){

    val money1 = JavaMoney(2_000L)
    val money2 = JavaMoney(1_000L)
    val money3 = money2

    val kotlinMoney1 = Money(1_000L)
    val kotlinMoney2 = Money(2_000L)

    println(kotlinMoney1 + kotlinMoney2)


    println(money3 == money2)

    if(money1 > money2){
        println("Money1이 Money2보다 금액이 큽니다")
    }

    // fun2를 실행하지 않고 "본문 실행"을 출력
    // ||는 `또는` 이기 때문에 fun1() 이 true 여서 뒤는 볼 필요 없이 넘긴다. (Lazy 연산)
    if(fun1() || fun2()){
        println("본문 실행")
    }

    // fun1d을 실행하지 않고 블럭을 넘김
    // &&는 `모두` 이기 때문에 fun2() 가 이미 false 이기 때문에 뒤는 볼 필요 없이 넘긴다. (Lazy 연산)
    if(fun2() && fun1()){
        println("본문 실행")
    }

}

fun fun1(): Boolean {
    println("fun1")
    return true
}

fun fun2(): Boolean {
    println("fun2")
    return false
}