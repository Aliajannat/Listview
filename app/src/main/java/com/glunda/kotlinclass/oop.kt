package com.glunda.kotlinclass

//oop = object-oriented-programing

fun main(){

    var myhouse = house("KotumBari",112,"Blue",120.55)
println("My house $myhouse")


}

class house(house:String,no:Int,color:String,price:Double){

    init {
        println(house)
        println(no)
        println(color)
        println(price)
    }

}