@file:Suppress("UNUSED_PARAMETER", "UNUSED_VARIABLE", "unused", "UNUSED_ANONYMOUS_PARAMETER")

package com.mechanitis.demo.boilerplate.example6

fun get(path: String, handler: (RequestKotlin, ResponseKotlin) -> Unit) {
    val request = null
    val response = null
//    handler.invoke(request, response)

}

class RequestKotlin{}
class ResponseKotlin{}


fun main() {
    get("/home") { request, response -> /*do something */ }
}
