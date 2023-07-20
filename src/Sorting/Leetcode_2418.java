package Sorting;

import java.util.Arrays;
import java.util.Collections;

public class Leetcode_2418 {
    public static void main(String[] args) {
        String[] names = {"Mary", "John", "Emma"};
        int[] heights = {155, 185, 150};
        for (int i = 0; i < heights.length; i++) {
            for (int j = i+1; j < heights.length; j++) {
                if(heights[i] < heights[j]){
                    int temp = heights[i];
                    heights[i] = heights[j];
                    temp = heights[j];

                    String temp1 = names[i];
                    names[i] = names[j];
                    names[j] = temp1;
                }
            }
        }
        System.out.println(names);
    }
}