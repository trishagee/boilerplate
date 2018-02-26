package com.mechanitis.demo.boilerplate.example1


    fun createSegment(obj: Any) {
        (obj as View).initialise()
    }


class View {
    fun initialise() {}
}
