package com.mechanitis.demo.boilerplate.example7;


import java.util.function.Consumer;

public class UsingLambdas {
    public static void main(String[] args) {
        View view = new View();
        view.setOnClickListener(view1 -> System.out.println("Not using!"));
        //Java...
//        view.setOnClickListener(_ -> System.out.println("Not using!"));
    }

    static class View {
        void setOnClickListener(final Consumer<String> listener) {
            //do something
        }
    }
}
