package experiment.experiment6;

/**
 * @author 松哥
 */
public class TestExperiment6 {
    public static void main(String[] args) {
        Bamboo bamboo = new Bamboo();
        Hydrogenballoon hydrogenballoon = new Hydrogenballoon();
        bamboo.grow();
        bamboo.isliving();
        hydrogenballoon.canRise();
        hydrogenballoon.isliving();
    }
}
