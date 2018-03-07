package com.mechanitis.demo.boilerplate.example3;

import com.mechanitis.demo.boilerplate.example3.NullHandling.CustomerJava;
import com.mechanitis.demo.boilerplate.example3.NullHandling.CustomerOptional;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

class NullHandlingTest {
    @Test
    void shouldNotErrorWithNullProperties() {
        CustomerOptional customer = new CustomerOptional(null, null);
        NullHandling nullHandling = new NullHandling();
        nullHandling.validateCustomer(Optional.of(customer));
    }

    @Test
    void shouldNotErrorWithNullValue() {
        NullHandling nullHandling = new NullHandling();
        nullHandling.validateCustomer(Optional.empty());
    }

    @Test
    void shouldErrorWithCustomerBeginningWithA() {
        CustomerOptional customer = new CustomerOptional("A customer", "A surname");
        NullHandling nullHandling = new NullHandling();

        Assertions.assertThrows(SecurityException.class, () ->
                nullHandling.validateCustomer(Optional.of(customer)));
    }
}