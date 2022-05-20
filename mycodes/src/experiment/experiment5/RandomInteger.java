package experiment.experiment5;

import java.util.Collections;
import java.util.Random;
import java.util.ArrayList;

/**
 * @author 松哥
 */
public class RandomInteger {
    public static void main(String[] args) {
        Random random = new Random();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            list.add(random.nextInt(100));
        }
        Collections.sort(list);
        System.out.println(list);
    }

    }

