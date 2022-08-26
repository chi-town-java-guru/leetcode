package com.buycoinsellcoin;

import static java.util.stream.IntStream.iterate;

public class PrimeNumber {

    public static void main(String[] args) {
        // int input = 13;
        iterate(2, i -> i < 100, i -> i + 1)
                .filter(PrimeNumber::primeNumber)
                .forEach(i -> System.out.println(i + " is a Prime Number: " + primeNumber(i)));

    }

    private static boolean primeNumber(int input) {
        return iterate(2, i -> i <= Math.sqrt(input), i -> i + 1)
                .noneMatch(i -> input % i == 0);
    }
}
