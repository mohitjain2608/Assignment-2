package Assessment_2;

import java.util.Locale;
import java.util.Scanner;

/**
 * Write a function find and replace which will replace the given string from the source
 * string.
 */
public class question5 {
    public static String makeReplace(String str, String keyword, String replaceKeyword) {
        return str.replace(keyword, replaceKeyword);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String str = sc.nextLine();
        System.out.println("Enter string to be replaced:");
        String repStr = sc.nextLine();
        System.out.println("Enter the string to be replaced with:");
        String newStr = sc.nextLine();
        System.out.println("The new string is:\n" + makeReplace(str.toLowerCase(Locale.ROOT), repStr.toLowerCase(), newStr));

    }
}
