package com.mechanitis.demo.boilerplate.examples;

import com.mechanitis.demo.boilerplate.example8.Customer;

import java.util.HashMap;
import java.util.Map;

public class Generics {
    public static void main(String[] args) {
        //IntelliJ can hide the noise
        Map<Integer, Customer> customers = new HashMap<Integer, Customer>();

        //Java 7
        Map<Integer, Customer> customers2 = new HashMap<>();

    }
}
