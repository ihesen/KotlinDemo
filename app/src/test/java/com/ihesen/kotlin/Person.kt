package com.ihesen.kotlin

/**
 * Created by apple on 2017/7/5.
 */
class Person constructor(name : String, age : Int){

    var name = name
    var age = age

    init {
        println("create Person class to Konlin excute init() method!!")
    }

    override fun toString(): String {
        return "name = $name  age = $age"
    }
}