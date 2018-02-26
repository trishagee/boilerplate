package com.mechanitis.demo.boilerplate.e2

import javax.swing.JButton


fun main() {
    val button = JButton("Push Me!")

    button.addActionListener { println("I was pushed, I didn't fall!") }

}
