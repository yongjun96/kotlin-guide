package com.lannstark.lec13

fun main() {

}

// 권장 되는 방법 내부에서 밖의 클래스를 참조하지 않음

class House(
    private val address: String,
    private val livingRoom: LivingRoom
) {

    class LivingRoom(
       private val area: Double
    )
}


// 권장 되지 않는 방법

//class House(
//    private val address: String,
//    private val livingRoom: LivingRoom
//) {
//
//    inner class LivingRoom(
//        private val area: Double
//    ) {
//        val address: String
//            get() = this@House.address
//    }
//}