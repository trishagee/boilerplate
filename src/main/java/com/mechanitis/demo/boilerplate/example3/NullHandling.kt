package com.mechanitis.demo.boilerplate.example3

import com.mechanitis.demo.boilerplate.example3.NullHandling.CustomerJava

@Suppress("unused")
fun validateCustomerNullSafe(customer: CustomerKotlin) {
    if (customer.name.startsWith("A")) {
        throw Exception("Names are not allowed to start with A")
    }
}

@Suppress("unused")
// TODO this needs a test for the equality operator.  == or ===?
fun validateCustomerWithNulls(customer: CustomerJava?) {
    if (customer?.name?.startsWith("A") == true) {
        throw Exception("Names are not allowed to start with A")
    }
}

class CustomerKotlin(val id: Int, var name: String, val surname: String, var email: String) {

}
