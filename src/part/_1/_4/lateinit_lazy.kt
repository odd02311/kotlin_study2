package part._1._4

/*
    초기화 지연: lateinit, lazy
     - 정의: 변수를 선언할 때 값을 지정하지 않고, 나중에 지정할 수 있는 방법
     - 목적: 메모리를 효율적으로 사용하기 위해서, null safe 한 value를 사용하기 위해서
     
     lateinit, var:
        - 변수 타입을 지정해줘야함
        - primitive 타입은 사용할 수 없음
        - 선언 후, 나중에 초기화 해줘도 됨

     lazy, val:
        - 선언과 동시에 초기화를 해야함
        - 호출 시점에 초기화가 이루어짐
 */
/*
    함수(ex: fun main() {})가 실행되기 전에는
    text의 값이 initialize 되기 어려울 때가 있다.
    어디서든 쓰기 때문에 함수 밖에서 선언을 했지만
    선언하는 순간에는 값을 모를 수가 있다.

    이럴때는 null로 선언을 하고, 함수안에서 text = "name"으로 선언을 해도 괜찮다.
    하지만 초기화가 된다는 보장이 있으면 null을 넣어두는건 적합하지 않다.
    다른곳에서 이용할때마다 ?를 붙여야한다. 매번 null safety를 체크 하기보단
    초기화 지연을 사용하면 된다.

    lateinit var을 통해 초기화 지연이 가능하다.
    또한 항상 타입을 명시해줘야 한다. (: String)
    ex): lateinit var text: String
    나중가서 초기화를 해줄수 있다. 하지만 초기화를 아예 안해준다면 exception을 던진다.
 */
// 전역 선언- 어디에서나 접근이 가능하게
lateinit var text: String
//lateinit var age : Int // primitive한 타입은 선언이 불가능하다.
//lateinit var age: Integer // 참조 타입으로 써주면 된다.

// by lazy를 통해 초기화를 하게 되면, test를 호출하는 시점에 초기화(값을 할당)하게 된다.
// test를 호출하지 않으면 메모리에 할당이 되지 않된다.
val test: Int by lazy {
    println("초기화 중") // 초기화 시점 확인 로그
    100
}

fun main() {

    text = "name"

    println(text)

    println("메인 함수 실행")
    // test 초기화
    println("초기화 한 값 $test")
    println("두번째 호출 $test")
}