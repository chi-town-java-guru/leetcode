package com.buycoinsellcoin;

import java.util.HashSet;
import java.util.Set;

public class RepeatingNumber {
    //Find first repeating number
    public static void main(String[] args) {
        int[] input = {7, 15, 19, 2, 3, 5, 1, 2, 4};//must return 2
        //int[] input = {2, 3, 4, 5, 23};//must return undefined

        System.out.println(findFirstRepeatingNumber(input));

    }

    private static int findFirstRepeatingNumber(int[] input) {

        Set<Integer> nums = new HashSet<>();
        for (int j : input) {
            if (nums.contains(j)) {
                return j;
            }
            nums.add(j);
        }
        return -1;
    }
}
