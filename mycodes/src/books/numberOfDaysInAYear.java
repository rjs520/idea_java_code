package books;

/**
 * @author 松哥
 */
    public class numberOfDaysInAYear {
    public static void main(String[] args) {
        for (int i = 2000; i < 2020; i++) {
            System.out.println("the year is " + i + " days is " + numberOfDaysInAYear(i));
        }
    }

    public static int numberOfDaysInAYear(int year) {
        if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0 && (year % 100 == 0))) {
            return 366;
        } else {
            return 365;
        }
        }
    }


