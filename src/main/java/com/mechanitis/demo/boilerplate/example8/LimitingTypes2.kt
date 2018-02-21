package com.mechanitis.demo.boilerplate.example8

sealed class Response2 {
    class Success(val message: String): Response2()
    class Failure(val error: Int): Response2()
}
fun getPage2(url: String): Response2 {
    return when (url) {
        "" -> Response2.Failure(404)
        "/" -> Response2.Success("Index.html")
        else -> Response2.Failure(500)
    }
}
