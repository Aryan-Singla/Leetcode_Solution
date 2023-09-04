package Sorting;

import java.util.Arrays;

public class Leetcode_169 {
    public static void main(String[] args) {
        int[] nums = {3, 2, 3};
        Arrays.sort(nums);
        int n = nums.length;
        System.out.println(nums[n/2]);
    }
}