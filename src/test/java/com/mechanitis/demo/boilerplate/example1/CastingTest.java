package com.mechanitis.demo.boilerplate.example1;

import com.mechanitis.demo.boilerplate.example1.Casting.View;
import org.junit.jupiter.api.Test;

import static com.mechanitis.demo.boilerplate.example1.CastingKt.createSegment;

class CastingTest {
    @Test
    void whatHappensIfObjectIsNull() {
        View view = new View();
        Casting.createSegment(view);
        createSegment(view);
    }
}