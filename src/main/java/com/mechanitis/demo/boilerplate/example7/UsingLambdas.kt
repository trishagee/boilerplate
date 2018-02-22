package com.mechanitis.demo.boilerplate.example7

import com.mechanitis.demo.boilerplate.example3.CustomerKotlin
import com.mechanitis.demo.boilerplate.example7.UsingLambdas.View

val customers = listOf(
        CustomerKotlin(1, "Sam", "Sparks"),
        CustomerKotlin(2, "Pat", "Parks"))


fun usingLambdas() {
    val view = View()
    view.setOnClickListener { println("Not using!") }

    val result1 = higherOrder({ x, y -> x + y }) // no parens needed around the params
    val result2 = higherOrder({ x, _ -> x + 10 })// coming in Java... 11?

    customers.forEach { println(it) }
}

fun higherOrder(function: (Int, Int) -> Unit) {
    TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
}

