package books;

import java.util.Scanner;

/**
 * @author 松哥
 */
public class LenghString {
    public static void main(String[] args) {
        System.out.println("Enter a string: ");
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        int len = str.length();
        str.charAt(0);
        System.out.println("The length of the string is " + len);
        System.out.println("The first character of the string is " + str.charAt(0));
    }
}