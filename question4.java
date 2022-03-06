package Assessment_2;

import java.util.Scanner;

/**
 * Write a program that will reverse the sequence of letters in each word of a chosen
 * paragraph . For instance, " To be or not to be " Would become " oT eb ro ton ot eb"
 */
public class question4 {

    public static String makeReverse(String str) {
        String[] strArray = str.split(" ");
        StringBuilder recArray = new StringBuilder();
        for (String s : strArray) {
            char[] ch = s.toCharArray();
            StringBuilder resCh = new StringBuilder();
            for (int j = ch.length - 1; j >= 0; j--) {
                resCh.append(ch[j]);
            }
            recArray.append(resCh).append(" ");
        }
        return recArray.toString().trim();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String str = sc.nextLine();
        System.out.println("The reversed string:\n" + makeReverse(str));
    }
}
