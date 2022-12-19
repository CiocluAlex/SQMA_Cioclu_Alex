package org.example;

import static org.junit.jupiter.api.Assertions.*;

class PrimeNumbersTest {

    @org.junit.jupiter.api.Test
    void checkForPrime() {
        PrimeNumbers pn = new PrimeNumbers();
        assertEquals(true, pn.checkForPrime(7));
    }
}