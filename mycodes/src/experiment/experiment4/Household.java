package experiment.experiment4;

import java.util.Date;

/**
 * @author 松哥
 */
public class Household {

    private boolean on;
    String brand;
    Date productionDate;

    public Household(boolean on, String brand, Date productionDate) {
        this.on = on;
        this.brand = brand;
        this.productionDate = productionDate;
    }
    public Household(String brand, Date productionDate) {
        this.brand = brand;
        this.productionDate = productionDate;
    }

    public Household() {

    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
    public Date getProductionDate() {
        return productionDate;
    }

    public void setProductionDate(Date productionDate) {
        this.productionDate = productionDate;
    }
}
