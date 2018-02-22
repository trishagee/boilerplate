package com.mechanitis.demo.boilerplate.example9;

public class ExtendingTypes {
    public static void main(String[] args) {
        String value = "hello how are you";

        //can't do this
//        value.toTitleCase();

        //have to do this
        String value2 = "hello how are you";
        StringUtils.toTitleCase(value2);
    }
}


class StringUtils {
    public static String toTitleCase(String value) {
        //do something
        return null;
    }
}