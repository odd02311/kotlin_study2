package part._0._10

/*
    로그 찍을때 유용하다

 */

fun main() {
    val a =10
    val name = "안녕"
    val isHigh = true

    // 자바
//    println(a.toString() + name + isHigh.toString())
//    String.format("%s %d", name, a)

    // 코틀린 string template
    println("$a ${name.length} $isHigh")
}