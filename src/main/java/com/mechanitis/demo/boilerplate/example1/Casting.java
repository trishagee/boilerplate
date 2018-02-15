package com.mechanitis.demo.boilerplate.example1;


import org.jetbrains.annotations.NotNull;

@SuppressWarnings("unused")
class Casting {


    static void createSegment(Object obj) {
        if (obj instanceof View) {
            ((View) obj).initialise();
        }
    }


    static class View {
        void initialise() {
        }
    }
}
