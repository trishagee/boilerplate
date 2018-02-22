package com.mechanitis.demo.boilerplate.example8

//so this is meant to be an example of something bad - this class has error and success things in
data class Response(val message: String, val errorCode: Int, val result: String)
fun getPage(url: String): Response {
    return when (url) {
        "" -> Response("Not found", 404, "")
//        "/" -> Response.Success("", 0, "Hello!")
        else -> {
            Response("Other", 999, "")
        }
    }
}



