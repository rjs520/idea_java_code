package experiment.experiment2;

import java.util.Scanner;

/**
 * @author 松哥
 */
public class YearMonth {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Enter a year: ");
            int year = input.nextInt();
            input.nextLine();
            System.out.println("Enter a month: ");
            String month = input.next();
            int moonlighting = month.length();
            if(moonlighting != 3){
                System.out.println(month + " is not a correct month name");
                System.exit(1);
            }
            char monthF = month.charAt(0);
            int i = (int) monthF;
            if(i > 90 || i < 65){
                System.out.println(month + " is not a correct month name");
                System.exit(1);
            }
            boolean bool = false;
            if( ( (year % 4 == 0) && (year % 100 != 0) ) || (year % 400 == 0) ){
                bool = true;
            }
            int day = 0;
                switch(month){
                    case "Jan":
                    case "Mar":
                    case "May":
                    case "Jul":
                    case "Aut":
                    case "Otc":
                    case "Dec":
                    day = 31;
                    break;
                    case "Apr":
                    case "Jun":
                    case "Sep":
                    case "Nov":
                    day = 30;
                    break;
                    case "Feb":
                    day = 28;
                    break;
                    default:
                }
                    if( (bool) && (day == 28) ){
                        day += 1;
                    }
                System.out.println(month + year + " has " + day + " days");
        }
}
}                