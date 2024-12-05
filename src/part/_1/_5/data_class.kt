package part._1._5

/*
    data class: 데이터를 담기 위한 클래스
        - toString(), hashCode(), equals(), copy() 메서드를 자동으로 생성
            * override 하면, 직접 구현한 코드를 사용
        - 1개 이상의 프로퍼티가 있어야함
        - 데이터 클래스는 abstract, open, sealed, inner 를 붙일 수 없음
        - 상속이 불가능 (위 4개의 메소드를 상속받아 어떻게 구현을 할지 몰라서 상속 불가능)
 */

fun main() {
    val person = Person("이름", 26) // 주소값 출력
    val dog = Dog("강아지", 6)

    println(person.toString())
    println(dog.toString())
    println(dog.copy(age = 3).toString()) // 프로퍼티가 많을때 하나만 바꾸고 싶을때 copy()
}

class Person (
    val name : String,
    val age: Int,
)


data class Dog(
    val name: String,
    val age: Int,
) {
//    override fun toString(): String {
//        return "오버라이드 직접 구현 $name"
//    }
}

