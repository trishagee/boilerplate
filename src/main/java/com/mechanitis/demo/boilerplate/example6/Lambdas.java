package com.mechanitis.demo.boilerplate.example6;

import java.util.function.BiConsumer;

public class Lambdas {
    final static RequestJava request = null;
    final static ResponseJava response = null;
    //This is example is about declaration, creating a method that takes a lambda expression

    @FunctionalInterface
    public interface RouteHandlerJava {
        void handle(RequestJava request, ResponseJava responseJava);
    }

    private static void get(final String path, final RouteHandlerJava handler) {
        handler.handle(request, response);
    }

    //a better approach
//    private void get(String path, BiConsumer<RequestJava, ResponseJava> handler) {
//        handler.accept(request, response);
//    }

    public static void main(String[] args) {
        get("/home", (request, response) -> {/*do something */} );
    }




    private static class RequestJava {
    }

    private static class ResponseJava {
    }
}
