package Sorting;

import java.util.Scanner;

public class Leetcode_231 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n<1 || n%2!=0){
            System.out.println("False");
        }
        else {
            System.out.println("True");
        }
    }
}
