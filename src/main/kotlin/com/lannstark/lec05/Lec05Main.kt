package com.lannstark.lec05

fun main(){

    validateScoreIsNotNegative(100);

}

fun validateScoreIsNotNegative(score: Int){
    if(score in 0..100){
       println("score의 범위는 0부터 100입니다.")
    }
}

fun getPassOrFail(score: Int): String{
    return if(score >= 50){
        return "P"
    } else{
        return "F"
    }
}


fun getGrade(score: Int): String{
    return if(score >= 90) {
        "A"
    } else if(score >= 80) {
        "F"
    } else if (score >= 70) {
        "C"
    } else {
        "D"
    }
}