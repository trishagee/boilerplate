package com.mechanitis.demo.boilerplate.example4;

@SuppressWarnings("SameParameterValue")
public class Repetition {
    void printMessage(String message) {
        printMessage(message, "", "");
    }
    //look - so easy to accidentally switch the params!!
    void printMessage(String message, String prefix) {
        printMessage(prefix, message, "");
    }
    void printMessage(String message, String prefix, String suffix) {
        System.out.format("%s %s %s", message, prefix, suffix);
    }
}
