package Assessment_2;

import java.util.Scanner;

/**
 * Write a program to find the availability of given number in the list.
 */
public class question3 {

    public static int findPosition(int num, int[] nos) {

        for (int i = 0; i < nos.length; i++) {
            if (nos[i] == num) {
                return i + 1;
            }

        }
        return 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of array:");
        int n = sc.nextInt();
        int[] array = new int[n];
        System.out.println("Enter " + n + " numbers:");
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
        System.out.println("Enter number to be searched:");
        int ele = sc.nextInt();
        int pos = findPosition(ele, array);
        if (pos == 0)
            System.out.println("Element is not present in the list");
        else
            System.out.println("Element is found at position: " + pos);
    }
}
