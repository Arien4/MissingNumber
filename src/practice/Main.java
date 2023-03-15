package practice;

// Given an array nums containing n distinct numbers in the range [0, n], return the only number in the range that is
// missing from the array.
// n == nums.length
// 1 <= n <= 104
// 0 <= nums[i] <= n
// All the numbers of nums are unique.

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        //int[] nums = {9,6,4,2,3,5,7,0,1};
        //int[] nums = {1};
        int[] nums = {0, 1};
        System.out.println(missingNumber(nums));
    }

    public static int missingNumber(int[] nums) {
        Arrays.sort(nums);
        if (nums[0] != 0) return 0;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] + 1 != nums[i + 1]) return nums[i] + 1;
        }
        return nums[nums.length - 1] + 1;
    }
}
