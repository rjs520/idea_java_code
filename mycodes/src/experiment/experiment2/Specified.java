package experiment.experiment2;

import java.util.Scanner;
/**
 * @author 松哥
 */
public class Specified {
    static Scanner c = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("please enter the charter :");
        String str = c.next();
        System.out.println("please enter the you want the charter :");
        String b = c.next();
        frequency(str,b);
    }
    public static void frequency(String str,String b) {
        int count = (str.length()-str.replace(b, "").length())/b.length();
        System.out.println("the charter is :" + count +" times");
    }
    
}
