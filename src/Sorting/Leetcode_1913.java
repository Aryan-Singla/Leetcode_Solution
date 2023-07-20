package Sorting;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Leetcode_1913 {
    public static void main(String[] args) {
        int[] arr = {5,6,2,7,4};
        int max = 0;
//        int min = ;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i] * arr[j] > max){
                    max = arr[i] * arr[j];
                }
            }
        }
        Arrays.sort(arr);
        System.out.println(max - (arr[0] * arr[1]));
    }
}
