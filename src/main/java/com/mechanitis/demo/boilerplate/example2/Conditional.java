package com.mechanitis.demo.boilerplate.example2;

public class Conditional {
    void conditional(final int value) {
        int actual;
        switch (value) {
            case 1:
                System.out.println("It was one");
                actual = 20;
                break;
            case 2:
                System.out.println("It was two");
                actual = 30;
                break;
            default:
                if (value >= 0 && value <= 100) {
                    actual = 40;
                    System.out.println("It was somewhere in between these numbers");
                } else {
                    actual = 0;
                }
        }
        System.out.format("Value is %d and Actual is %d", value, actual);

    }
}
