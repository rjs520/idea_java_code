package experiment.experiment5;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author 松哥
 */
public class Union {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 =new ArrayList<>();
        ArrayList<Integer> list3;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter five integers for list1");
        for (int i = 0; i < 5; i++) {
            int number = input.nextInt();
            list1.add(number);
        }
        System.out.println("Enter five integers for list2");
        for (int i = 0; i < 5; i++) {
            int number = input.nextInt();
            list2.add(number);
        }
        list3 = union(list1,list2);
        System.out.println("The combined list is " + list3);
    }


    public static ArrayList<Integer> union(ArrayList<Integer> list1, ArrayList<Integer> list2){
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            list.add(list1.get(i));
        }
        for (int i = 0; i < 5; i++) {
            list.add(list2.get(i));
        }
        return list;

    }
}
