package experiment.experiment2;

/**
 * @author 松哥
 */
public class Conversion {
    public static void main(String[] args) {
        head();
        for(double i = 1; i <= 10; i ++){
            for(double m = 20; m <= 65;){
                System.out.printf("%.1f\t\t%.3f\t\t%.1f\t\t%.3f\n", i, Gll.footToMeter(i),
					m, Gll.meterToFoot(m));
                    break;
            }
        }
        

    }
    public static void head() {
		System.out.println("Feet\t\tMeters\t\tMeters\t\tFeet");
		System.out.println("------------------------------------------------------");
	}
    class Gll{
    public static double footToMeter (double foot)
    {
        return 0.305 * foot;
        
    }
    public static double meterToFoot(double meter){
        return 3.279 * meter;
    }
}
}
