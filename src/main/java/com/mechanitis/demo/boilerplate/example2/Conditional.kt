@file:Suppress("UNUSED_VARIABLE")

package com.mechanitis.demo.boilerplate.example2

fun conditional(value: Any) {
    val actual = when (value) {
        1 -> {
            println("It was one")
            20
        }
        2 -> {
            println("it was two")
            30
        }
//    these aren't available in Java (yet)
        3, 4, 5 -> {
            println("One of these")
            35
        }
        is Int -> {
            println("It's an Int")
            20
        }
        in 0..100 -> {
            println("It was somewhere in between these numbers")
            40
        }
    //default
        else -> {
            0
        }
    }
}

