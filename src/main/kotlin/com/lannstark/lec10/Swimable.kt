package com.lannstark.lec10

interface Swimable {

    // customGetter 를 이용해서 상속하고 있는 class 에서 만들어 줘야 함
    val swimAbility: Int

    // 직접 default 값으로 구현 가능
    //val swimAbility: Int
    //    get() = 1

    fun act(){
        // Penguin 에서 customGetter 로 구현한 swimAbility 를 사용 가능
        println("swimAbility = $swimAbility")
        println("어푸어푸")
    }
}