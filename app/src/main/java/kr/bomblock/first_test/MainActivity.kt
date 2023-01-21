package kr.bomblock.first_test

fun main () {

    // 주석창 연습
    //todo: 해야하는 과제 목록 나열하는 주석

    /*여러줄의 주석 설정
    *
    * 하하하하
    * */
    var myName = "new"
    myName = "jae"

    print("hello " + myName)

    // TODO : Integer TYPES: Byte(8 bit), Short ( 16 bit), INt ( 32Bit) Long( 64bit)
    // 위의 내용대로 데이터 값이 결정되고
    val myByte: Byte = 12
    val myShot: Short = 1245
    val myInt: Int = 12334123
    val myLong: Long = 12312_123123_23123

    print("값은?" + myShot)

    val myStr = "Hollo World"
    var firstCharInStr = myStr[0]
    var lastCharInStr = myStr[myStr.length - 1]

    print("Last character" + lastCharInStr)


    //산술 연산자 합습 ( + - * / % )
    var result = 5+3
    val a = 5.0
    val b = 3
    result = (a/b).toInt()
    print(result)

//    var result = 5+3
//    val a = 5.0
//    val b = 3
//    var resultDouble : Double
//    resultDouble = a / b
//    print(resultDouble)

    //todo : 비교 연산자
    //todo : 비교연산자 종류 ( == , !=,<,>, <=,>=)
    val isEqual = 5==3
    println ("isEqual is $isEqual")

    val isNotEqual = 5!=5
    println("isNotEqual is $isNotEqual")

    print("is-5less3 ${-5<3}")
    print("is5LowerEqual3 ${5<=3}")
    print("is5GreaterEqual3 ${5>=3}")

    //todo : 증감 연산자 Assignment operators (+=, -=, *=,/=, %=)
    var myNum = 5
    myNum +=3
    myNum *=4
    println("myNum is $myNum")

    //Increment & Decrement operators (++,--)
    myNum++
    println("myNum is $myNum")
    println("myNum is ${++myNum}")
    println("myNum is ${myNum++}")
    println("myNum is ${--myNum}")

    //todo: if문 연습하기

    var heightPerson1 = 170
    var heightPerson2 = 170

    if(heightPerson1 > heightPerson2) {
        println("use raw force")
    }else if(heightPerson1 == heightPerson2) {
        println("use your power technique 1337")
    }else{
        println("use technique")
    }

    val age = 17

    if(age >= 30)
        println("you're over 30")


    if(age >= 21 ){
        println("now you may drink in the us")
    }else if(age >= 18){
        println("you may vote now")
    }else if(age >= 16){
        println("you may drive now")
    }else{
        print("you're too young")
    }


    //todo : 기본 if문과 다른 데이터 타입의 if문 사용법
    // 두번째 if의 괄호안 타입이 boolean 타입이여야 참 거짓 판별이 가능하다.

    var name = "Denis"

    if(name == "Denis"){
        println("Welcome home denis")
    }else{
        println("who are you?")
    }
    var isRainy =true
    if(isRainy)
        println("It's rainy")

}