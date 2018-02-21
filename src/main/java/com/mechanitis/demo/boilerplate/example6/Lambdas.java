package com.mechanitis.demo.boilerplate.example6;

public class Lambdas {
    //I don't think this is right

    @FunctionalInterface
    public interface RouteHandlerJava {
        void handle(RequestJava request, ResponseJava responseJava);
    }

    private static void get(final String path, final RouteHandlerJava handler) {
        final RequestJava request = null;
        final ResponseJava response = null;
        handler.handle(request, response);
    }
    public static void main(String[] args) {
        get("/home", (request, response) -> {/*do something */} );
    }




    private static class RequestJava {
    }

    private static class ResponseJava {
    }
}
