package experiment.experiment2;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author 松哥
 */
public class Combination {
    public static void main(String[] args) {
        int length0 = 10;
        int[] theist = new int[length0];
        Scanner input = new Scanner(System.in);
        System.out.print("please enter 10 counts :");
        for (int i = 0 ; i < length0 ; i++){
            theist[i] = input.nextInt();
        }
        Arrays.sort(theist);
        int count = length0;
        for (int i = 0 ; i < length0 - 1 ;i++){
            if (theist[i] == theist[i+1])
                count--;
        }
        int[] lithesome = new int[count];
        int index_thelistome = 0;
        for (int i = 0 ; i < length0 ; i++){
            if (i == 0){
                lithesome[index_thelistome] = theist[i];
            }else if(lithesome[index_thelistome] != theist[i]){
                ++index_thelistome;
                lithesome[index_thelistome] = theist[i];
            }
        }
        for (int a = 0 ; a <= index_thelistome  ; a++){
            for (int b = 0 ; b <= index_thelistome ; b++){
                if (lithesome[a] != lithesome[b])
                {
                    System.out.printf("a=" + lithesome[a] + " b=" + lithesome[b]+" ,");
                    if(b==9)
                    {
                        System.out.println();
                    }
                }
            }
        }
        for (int i = 0 ; i < length0 - 1 ;i++){
            if(theist[i] == theist[i+1]) {
                System.out.printf("a=" + theist[i] + ", b=" + theist[i]+" ");
            }
                input.close();
        }
    }
}
