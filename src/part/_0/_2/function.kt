package part._0._2

fun main() {
    val result = test(1, 3)
    test2(id = "아이디", name = "이름", nickname = "별명") // ex
    println(result)
}

// 2. 함수
/* fun = function fun 함수명()
    : unit = 자바의 void
    fun 함수명() : 리턴타입 {
        함수로직
    }

    fun 함수명(매개변수: 타입, 매개변수: 타입) : 리턴타입 {
        함수 로직
        }

    코틀린은 오버로딩이 필요없다.

    fun test(a: Int, b: Int = 3)
    이런식으로 디폴트 값을 선언해줄 수 있다.

    변수명을 써줌으로서 순서 또한 변경이 가능하다 ex

*/
fun test(a: Int, b: Int): Int {
    println(a+b)
    return a+b
}

fun test2(name: String, nickname: String, id: String) {
    println(name + nickname + id)
}

fun times(a: Int, b: Int) = a* b // 아래와 동일
/*
    fun time(a: Int, b: Int) : Int {
        return a* * b
        }
 */

