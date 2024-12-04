package part._0._5

fun main() {
    max(10, 3)
    isHoliday("금")
}

// 조건문
//fun max(a: Int, b: Int) {
//    val result = if(a > b) {
//        println(a)
//    } else {
//        println(b)
//    }
//    println(result)
//}
/*
    자바와의 조건문 차이
    자바에서는 조건문은 조건문으로 statement지만

    코틀린에서는 표현식이라 변수에 할당이 가능
    val result = 조건식

    자바에서는 switch문이 있으면

    코틀린에는 when이 있다.

 */

fun max(a: Int, b: Int) {
    val result = if (a > b) {
        a
    } else {
        b
    }
    println(result)
}
// val result = if(a>b) a else b 도 가능

// 월 화 수 목 금 토 일
fun isHoliday(dayOfWeek: String) {
    val result = when(dayOfWeek){
//        "월",
//        "화",
//        "수",
//        "목",
//        "금" -> false
        "토",
        "일" -> true
        else -> false
    }
    println(result)
}