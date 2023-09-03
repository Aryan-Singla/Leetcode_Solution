package Sorting;

import java.util.Arrays;

public class Leetcode_977 {
    public static void main(String[] args) {
        int[] arr = {-4,-1,0,3,10};
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] * arr[i];
        }
        for (int i = 0; i < arr.length; i++) {
            Arrays.sort(arr);
            System.out.println(arr[i]);
        }
    }
}
