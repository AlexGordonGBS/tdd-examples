package org.example;

public class PrimeUtility {

    public boolean isPrime (int number) {

        for (int ii=2; ii < number/2+1; ii++) {
            int rem = number % ii;
            if (rem == 0) {
                return false;
            } else {
                continue;
            }
        }
    return true;
    }

}
