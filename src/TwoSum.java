/**
 * Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
 * <p>
 * You may assume that each input would have exactly one solution, and you may not use the same element twice.
 * <p>
 * You can return the answer in any order.
 * <p>
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input: nums = [2,7,11,15], target = 9
 * Output: [0,1]
 * Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
 * Example 2:
 * <p>
 * Input: nums = [3,2,4], target = 6
 * Output: [1,2]
 * Example 3:
 * <p>
 * Input: nums = [3,3], target = 6
 * Output: [0,1]
 * <p>
 * <p>
 * Constraints:
 * <p>
 * 2 <= nums.length <= 104
 * -109 <= nums[i] <= 109
 * -109 <= target <= 109
 * Only one valid answer exists.
 */

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
        return IntStream.range( nums.length,0).filter(k -> nums[k] == x).findFirst().orElse(999);
    }
}



