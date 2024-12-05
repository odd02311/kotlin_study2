package part._1._1

/*
    람다식:
        - 익명함수
        - 람다식으로 선언을 하면 하나의 변수처럼 사용이 가능. 함수의 argument로 들어갈 수 있고, 함수의 리턴값으로도 활용이 가능하다.
        - 한번 사용되고, 재사용되지 않는 함수

    익명함수 : fun() { println("hello" }
    변수 처럼 사용: val a = fun( println("hello") )

    val b: (입력 타입 값) -> (리턴 타입 값) = { 구현부/ 마지막에 나오는 부분이 리턴값 }

 */


fun main() {
    val a = fun() { println("hello") }
    val c: Int = 10
    val b: (Int) -> Int = {  it * 10 }
    val  d = { i : Int, j: Int  -> i * j }
    val f : (Int, String, Boolean) -> String = { _, b, _ -> b }

    println(b(10))
    println(d(1, 4))
    hello(10, b)
}

// 함수의 argument
fun hello(a: Int, b: (Int) -> Int): (Int) -> Int{
    println(a)
    println(b(20))
    return b
}