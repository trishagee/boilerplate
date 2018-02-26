package com.mechanitis.demo.boilerplate.example1;


//@SuppressWarnings("unused")
class Casting {

    void createSegment(Object obj) {
        if (obj instanceof View) {
            ((View) obj).initialise();
        }
    }

}
