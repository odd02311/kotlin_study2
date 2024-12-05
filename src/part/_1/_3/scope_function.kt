package part._1._3

/*
    scope function (범위 지정 함수)
    코틀린 표준 라이브러리에서 제공하는 확장함수
    목적: 간겴성, 명료성, 유지보수 용이성
    정의: 객체의 컨텍스트 내에서, 실행 가능한 코드 블럭을 만드는 함수
         호출 시, 임시 범위가 생성되며, 이 범위 안에서는 이름 없이 객체에 접근 가능
        context: 문맥, 맥락, 전후 사정, 객체 내에서 실행 가능한 코드블럭을 만든다라고 이해하면 된다.
        수신 객체(receiver): 확장 함수가 호출되는 대상이 되는 값(객체)
        수신 객체 지정 람다(lambda with receiver) : 수신 객체를 명시하지 않고, 람다의 본문 안에서 해당 객체의 메서드를 호출할 수 있게 하는 것
   차이점
      - 수신 객체 접근 방법 : this, it
      - return 값: 수신객체, 마지막 행(lambda result)

   코틀린 범위 지정 함수
    - 수신 객체:
          this(생략 가능)
          it (생략 불가능)
          return
    - 확장함수로 호출:
          수신 객체(this): apply, run
          수신 객체(it): also, let
          수신 객체(return): 수신 객체, 람다 식의 마지막 행
    - 함수의 인자
          수신 객체(this): with
    
    let: null 체크를 해야할 때, 지역 변수를 명시적으로 표현 해야할 때
    run: 객체를 초기화 하고 리턴 값이 있을 때
    apply: 객체 초기화
    also: 수신객체를 명시적으로 사용하고 싶을 때, 로그를 남길 때
    with: 객체 초기화, 람다 리턴 값이 필요 없을 때

 */

fun main() {
    // let, run, apply, also, with
    // 1. let
    // 확장함수를 호출하기 위한 인스턴스
    val user : User? = User("이름", 10, true)
    // 값이 하나밖에 없다면 it으로 수신객체 표현이 가능하다. 명시적으로 ex): user라고 지역변수로 선언이 가능
    // 수산객체.let { it ->
    //
    // 마지막 행 // return
    // }
//    val age = user.let { user ->
//        user.age
//    }
//    println(age)
    // null이 아닌지 체크를 하고 null이 아닐때만 함수를 실행하기 위해 수신객체?. 으로 작성이 가능하다.
    val age = user?.let {
        it.age
    }
    println(age)

    // 2. run
    // 수신객체.run { this ->
    //
    // 마지막 행 // return
    // }
    // let과 run의 차이는 수신객체를 받는 방법이다
    // let은 it이라고 받았고 명시적으로 local variable로 선언이 가능했다.
    // 하지만 run은 선언이 불가능하고 this라고 받고, this는 생략이 가능하다.
    // run은 객체를 초기화 할때 자주 쓴다. ex): 함수를 overriding 하거나
    val kid = User("아이", 4, false)
    val kidAge = kid.run {
        age
    }
    println(kidAge)

    // 3. apply
    // 수신객체.apply { this ->
    //
    //
    // }
    // run 처럼 local variable 선언이 불가능
    // return 값이 수신객체 자기자신을 반환
    // run과 같이 똑같이 this로 수신객체를 받지만, run은 리턴 값이 람다 리턴식이고, apply는 자기 자신을 반환한다.
    val female = User("이름", 20, true)
    val femaleValue = female.apply {
        hasGlasses = false // default는 true 이지만, apply 함수 내부에서 false로 초기화
    }
    println(femaleValue.hasGlasses)

    // 4. also
    // 수신객체.also { it -> // local variable 가능
    // 
    // } // return 수신객체 (자기 자신)
    // also는 local variable을 함수에 선언할 수 있기 때문에, 초기화 용도 보다는 로그를 찍을때 더 많이 쓴다.
    val male = User("민수", 17, false, true)
    val maleValue = male.also {
        println(it.name)
    }
    println(maleValue.hasGlasses)
    
    // 5. with
    // with(수신객체) { this
    // ---
    // 마지막 줄이 return
    // }
    val result = with(male) {
        hasGlasses = false
        true
    }
}

class User(
    val name: String,
    val age: Int,
    val gender: Boolean, // true : female, false: male
    var hasGlasses : Boolean = true,
) {

}