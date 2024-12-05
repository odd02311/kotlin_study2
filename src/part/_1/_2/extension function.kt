package part._1._2

/*
    확장함수 (extension function)
    기존에 정의되어 있는클래스에 함수를 추가하는 기능
 */

fun main() {
    val test = Test()
    test.hello()
    test.hi()

}

// 확장함수
// test에 hi 함수가 없지만 이런식으로 함수 추가가 가능하다.
fun Test.hi() = println("hi")


class Test() {
    fun hello() = println("안녕")
    fun bye() = println("잘가")
}