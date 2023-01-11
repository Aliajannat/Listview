package com.glunda.kotlinclass

fun main(){
    println("Submit your id number")
    var id:Int = readLine()!!.toInt()

    when(id){
        1 -> println("Your id number is one")
        2 -> println("Your id number is two")
        3 -> println("Your id number is three")
        4 -> println("Your id number is four")
        5 -> println("Your id number is five")
        else-> println("its wrong id")
    }
}