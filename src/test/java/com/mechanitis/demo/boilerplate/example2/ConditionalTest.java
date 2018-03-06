package com.mechanitis.demo.boilerplate.example2;

import com.mechanitis.demo.boilerplate.example2.Conditional.PortType;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ConditionalTest {
    @Test
    void testForHttpType() {
        PortValidator validator = new PortValidator();
        PortType portType = validator.getPortType(8080);
        Assertions.assertEquals(PortType.HTTP, portType);
    }

    @Test
    void testForUnknownType() {
        PortValidator validator = new PortValidator();
        PortType portType = validator.getPortType(12);
        Assertions.assertEquals(PortType.UNKNOWN, portType);
    }

    @Test
    void testForSafeType() {
        PortValidator validator = new PortValidator();
        PortType portType = validator.getPortType(20010);
        Assertions.assertEquals(PortType.SAFE, portType);
    }

    @Test
    void testForValidationFailure() {
        PortValidator validator = new PortValidator();
        Assertions.assertThrows(RuntimeException.class,
                                () -> validator.getPortType("Invalid"));
    }
}