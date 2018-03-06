@file:Suppress("UNUSED_VARIABLE", "unused")

package com.mechanitis.demo.boilerplate.example2

import com.mechanitis.demo.boilerplate.example2.Conditional.PortType

fun conditional(value: Any) {

    val actual = when (value) {
        1 -> {
            println("It was one")
            20
        }
        2 -> {
            println("It was two")
            30
        }
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
        else -> {
            0
        }
    }

}

class PortValidator {

    fun getPortType(port: Any): PortType {

        val type = when (port) {
            20 -> PortType.FTP
            80, 8080 -> PortType.HTTP
            27017 -> PortType.DATABASE
            in 20001..30000 -> PortType.SAFE
            in 9080..9092 -> PortType.BUSY
            !is Int -> throw RuntimeException("Not a valid port number")
            else -> PortType.UNKNOWN
        }

        return type
    }
}


