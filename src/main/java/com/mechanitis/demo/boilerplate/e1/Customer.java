package com.mechanitis.demo.boilerplate.e1;

@SuppressWarnings({"RedundantExplicitVariableType", "unused"})
public class Customer {
    private final String name;
    private final int id;
    private final String email;

    private Customer(final String name, final int id, final String email) {
        this.name = name;
        this.id = id;
        this.email = email;
    }

    private String getName() {
        return name;
    }

    private int getId() {
        return id;
    }

    private String getEmail() {
        return email;
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        final Customer customer = (Customer) o;
        if (id != customer.id) {
            return false;
        }
        if (!name.equals(customer.name)) {
            return false;
        }
        return email.equals(customer.email);
    }

    @Override
    public int hashCode() {
        int result = name.hashCode();
        result = 31 * result + id;
        result = 31 * result + email.hashCode();
        return result;
    }
}
