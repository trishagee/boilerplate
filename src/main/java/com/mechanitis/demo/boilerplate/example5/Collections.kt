@file:Suppress("unused", "UNUSED_VARIABLE")

package com.mechanitis.demo.boilerplate.example5

import com.mechanitis.demo.boilerplate.example3.CustomerKotlin


fun main(args: Array<String>) {

    val numbers = 1..100

    val customers = listOf(
            CustomerKotlin(1, "Sam", "Sparks", "email"),
            CustomerKotlin(2, "Pat", "Parks", "email"))

//    val emails = customers
//                    .filter { customer -> customer.name.startsWith("A") }
//                    .map { customer -> customer.email }


    val emails = customers.asSequence()
                    .filter { it.name.startsWith("A") }
                    .map { it.email }
                    .toList()
}
