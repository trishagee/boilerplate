package com.mechanitis.demo.boilerplate.example5;

import com.mechanitis.demo.boilerplate.example3.NullHandling.CustomerJava;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class Collections {
    public static void main(String[] args) {
        IntStream numbers = IntStream.range(1, 100);


        List<CustomerJava> customers = Arrays.<CustomerJava>asList(
                new CustomerJava(1, "Sam", "Sparks"),
                new CustomerJava(2, "Pat", "Parks"));
    }
}
