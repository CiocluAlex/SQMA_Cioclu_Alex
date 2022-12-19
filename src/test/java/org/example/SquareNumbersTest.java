package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SquareNumbersTest {

    @Test
    void generateSquareNumbers() {
        SquareNumbers sn = new SquareNumbers();
        assertEquals(4, sn.generateSquareNumbers(2));
    }
}