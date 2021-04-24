package com.example.simple

fun sumar(a: Int, b: Float): Float{   // los valores que tipo son y el tipo de valor que retorna
    return a+b
}

fun maxOf(a: Int, b: Int) = if (a > b) a else b

fun main() {
    var myName = "Alli lol"
    var myAge = 5
    var myMoney = 6f
    var decimal: Double = 5.0
    // comments
    /*
    holaaaaaaa
    comentario largo
     */
    println("Hello world, $myName my age is $myAge")
    println("float: $myMoney")
    myMoney += 0.5f
    println("More money: " + myMoney)
    println(sumar(1, 2.3f))
    println("decimal ${decimal/3}")
    println(myName.lastIndexOf("l"))
    println(maxOf(0,-1))

    when (myAge) {
        1 -> print("x == 1")
        2 -> print("x == 2")
        else -> { // Note the block
            print("x is neither 1 nor 2")
        }
    }
    val items = listOf("apple", "banana")
    for(fruit in items){
        println(fruit)
    }
    do {
        myAge++
        println(myAge)
    }while (myAge<10)
    myAge = 5
    while (myAge<10){
        myAge++
        println(myAge)
    }

    var name: String = "Denis"
    var nullName: String? = "Denis"
    println(nullName)
    nullName = null
    println(nullName)
}