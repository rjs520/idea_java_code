package Test;

import java.util.Scanner;

/**
 * 求俩个数的最大公约数，用的辗转相除法
 */

/**
 * @author rjs
 */
public class GreatestCommonDivisor {
    public static int mx(int a, int b) {
        int c = 0;
        while (a != 0) {
            c = b % a;
            b = a;
            a = c;
        }
        return b;
    }

    public static void main(String[] args) {
        System.out.println("Enter two numbers :");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int d = mx(a, b);
        System.out.println(d);
    }

}
