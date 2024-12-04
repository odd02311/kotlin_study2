package part._0._4


fun main() {
    val user = User("이름", 10)
    println(user.age)
    val kid = Kid("아이", 3, "male")
}

/*
    class 클래스명(매개변수)
    () = 생성자
    default 값 초기화도 가능
 */

open class User(open val name : String, open var age: Int){

}

class Kid(override val name: String, override var age: Int) : User(name, age){
    var gender: String = "female"

    //
    init {
        println("초기화 중 입니다.")
    }

    // 부 생성자 secondary constructor
    constructor(name: String, age: Int, gender: String,) : this(name, age){
        this.gender = gender
        println("부 생성자 호출")
    }
}