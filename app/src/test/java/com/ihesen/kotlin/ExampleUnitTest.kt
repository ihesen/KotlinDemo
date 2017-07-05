package com.ihesen.kotlin

import org.junit.Test

/**
 * Example local unit test, which will execute on the development machine (host).

 * @see [Testing documentation](http://d.android.com/tools/testing)
 */
class ExampleUnitTest {

    @Test
    fun method(){
        val a: Int = 10000
        println(a === a)                  // 输出“true”
        val boxedA: Int? = a
        val anotherBoxedA: Int? = a
        println("boxedA = $boxedA                   boxedA type: ${boxedA is Int}")
        println("anotherBoxedA = $anotherBoxedA     anotherBoxedA type: ${anotherBoxedA is Int}")
        println(boxedA === anotherBoxedA) // ！！！输出“false”！！！
    }

    /*@Test
    fun method1() {
        val a : Int = 10
        val b : Long = 10
        val c : Int = 20
        val d : String = "abc"
        val e : String = "abcd"
        val f : String = d

        val ooA : Operator = Operator("zhang", 10)
        val ooB : Operator = Operator("li", 20)
        val ooC : Operator = Operator("zhang", 10)
        val ooD : Operator = ooA
        // ==
        println("-------- == -------- ")
        println("a == c: ${a==c}")
        println("ooA == ooC: ${ooA==ooC}")
        println("ooA == ooD: ${ooA==ooD}")
        println("d == e: ${d==e}")
        println("f == d: ${f==d}")

        // equals
        println("-------- equals -------- ")
        println("ooA.equals(ooC): ${ooA.equals(ooC)}")
        println("d.equals(e): ${d.equals(e)}")

        // ===
        println("-------- === -------- ")
        println("a === c: ${a===c}")
        println("ooA === ooC: ${ooA===ooC}")
        println("ooA === ooD: ${ooA===ooD}")
        println("d === e: ${d===e}")
    }

    data class Operator(var name: String, var age: Int) {

        override fun equals(other: Any?): Boolean {
            if (other is Operator) {
                return this.age == other.age
            }
            return false
        }
    }*/
}