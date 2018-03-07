package com.mechanitis.demo.boilerplate.example3;

import java.util.Optional;

@SuppressWarnings({"unused", "SameParameterValue", "WeakerAccess"})
public class NullHandling {

    void validateCustomer(CustomerJava customer) {
        if (customer != null) {
            if (customer.getName() != null) {
                if (customer.getName().startsWith("A")) {
                    throw new SecurityException("Names are not allowed to begin with A");
                }
            }
        }
    }

    void validateCustomer(Optional<CustomerOptional> customer) {
        customer.flatMap(CustomerOptional::getName)
                .filter(name -> name.startsWith("A"))
                .ifPresent(s -> throwSecurityException("Names are not allowed to begin with A"));
    }

    private void throwSecurityException(String message) {
        throw new SecurityException(message);
    }

    public static class CustomerJava {
        private final String firstName;
        private final String surname;
        private final String email = null;

        public CustomerJava(final int id, final String firstName, final String surname) {
            this.firstName = firstName;
            this.surname = surname;
        }

        public String getName() {
            return String.format("%s %s", firstName, surname);
        }

        public String getEmail() {
            return email;
        }
    }

    public static class CustomerOptional {
        private String firstName;
        private String surname;
        private String email;

        public CustomerOptional(final String firstName, final String surname) {
            this.firstName = firstName;
            this.surname = surname;
        }

        public Optional<String> getName() {
            return Optional.ofNullable(firstName);
        }

        public Optional<String> getEmail() {
            return Optional.ofNullable(email);
        }
    }
}
