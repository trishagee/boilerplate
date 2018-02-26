package com.mechanitis.demo.boilerplate.example5;

import com.mechanitis.demo.boilerplate.example3.NullHandling.CustomerJava;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static java.util.Arrays.asList;
import static java.util.Collections.unmodifiableList;
import static java.util.List.of;
import static java.util.stream.IntStream.range;

@SuppressWarnings({"unused", "RedundantExplicitVariableType", "Java9CollectionFactory"})
public class Collections {
    public static void main(String[] args) {

        var numbers = range(1, 100);


        List<CustomerJava> customers1 = Arrays.asList(
                new CustomerJava(1, "Sam", "Sparks"),
                new CustomerJava(2, "Pat", "Parks"));

        List<CustomerJava> customers2 = unmodifiableList(asList(
                new CustomerJava(1, "Sam", "Sparks"),
                new CustomerJava(2, "Pat", "Parks")));

        List<CustomerJava> customers3 = List.of(
                new CustomerJava(1, "Sam", "Sparks"),
                new CustomerJava(2, "Pat", "Parks"));

        var customers4 = of(
                new CustomerJava(1, "Sam", "Sparks"),
                new CustomerJava(2, "Pat", "Parks"));

        //TODO streams

        List<String> emails = customers4.stream()
                              .filter(customer -> customer.getName().startsWith("A"))
                              .map(CustomerJava::getEmail)
                              .collect(Collectors.toList());

    }
}
