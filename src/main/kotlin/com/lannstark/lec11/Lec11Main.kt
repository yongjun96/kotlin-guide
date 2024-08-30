package com.lannstark.lec11


// 파일 내에서 여러개의 함수, 변수, 클래스를 만들 수 있다.

var a = 3

fun add(a: Int, b: Int): Int{
    return a+b
}

// 생성자에 접근 제어를 걸려면 constructor 를 써줘야 한다.

class Store internal constructor()

// getter 3개 -> name, owner, _price
// setter 2개 -> _price, owner
class Car(
   internal val name: String,
   private var owner: String,
    _price: Int
){
    var price = _price
        private set
}