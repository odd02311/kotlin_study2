package part._1._6

import part._1._6.Book.Companion.NAME

/*
    object: 클래스를 정의함과 동시에 객체를 생성
        - 싱글톤을 쉽게 만들 수 있는 키워드
        - 생성자 사용 불가
        - 프로퍼티, 메서드, 초기화 블록은 사용 가능
        - 다른 클래스나, 인터페이스를 상속받을 수 있음
    에러 코드를 정의할때 많이 쓰인다. 에러코드는 여기저기서 사용이된다고 했을때 해당 인스턴스를 만든다고 했을때 매번 만들필요는 없기때문이다.
    
    companion object 동반 객체
        - Java 의 static 과 동일한 역할
        - 클래스 내에 하나만 생성할 수 있음
    자바에서처럼 상수값(static final) 선언하는 것처럼 자주 사용된다.
    또한 companion object 블럭 안에서는 팩토리 패턴, 빌더 패턴을 자주 사용할 수 있다.

 */

fun main() {
    // object는 counter로 선언하면 객체가 바로 생성이 된다.
    // 오직 딱 한번만 생성이 된다.
    Counter

    println(Counter.count)
    // 만약 클래스였다면 모든 Counter의 값이 다른 인스턴스 였을 것이다.
    // countUp을 호출했다고 해도 결과값은 0이었을 것이다.
    Counter.countUp()
    Counter.countUp()

    println(Counter.count)
    // 상속받은 클래스의 함수에도 접근이 가능
    Counter.hello()

    NAME

}

object Counter : Hello() {
    // 초기화 블럭
    init {
        println("카운터 초기화")
    }
    // 프로퍼티
    var count = 0
    // 메서드
    fun countUp() {
        count++
    }
    
}

open class Hello() {
    fun hello() = println("Hello")
}

class Book(){
    companion object{ // 자바의 static 과 동일하다.
        const val NAME = "name"
        fun create() = Book()
    }
}