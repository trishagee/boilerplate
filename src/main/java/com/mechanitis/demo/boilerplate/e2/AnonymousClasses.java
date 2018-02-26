package com.mechanitis.demo.boilerplate.e2;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

@SuppressWarnings("ALL")
public class AnonymousClasses {


    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3);

        list.forEach(new Consumer<Integer>() {
            @Override
            public void accept(final Integer integer) {
                System.out.println(integer);
            }
        });


    }
}
