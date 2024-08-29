package com.lannstark.lec10

// Cat Class 를 만듦
// Animal Class 의 생성자(constructor)를 불러 옮

class Cat (
    species: String
) : Animal(species, 4) {   // 상속받는 경우 한칸 띄우고 :을 찍어야 한다.

    // Kotlin 은 override 를 어노테이션이 아니라 지시어를 사용
    override fun move() {
        println("고양이가 움직인다.")
    }
}