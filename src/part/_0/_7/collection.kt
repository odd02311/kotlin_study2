package part._0._7

/*
    collection: list, map, set

    자바의 리스트는 값을 추가 삭제 변경이 가능하지만
    코틀린은 mutable을 통해 값을 변경 불변으로 나눌수 있다.
 */

fun main(){
    val list = mutableListOf(1, 2, 3, 4, 5)
    list.add(6)
    list.addAll(listOf(7,8,9))

    val list1 = listOf(1, 2, 3, 4)
    // list1[0] == list1.get(0)
//    list1.add 변경 불가 호출만 가능

    list1.

    val diverseList = listOf(1, "안녕", 1.78, true)

    println(list.joinToString(","))

    val map = mapOf((1 to "안녕"), (2 to "hello"))
//    map.put 변경 불가
    val map1 = mutableMapOf((1 to "안녕"), (2 to "hello"))
    map1[3] = "ni hao"
    // map1.put(3, "ni hao") == map1[3] = "ni hao"
}