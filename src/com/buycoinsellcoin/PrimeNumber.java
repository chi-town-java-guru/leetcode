package com.buycoinsellcoin;

import static java.util.stream.IntStream.iterate;

public class PrimeNumber {

    public static void main(String[] args) {
        int input = 14;
        System.out.println(input + " is a Prime Number: " + primeNumber(input));

    }

    private static boolean primeNumber(int input) {
        return iterate(2, i -> i <= Math.sqrt(input) && input % i == 0, i -> i + 1).noneMatch(i -> true);
    }
}
