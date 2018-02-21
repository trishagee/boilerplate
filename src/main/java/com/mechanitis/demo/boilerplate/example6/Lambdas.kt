package com.mechanitis.demo.boilerplate.example6

fun get(path: String, handler: (RequestKotlin, ResponseKotlin) -> Unit) {
}

class RequestKotlin{}
class ResponseKotlin{}


fun main() {
    get("/home") {request, response -> null}
}
