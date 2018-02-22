package com.mechanitis.demo.boilerplate;

import org.junit.jupiter.api.Test;

import java.util.HashMap;

public class Java10Test {
    @Test
    void whatDoesVarLookLike() {
        var customers = new HashMap<Integer, String>();

        customers.put(1, "Sam");

        String value = customers.get(1);

    }
}
