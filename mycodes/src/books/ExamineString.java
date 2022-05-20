package books;

import java.util.Scanner;

/**
 * @author 松哥
 */
public class ExamineString {
    public static void main(String[] args) {
        System.out.println("Please input a string:");
        Scanner input = new Scanner(System.in);
        String s1 = input.nextLine();
        String s2 = input.nextLine();
        if (!s1.contains(s2)) {
            System.out.println("The string " + s2 + " is not in " + s1);
        }
        else {
            System.out.println("The string " + s2 + " is in " + s1);
        }
    }
}
