package com.mechanitis.demo.boilerplate.example3;

@SuppressWarnings("unused")
public class NullHandling {

    public void validateCustomer(CustomerJava customer) throws SecurityException {
        if (customer != null) {
            if (customer.getName() != null) {
                if (customer.getName().startsWith("A")) {
                    throw new SecurityException("Names are not allowed to begin with A");
                }
            }
        }
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
}
