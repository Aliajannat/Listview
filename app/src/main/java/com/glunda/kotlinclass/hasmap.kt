package com.glunda.kotlinclass


fun main(){

    var map = HashMap<Int,String>()
    map.put(12,"Dhaka")
    map.put(10,"Glunda shop & tech")
    println(map.get(12))
    println("My channel: ${map.get(10)}")

}