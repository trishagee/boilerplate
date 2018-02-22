package com.mechanitis.demo.boilerplate.example8

import com.mechanitis.demo.boilerplate.example3.CustomerKotlin

// first
// type aliases show intent.
typealias CustomerName = String
data class Customer(val name: CustomerName, val email: String)

// second
data class AwesomeCustomer(val name: CustomerName, val email: String)

@Deprecated("Customer is now called AwesomeCustomer")
//typealias Customer = AwesomeCustomer

// should be marked as deprecated
val customer = Customer("Joe Smith", "joe@gmail.com")


class Example3 {
    // third
    fun third() {
        val mary = CustomerKotlin(1, "Mary Smith", "Mary.Smith@somewhere.com")
//        val (id, name, email) = CustomerKotlin(1, "Mary Smith", "Mary.Smith@somewhere.com")
//        val (_, _, contact_email) = CustomerKotlin(1, "Mary Smith", "Mary.Smith@somewhere.com")
    }
}