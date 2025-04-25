package org.example;

import org.junit.jupiter.api.Test;

public class PrimeUtilityTest {
    PrimeUtility pu;

    @Test
    public void checkIfNotNull () {
        pu = new PrimeUtility();
        assert pu != null;
    }

    @Test
    public void checkIfNumberIsPrime () {
        pu = new PrimeUtility();
        boolean isPrime = pu.isPrime(7);
        assert isPrime;
    }

    @Test
    public void checkIfNumberIsNotPrime () {
        pu = new PrimeUtility();
        boolean isPrime = pu.isPrime(12);
        assert !isPrime;
    }


}
