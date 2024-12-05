package part._1._5

/*
    Sealed class: 추상 클래스로, 상속받은 자식 클래스의 종류를 제한
        - 컴파일러가 sealed 클래스의 자식 클래스가 어떤 것인지 암
        - when 과 함께 쓰일 때, 장점을 느낄 수 있음

    // 추상 클래스
    abstract class Cat {}
    class BlueCat : Cat()
    class RedCat : Cat()
    class GreenCat : Cat()

    val cat : Cat = BlueCat()

    val result = when(cat) {
        is BlueCat-> "blue"
        is RedCat-> "red"
        is GreenCat-> "green"
        else -> "none"
    }
    이때 Cat(abstract class)을 상속받은 클래스들은 BlueCat, RedCat, GreenCat 이렇게 3개뿐이다
    3개 이외에는 else로 들어갈 케이스가 없다.
    컴파일러는 Cat 이하의 상속받은 애들이 누군지 모른다.

    하지만 abstract class를 sealed class로 바꿔준다면 else가 redundant로 표시된다.
    sealed 클래스로 바꿔주면 컴파일러가 Cat이 어떤 자식 클래스를 가지고 있는지 알게된다.
    else 분기가 필요가 없어진다.

    에러 케이스를 체크할때, view 타입을 체크할때 자주 쓰인다.
    장점으로는 만약 WhiteCat 클래스를 추가하면 when문에 컴파일 오류가 발생됨으로 알려주게 된다.
    컴파일러가 Cat이 어떤 자식을 가지고 있는지 알기때문에 컴파일 오류가 발생하는걸 알 수 있다.

 */

fun main() {
    val cat : Cat = BlueCat()

    val result = when(cat) {
        is BlueCat-> "blue"
        is RedCat-> "red"
        is GreenCat-> "green"
        is WhiteCat -> "white"
    }
}

// 추상 클래스
sealed class Cat {}
class BlueCat : Cat()
class RedCat : Cat()
class GreenCat : Cat()
class WhiteCat : Cat()