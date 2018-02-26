package com.mechanitis.demo.boilerplate.example6;

import java.util.function.BiConsumer;

@SuppressWarnings({"SameParameterValue", "unused"})
public class Lambdas {
    //<editor-fold desc="Fields">
    private final static RequestJava request = null;
    private final static ResponseJava response = null;
    //</editor-fold>

    public static void main(String[] args) {
        get("/home", (request, response) -> { /*do something */ } );
    }

    private static void get(String path, BiConsumer<RequestJava, ResponseJava> handler) {
        handler.accept(request, response);
    }


    private static class RequestJava {
    }

    private static class ResponseJava {
    }
}
