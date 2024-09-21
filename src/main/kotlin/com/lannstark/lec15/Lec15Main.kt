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

    //-----------------------------------------------------------------------------------------

    // List

    val numbers = listOf(100, 200)

    // 비어 있는 리스트의 타입은 명시적으로 적어야 한다.
    val emptyList = emptyList<Int>()

    // 비어 있는 List를 넣더라도 Type 추론이 되기 때문에 가능하다.
    printNumbers(emptyList())


    // 배열처럼 대괄호로 가져올 수 있다.
    println(numbers[0])

    // for each문
    for (number in numbers){
        println(number)
    }

    // for withIndex()
    for ((idx, value) in numbers.withIndex()) {
        println("$idx $value")
    }

    // 가변 List
    val numbersV2 = mutableListOf(400, 600)
    numbersV2.add(300)

    //-----------------------------------------------------------------------------------------

    // Set
    val setNumbers = setOf(100, 200)

    // for each
    for(number in setNumbers) {
        println(number)
    }

    // for withIndex()
    for ((index, value) in setNumbers.withIndex()) {
        println("$index $value")
    }

    // Set의 가변(Mutable)
    // 기본 구현체는 LinkedHashSet
    val setNumbersV2 = mutableSetOf(400, 600)

    //-----------------------------------------------------------------------------------------

    // Map

    val oldMap = mutableMapOf<Int, String>()

    oldMap[1] = "MONDAY"
    oldMap[2] = "TUESDAY"

    // mapOf 를 사용하는 경우는 key, value 사이에 to 를 넣어야 한다.
    mapOf(3 to "WEDNESDAY", 4 to "THURSDAY")

    // Map 활용

    for (key in oldMap.keys) {
        println(key)
        println(oldMap[key])
    }

    for ((key, value) in oldMap.entries) {
        println(key)
        println(value)
    }

    //-----------------------------------------------------------------------------------------






}

private fun printNumbers(numbers: List<Int>){

}