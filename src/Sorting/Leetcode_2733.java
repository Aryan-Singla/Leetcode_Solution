package Sorting;

import java.util.Arrays;

public class Leetcode_2733 {
    public static void main(String[] args) {
        int[] arr = {3, 2};
        Arrays.sort(arr);
        int NMOM = 0;
        if (arr.length > 2) {
            NMOM  = arr[1];
        }
        else if (arr.length <= 2) {
            NMOM = -1;
        }
        System.out.println(NMOM);
    }
}