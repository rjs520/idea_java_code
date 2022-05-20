package experiment.experiment4;

import java.util.Date;

/**
 * @author 松哥
 */
public class TestWashingMachine {
    public static void main(String[] args) {
        WashingMachine washingMachine = new WashingMachine(500, "tencent", new Date());
        System.out.println(washingMachine);
    }
}
