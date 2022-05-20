package experiment.experiment2;

import java.util.*;
 
/**
 * @author 松哥
 */
public class TwoDimensionArrays1 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int[][] count = new int[5][];
        int a,b=25;
        for (int i = 0;i < count.length;i++){
            a = (int) (Math.random()*5+1);
            count[i] = new int[a];
            for (int j = 0;j < a; j++){
                count[i][j] =b;
                b--;
            }
        }
        System.out.print("the input count is :\n");
        for (int[] ints : count) {
            for (int anInt : ints) {
                System.out.printf("%-4d", anInt);

            }
            System.out.print("\n");
        }
        System.out.print("\n");
        System.out.print("\n");
        
        }
    }
