@file:Suppress("UNUSED_PARAMETER", "UNUSED_VARIABLE", "unused", "UNUSED_ANONYMOUS_PARAMETER")

package com.mechanitis.demo.boilerplate.example6

//val request = RequestKotlin
//val response = ResponseKotlin

    fun main(args: Array<String>) {
        get("/home") { request, response -> /*do something */ }
    }

    fun get(path: String, handler: (RequestKotlin, ResponseKotlin) -> Unit) {
//        handler(request, response)
    }

class RequestKotlin
class ResponseKotlin


