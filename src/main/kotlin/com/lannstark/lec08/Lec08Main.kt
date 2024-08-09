package com.lannstark.lec08

fun main(){

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
