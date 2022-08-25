package com.buycoinsellcoin;

import java.util.Arrays;
import java.util.stream.IntStream;

public class TwoSum {
    public static void main(String[] args) {
        int[] nums = new int[]{3, 6, 3};
        int target = 6;
        System.out.println(twoSum(nums, target));
    }

    public static String twoSum(int[] nums, int target) {
        //I   if (nums.length == 2) return new int[]{0, 1};
        int[] numsCopy = Arrays.copyOf(nums, nums.length);
        Arrays.sort(numsCopy);
        int i = 0;
        int j = nums.length - 1;
        while (i < j) {
            if (numsCopy[i] + numsCopy[j] == target)
                return "djjd" + positionFirst(numsCopy[i], nums) + "," + positionLast(numsCopy[j], nums);
            if (numsCopy[i] + numsCopy[j] > target) j--;
            if (numsCopy[i] + numsCopy[j] < target) i++;

        }

        return null;
    }

    private static int positionFirst(int x, int[] nums) {
        return IntStream.range(0, nums.length).filter(k -> nums[k] == x).findFirst().orElse(999);
    }

    private static int positionLast(int x, int[] nums) {
        return IntStream.range(nums.length, 0).filter(k -> nums[k] == x).findFirst().orElse(999);
    }
}



