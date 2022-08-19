import java.util.HashSet;
import java.util.Set;

public class RepeatingNumber {
    //Find first repeating number
    public static void main(String[] args) {
       // int[] input = {2, 5, 1, 2, 3, 5, 1, 2, 4};//must return 2
        int[] input = {2, 3,4,5,2};//must return undefined

        System.out.println(findFirstRepeatingNumber(input));

    }

    private static String findFirstRepeatingNumber(int[] input) {
        Set<Integer> nums = new HashSet<>();
        for (int j : input) {
            if (nums.contains(j)) {
                return String.valueOf(j);
            } else {
                nums.add(j);
            }
        }return "undefined";
    }
}
