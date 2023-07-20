package Sorting;

import java.util.Arrays;

public class Leetcode_1464 {
    public static void main(String[] args) {
        int[] arr = {3, 4, 5, 2};
        Arrays.sort(arr);
        int k = arr[2] - 1;
        int m = arr[3] - 1;
        System.out.println(k*m);
    }
}

