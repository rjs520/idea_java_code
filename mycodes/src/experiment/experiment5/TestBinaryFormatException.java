package experiment.experiment5;

import java.util.Scanner;

/**
 * @author 松哥
 */
public class TestBinaryFormatException {
    public static void main(String[] args) {
            try (Scanner scanner = new Scanner(System.in)) {
                System.out.println("请输入一个二进制字符串：");
                String bin = scanner.nextLine();
                System.out.println("输入的二进制字符串是：" + bin);
                System.out.println("转换后的十进制数是：" + bin2Dec(bin));
            }
            catch (BinaryFormatException ex) {
                System.out.println(ex.getMessage());
            }


    }
    public static int multiply(int number, int length) {
        if (number == 1) {
            int result = 1;
            for (int i = 0; i < length; i++) {
                result *= 2;
            }
            return result;
        }
        return 0;
    }


    public static int bin2Dec(String bin) throws BinaryFormatException {
        int number = 0;
        int[] array = new int[bin.length()];
        for (int i = 0; i < bin.length(); i++) {
            array[i] = bin.charAt(i) - 48;
            if(array[i] != 0 && array[i] != 1) {
                throw new BinaryFormatException("不是二进制");
            }
            int j = multiply(array[i], bin.length() - i);
            number += j;
        }
        return number;
    }
}


class BinaryFormatException extends Exception {
    public BinaryFormatException() {
        super();
    }
    public BinaryFormatException(String message) {
        super(message);
    }
    @Override
    public String getMessage() {
        return super.getMessage();
    }
}

