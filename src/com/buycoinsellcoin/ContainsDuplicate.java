package com.buycoinsellcoin;

import java.util.HashSet;
import java.util.Set;

/**
 * Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.
 * <p>
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input: nums = [1,2,3,1]
 * <p>
 * Output: true
 * <p>
 * Explanation:
 * <p>
 * The element 1 occurs at the indices 0 and 3.
 * <p>
 * Example 2:
 * <p>
 * Input: nums = [1,2,3,4]
 * <p>
 * Output: false
 * <p>
 * Explanation:
 * <p>
 * All elements are distinct.
 * <p>
 * Example 3:
 * <p>
 * Input: nums = [1,1,1,3,3,4,3,2,4,2]
 * <p>
 * Output: true
 * <p>
 * <p>
 * <p>
 * Constraints:
 * <p>
 * 1 <= nums.length <= 105
 * -109 <= nums[i] <= 109
 *
 *
 */

public class ContainsDuplicate {
    //Find first repeating number
    public static void main(String[] args) {
        int[] nums = {7, 6,8};

        System.out.println(containsDuplicate(nums));

    }

    private static boolean containsDuplicate(int[] nums) {
        Set<Integer> setOfNums = new HashSet<>();
        for (int i : nums) {
            if (setOfNums.contains(i)) return true;
            else {
                setOfNums.add(i);
            }
        }
        return false;
    }
}
