package Assessment_2;

import java.util.Scanner;

/**
 * Find the number of occurrences of given word in a sentence.
 */
public class question1 {
    public static int check(String sentence, String word) {
        String[] sen = sentence.split(" ");
        int count = 0;
        for (String s : sen) {
            if (word.equals(s)) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence:");
        String sen = sc.nextLine();
        System.out.println("Enter a word for search:");
        String word = sc.next();
        int count = check(sen, word);
        System.out.println("The word " + word + " occurred " + count + " times in the sentence");
    }
}
