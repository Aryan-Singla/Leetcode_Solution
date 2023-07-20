package Sorting;

import java.util.Arrays;

public class Leetcode_442 {
    public static void main(String[] args) {
        int[] arr = {4,3,2,7,8,2,3,1};
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]){
                    System.out.println(arr[i]);
                }
            }
        }

    }
}
