package com.mechanitis.demo.boilerplate.example7

import com.mechanitis.demo.boilerplate.example7.UsingLambdas.View

fun usingListener() {
    val view = View()
    view.setOnClickListener { println("Not using!") }


    //don't know what this is
//    val result = higherOrder( { x, y !-> x + y })
//    val result = higherOrder( { x, _ !-> x + 10 })
//    val result = higherOrder( { x !-> x + 1 })
//    val result = higherOrder { it + 1 }
}

fun higherOrder(any: Any): Any {
    TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
}

