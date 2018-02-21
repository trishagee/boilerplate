package com.mechanitis.demo.boilerplate.example5;

import com.mechanitis.demo.boilerplate.example3.NullHandling.CustomerJava;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

import static java.util.Collections.unmodifiableList;

public class Collections {
    public static void main(String[] args) {
        IntStream numbers = IntStream.range(1, 100);


        List<CustomerJava> customers = Arrays.<CustomerJava>asList(
                new CustomerJava(1, "Sam", "Sparks"),
                new CustomerJava(2, "Pat", "Parks"));
//        List<CustomerJava> customers2 = unmodifiableList(Arrays.<CustomerJava>asList(
//                new CustomerJava(1, "Sam", "Sparks"),
//                new CustomerJava(2, "Pat", "Parks")));
//        List<CustomerJava> customers3 = List.of(
//                new CustomerJava(1, "Sam", "Sparks"),
//                new CustomerJava(2, "Pat", "Parks"));
    }
}
