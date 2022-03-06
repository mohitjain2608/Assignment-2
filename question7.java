package Assessment_2;

import java.util.Scanner;

/**
 * 7. Write a function to find various combinations of entered string
 */
public class question7 {

    static void getCombinations(String s, String answer) {
        if (s.length() == 0) {
            System.out.println(answer + " ");
        }
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            String left_substr = s.substring(0, i);
            String right_substr = s.substring(i + 1);
            String rest = left_substr + right_substr;
            getCombinations(rest, answer + ch);
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String answer = "";
        System.out.print("Enter the string : ");
        String s = scan.next();
        System.out.println("All possible strings are : ");
        getCombinations(s, answer);
    }
}



