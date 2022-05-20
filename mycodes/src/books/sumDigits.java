package books;

import java.util.Scanner;

public class sumDigits {
    public static void main(String[] args) {
        System.out.println("输入一个整数:");
        Scanner sc = new Scanner(System.in);
        long m = sc.nextLong();
        sumDigits(m);
        long result = sumDigits(m);
        System.out.println("整数" + m + "各位数字之和为" + result);
    }

    public static int sumDigits(long n) {
        long a = n % 10,b = n / 10;
        int sum = 0;
        for (;n >= 1;n /= 10){
            sum += n % 10;
        }
        return sum;
    }

}


