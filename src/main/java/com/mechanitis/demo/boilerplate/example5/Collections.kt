@file:Suppress("unused")

package com.mechanitis.demo.boilerplate.example5

import com.mechanitis.demo.boilerplate.example3.CustomerKotlin


val numbers = 1..100

val customers = listOf(
        CustomerKotlin(1, "Sam", "Sparks", "email"),
        CustomerKotlin(2, "Pat", "Parks", "email"))


val emails = customers
        .filter({ customer -> customer.name.startsWith("A") })
        .map({ customer -> customer.email })

fun main(args: Array<String>) {
    println(emails)
}
