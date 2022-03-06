package Assessment_2;

import java.util.Scanner;

/**
 * Ezee Shop has an online portal where customers can check about different products.
 * Customers can search for products by giving a key word. Write a program that accepts
 * a product name and a key word, and checks if the key word is present in the given
 * product name.
 */
public class question2 {
    public static String[] initProductName() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of product to be entered:");
        int n = sc.nextInt();
        String[] product = new String[n];
        System.out.println("Enter " + n + " product names:");
        for (int i = 0; i < n; i++) {
            product[i] = sc.next().toLowerCase();
        }
        return product;
    }

    public static String isPresent(String[] productNames, String keyword) {
        for (String productName : productNames) {
            if (productName.contains(keyword)) {
                return productName;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] productNames = initProductName();
        System.out.println("Enter the keyword for the product name to be searched:");
        String keyword = sc.next();
        String res = isPresent(productNames, keyword);
        if (res != null)
            System.out.println("The product " + res + " is present in Ezee shop");
        else
            System.out.println("No the product is currently not present in Ezee shop");
    }
}
