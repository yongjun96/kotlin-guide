package com.lannstark.lec15


fun main(){

    val array = arrayOf(100, 200)

    // 0부터 마지막 index 까지 반복
    for (i in array.indices){
        println("순번 : ${i} / 값 : ${array[i]}")
    }

    // plus 를 이용해서 쉽게 값을 추가 할 수 있다.
    array.plus(300)

    // index 와 value 를 한번에 돌릴 수 있다.
    for ((index, value) in array.withIndex()){
        println("순번 : ${index} / 값 : ${value}")
    }



}