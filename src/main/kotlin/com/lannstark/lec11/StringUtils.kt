package com.lannstark.lec11

// Kotlin 에서는 직접 파일에 유틸성 코드를 작성해서 사용 하는게 편하다

fun isDirectorPath(path: String): Boolean {
    return path.endsWith("/")
}