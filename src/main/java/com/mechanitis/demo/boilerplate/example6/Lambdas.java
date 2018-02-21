package com.mechanitis.demo.boilerplate.example6;

public class Lambdas {
    //I don't think this is right

    public interface RouteHandlerJava {
        void handle(RequestJava request, ResponseJava responseJava);
    }
    private static void get(String path, RouteHandlerJava handler) {
        //do something
    }
    public static void main(String[] args) {
        get("/home", (request, response) -> {/*do something */} );
    }




    private static class RequestJava {
    }

    private static class ResponseJava {
    }
}
