package experiment.experiment4;

import java.util.Date;

/**
 * @author 松哥
 */
public class SmartTv extends TestTv {
    private final String productionDate;
    private final String brand;

    public SmartTv(String brand, Date productionDate) {
        this.brand = brand;
        this.productionDate = productionDate.toString();
    }

    @Override
    public String toString() {
        return "SmartTV{" +
                "brand='" + brand + '\'' +
                ", productionDate=" + productionDate +
                '}';
    }
}
