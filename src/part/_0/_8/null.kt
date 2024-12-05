package part._0._8

/*
    자바에서는 NULL을 컴파일단계에서 확인할 수 없다.
    나중에 할당되는 값들도 있기때문이다. 실제로 실행을 해야지 알수있는데 그때는 NPE가 발생한다.

    코틀린은 language단게에서 null을 넣을수 있는 값과 없는 값을 분류할 수 있다.

    ?: 엘비스 연산자를 사용해서 null 검사식을 자바보다 쉽게 만들 수 있다.
 */

fun main() {
    var name : String = "이름" // null 할당 불가능

    var nickname: String? = null // ?연산자를 이용해 null 할당 가능을 선언
    var number: Int? = null
    // 자바 null 검사식
//    val result = if(nickname == null) "값이 없음" else nickname
//
//    println(result)
    
    // 코틀린 null 검사식
    val result = nickname?: "값이 없음"

    println(result)

    // null safety 
    nickname = null
    val size = nickname?.length

    println(size)

}