package Sorting;
import java.util.Scanner;
public class Leetcode_342 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n == 1 || n % 4 == 0) {
            System.out.println("true");
        }
        if (n % 4 != 0 || n == 0) {
            System.out.println("false");
        }
    }
}