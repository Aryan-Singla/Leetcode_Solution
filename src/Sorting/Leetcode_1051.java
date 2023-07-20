package Sorting;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Leetcode_1051 {
    public static void main(String[] args) {
        int[] arr = {1, 1, 4, 2, 1, 3};
        int[] ans = arr.clone();
        Arrays.sort(arr);
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != ans[i]) {
                count++;
            }
        }
        System.out.println(count);
    }
}