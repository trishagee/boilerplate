package com.mechanitis.demo.boilerplate.example4;

@SuppressWarnings({"SameParameterValue", "unused", "WeakerAccess", "RedundantExplicitVariableType"})
public class Repetition {

    void printMessage(String message) {
        printMessage(message, "", "");
    }
    void printMessage(String message, String prefix) {
        printMessage(prefix, message, "");
    }
    void printMessage(String message, String prefix, String suffix) {
        System.out.printf("%s %s %s", prefix, message, suffix);
    }

    void printMessage(String... messages) {
        for (String message : messages) {
            System.out.printf("%s ", message);
        }
    }

}
