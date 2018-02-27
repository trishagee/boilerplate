@file:Suppress("unused")

package com.mechanitis.demo.boilerplate.example5

import com.mechanitis.demo.boilerplate.example3.CustomerKotlin


val numbers = 1..100

val customers = listOf(
        CustomerKotlin(1, "Sam", "Sparks", "email"),
        CustomerKotlin(2, "Pat", "Parks", "email"))


//val emails = customers
//        .filter { it.name.startsWith("A") }
//        .map { it.email }

    val email = customers.asSequence()
            .filter { it.name.startsWith("S") }
            .map { it.email }
            .toList()

fun main(args: Array<String>) {
    println(email)
}
