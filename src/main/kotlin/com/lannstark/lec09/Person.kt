package com.lannstark.lec09

fun main(){
    val person = Person("김용준", 100)
    println(person.name)
    // 바로 값을 넣을 수 있다. (setter)
    person.age = 10
    println(person.age)

    println("---------------------------------------------------------------")

    // Java class 를 가져 와서 쓴다고 해도 .field 를 사용할 수 있다.
    val javaPerson = JavaPerson("김용준", 100)
    println(javaPerson.name)
    javaPerson.age = 10
    println(javaPerson.age)

    println("---------------------------------------------------------------")

    // 새로운 생성자를 이용해서  name 만 입력 받고 age 는 default
    val personV2 = Person("김용준")
    println(personV2.name)
    println(personV2.age)

    println("---------------------------------------------------------------")


    val personV3 = Person()
}

// Kotlin 은 생성자(constructor)를 class 를 생성할 때 지정
// constructor 는 생략 가능
// 또한 생성자에서 프로퍼티를 만들 수 있기 때문에 필드를 생략할 수 있다.
class Person (
    name: String = "김용준",
    var age: Int = 1
){

    // 원래 사용하던 val name: String = "김용준" 은 custom getter를 만들기 위해 아래로 내려서 get()으로 써준다
    // field. 을 사용하는 이유 : 밖에서 호출할 때는 get()을 부르고 name이라는 필드가 먼저 호출
    // 안에서도 name을 호출하면 name의 대한 getter가 호출된다.
    // 안에 있는 getter를 부르고 부르는 무한 루프가 발생하게 된다.
    // 이것을 backing field (보이지 않는 필드)라고 부른다
    // 중요 ※ : 하지만 사용할 일이 별로 없다. 이유는!!
//    var name = name
//        get() = field.uppercase()

    // 이렇게 this를 사용해서 backing field를 대체할 수 있다.
    val upperCaseName: String
        get() = this.name.uppercase()

    // custom setter
    // value는 들어오는 파라미터를 대문자로 바꾸로 field(자기 자신)에게 넣어 준다
    // 사실상 setter의 사용을 지양하기 때문에 쓸일이 없다
    var name = name
        set(value) {
            field = value.uppercase()
        }


    // class(생성되는 시점) 가 초기화 되는 시점에 한번 호출되는 블럭
    init {
        if( age <= 0){
            throw IllegalArgumentException("나이는 ${age}일 수 없습니다");
        }
        println("초기화 블럭")
    }

    // 새로운 생성자
    constructor(name: String): this(name, 1) {
        println("첫 번째 부 생성자")
    }

    constructor(): this("홍길동") {
        println("두 번째 부 생성자")
    }

    // 전형적인 방식
    fun isAdult(): Boolean {
        return this.age >= 20
    }

    // custom getter
    val isAdultV2: Boolean
        get() = this.age >= 20

    // custom getter
    // V2와 다른 방식으로 return 을 사용하며 {} 사용
    val isAdultV3: Boolean
        get() {
            return age >= 20
        }

}

    // {} -> body 또한 존재 하지 않는 다면 생략 가능
    // 프로퍼티 : field + getter + setter
    // Kotlin 은 field 만 만들면 getter + setter 를 자동으로 생성
    //val name = name
    //var age = age

