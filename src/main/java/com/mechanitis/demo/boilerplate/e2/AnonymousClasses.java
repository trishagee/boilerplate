package com.mechanitis.demo.boilerplate.e2;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

@SuppressWarnings("ALL")
public class AnonymousClasses {


    public static void main(String[] args) {
        AbstractButton button = new JButton("Push Me!");

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(final ActionEvent event) {
                System.out.println("I was pushed, I didn't fall!");
            }
        });


    }
}
