package com.mechanitis.demo.boilerplate.example1;

import org.junit.jupiter.api.Test;

import static com.mechanitis.demo.boilerplate.example1.CastingKt.createSegment;

class CastingTest {
    @Test
    void whatHappensIfObjectIsNull() {
        View view = null;
        Casting casting = new Casting();
        casting.createSegment(view);
        createSegment(view);
    }
}