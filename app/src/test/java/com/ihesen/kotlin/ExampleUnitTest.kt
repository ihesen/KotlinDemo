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

    @Test
    fun method2(){
        //申明一个长度为5的数组
        val array = Array(5, {ia -> (ia * ia).toString()})

        //for循环
        for(item in array){
            println("for 循环打印值： item = $item")
        }

        //for循环根据索引打印
        for(i in array.indices){
            println("for 循环索引打印值： item[$i] = " + array[i])
        }

        //for信息 库函数 withIndex 打印
        for((index , value) in array.withIndex()){
            println("for withIndex method println index = $index  and value = $value")
        }

        // @可以跳转到指定标签位置
        for(i in 1..10){
            loop@ for(j in 1..10){
                if(i == j){
                    break@loop
                }else{
                    println("for current i = $i  j = $j")
                }
            }
        }

        // if 表达是 可以直接复制
        val a : Int = 5;
        val b : Int = 6;
        val c = if(a > b){
            println("a = $a  b = $b  a > b")
            a
        }else{
            println("a = $a  b = $b  a < b")
            b
        }
        println("c = $c")

        //if三目运算
        val d = if(a>b) a else b;
        println("d = $d")

        //when语句
        var x : Int? = 8;
        val y = when(x){
            1,5 ->{
                println("when x = $x")
            }
            6 ->{
                println("when x = $x")
//                77 这样执行到这里 y的值就为77了
            }
            else ->{
                println("when else")
//                false 执行到这里就 y的值就为false了
            }
        }
        println("when y = $y")

        //when语句判断是否在区间范围内
        x = 11;
        when(x){
            in 1..10 ->{
                println("x = $x 在区间 1..10内")
            }
            !in 11..20 ->{
                println("x = $x 不在区间 11..9内")
            }
            else ->{
                println("x = $x")
            }
        }

        //创建对象试一试
        val person = Person("ihesen", 27);
        println("person toString = " + person.toString())


        //慎用 !!操作符
        val str : String? = null;
        println(str!!.length)
    }
}