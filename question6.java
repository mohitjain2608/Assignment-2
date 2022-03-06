package Assessment_2;

import java.util.Scanner;

/**
 * Write a function findPrime which will accept range of values from user and return int
 * array from function and print all numbers from it
 */
public class question6 {

    public static void findPrime(int startRange, int endRange) {
        int count = 0;
        System.out.println("The prime numbers between " + startRange + " and " + endRange + " are:");
        for (int i = startRange; i <= endRange; i++) {
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    count = 0;
                    break;
                } else {
                    count = 1;
                }
            }
            if (count == 1) {
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the start range");
        int start = sc.nextInt();
        System.out.println("Enter the end range");
        int end = sc.nextInt();
        findPrime(start, end);
    }

}
