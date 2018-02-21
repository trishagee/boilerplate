package com.mechanitis.demo.boilerplate.example9

import com.mechanitis.demo.boilerplate.example9.BigDecimalExample.calculatePercentage
import java.math.BigDecimal

val float = 100F
val number = 100.BD

val Int.BD: BigDecimal
    get() {
        return BigDecimal(this)
    }

//val Int.BD: BigDecimal inline get() = BigDecimal(this)
//val Int.BD: BigDecimal get() = BigDecimal(this)

fun doSomething2 () {
    calculatePercentage(34560.BD, 100.BD)
}

