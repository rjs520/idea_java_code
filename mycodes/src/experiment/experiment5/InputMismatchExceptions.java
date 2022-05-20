package experiment.experiment5;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author 松哥
 */
public class InputMismatchExceptions {
    public static void main(String[] args) {
        System.out.println("Enter two integers :");
        Scanner input = new Scanner(System.in);

        while (true) {
            try {
                int a = input.nextInt();
                int b = input.nextInt();
                System.out.println(a + b);
                break;
            }
            catch (InputMismatchException ex) {
                System.out.println("Try again :");
                input.nextLine();
            }

        }
    }

}
