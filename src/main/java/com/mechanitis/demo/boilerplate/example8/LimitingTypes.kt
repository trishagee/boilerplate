package com.mechanitis.demo.boilerplate.example8

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



