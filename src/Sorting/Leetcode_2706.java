package Sorting;

import java.util.Arrays;

public class Leetcode_2706 {
    public static void main(String[] args) {
        int[] prices = {98, 54, 6, 34, 66, 63, 52, 39};
        int money = 62;
        Arrays.sort(prices);
        int val = prices[0] + prices[1];
        if (val <= money) {
            System.out.println(money - val);
        } else {
            System.out.println(money);
        }
    }
}