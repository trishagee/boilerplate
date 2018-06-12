package com.mechanitis.demo.boilerplate.examples;

import com.mechanitis.demo.boilerplate.example8.Customer;

import java.util.HashMap;
import java.util.Map;

import static com.mechanitis.demo.boilerplate.examples.CustomerFactory.create;

@SuppressWarnings({"Convert2Diamond", "unused"})
public class Generics {
    public static void main(String[] args) {
        //IntelliJ can hide the noise

        Map<Integer, Customer> customers1 = new HashMap<Integer, Customer>();

        //Java 7

        Map<Integer, Customer> customers2 = new HashMap<>();

        //Java 10

        var customers3 = new HashMap<Integer, Customer>();


        var customers4 = new HashMap<>();


        var c = create("Sam");

        if (c != null) {

        }
    }

}
