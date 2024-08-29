package com.lannstark.lec10

class Penguin (
    species: String
) : Animal(species, 2), Swimable, Flyable {

    private val wingCount: Int = 2

    override fun move() {
        println("펭권이 움직입니다.")
    }

    // customGetter 사용
    override val legCount: Int
        get() = super.legCount + this.wingCount

    override fun act() {
        super<Swimable>.act()
        super<Flyable>.act()
    }

    // 추상 메서드 구현
    override fun fly() {
        println("날 수 있다.")
    }

    override val swimAbility: Int
        get() = 1
}