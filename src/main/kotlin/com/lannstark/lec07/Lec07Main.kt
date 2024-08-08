package com.lannstark.lec07

import java.io.BufferedReader
import java.io.File
import java.io.FileReader
import java.lang.NumberFormatException

fun main() {

    //parseIntOrThrow("문자열")
    readFile()
}

// try-catch 사용
fun parseIntOrThrow(str: String): Int {
    try{
        return str.toInt()
    }catch (e: NumberFormatException){
        throw IllegalArgumentException("주어진 ${str}는 숫자가 아닙니다")
    }
}


// try-catch 사용 (null 반환)
fun parseIntOrThrowV2(str: String): Int? {
    return try{
        str.toInt()
    }catch (e: NumberFormatException){
        null
    }
}

// 파일 읽어 오기
fun readFile(){
    val currentFile = File(".")
    // absolutePath -> 절대 경로
    val file = File(currentFile.absolutePath + "/a.txt")
    val reader = BufferedReader(FileReader(file))
    println(reader.readLine())
    reader.close()
}

// use를 사용
fun readFileV2(path: String){
    BufferedReader(FileReader(path)).use { reader ->
        println(reader.readLine())
    }
}