package part._0._9

/*
    자바에서는 instanceOf로 타입 체크를 한다.

    코틀린에서는 is를 통해서 타입 체크를 한다.

    as연산자는 케스팅을 위해 사용된다.

    as뒤에 ?를 붙여서 ClassCastException을 방지할 수 있다.

 */


fun main() {
    println(check("안녕"))
    println(check(1))
    println(check(true))

    println()

    cast("안녕")
    // ClassCastException 발생. 하지만 as뒤에 ?를 찍어주면 null 값으로 나와서 exception이 발생이 안된다.
    cast(12)

    println()

    println(smartcast("문자열"))
    println(smartcast(10))
    println(smartcast(true))

}

fun check(a: Any): String {
//    return if(a is String) {
//        "문자열"
//    } else if(a is Int) {
//        "숫자"
//    } else {
//        "불명"
//    }
    return when (a) {
        is String -> "문자열"
        is Int -> "숫자"
        else -> "불명"
    }
}

// 캐스팅
fun cast(a : Any) {
    val result = (a as? String) ?: "null일때 default 값 출력"
    println(result)
}

// smart cast
fun smartcast(a: Any): Int {
    return if(a is String) {
        a.length
    } else if (a is Int) {
        a.dec()
    } else {
        -1
    }
}