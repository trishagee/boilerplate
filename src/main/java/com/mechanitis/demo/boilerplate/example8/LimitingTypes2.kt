package com.mechanitis.demo.boilerplate.example8

sealed class Response2 { //that's why this needs to be sealed so that not anyone overrides it
    class Success(val message: String): Response2()
    class Failure(val error: Int): Response2()
}

//ahhh, and this is showing there's no need for casting here, all of them are of type Response
fun getPage2(url: String): Response2 {
    return when (url) {
        "" -> Response2.Failure(404)
        "/" -> Response2.Success("Index.html")
        else -> Response2.Failure(500)
    }
}
