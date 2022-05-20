package experiment.experiment4;

import java.util.Date;

/**
 * @author 松哥
 */
public class WashingMachine  extends Household{
    private int capacity;
    public WashingMachine(int capacity, String brand, Date productionDate){
        super(brand, productionDate);
        this.capacity = capacity;
        this.brand = brand;
        this.productionDate = productionDate;
    }
    public int getCapacity(){
        return capacity;
    }
    public void setCapacity(int capacity){
        this.capacity = capacity;
    }

    @Override
    public String toString(){
        return "WashingMachine{" +
                "capacity=" + capacity +
                ", brand='" + brand + '\'' +
                ", productionDate=" + productionDate +
                '}';
    }
}
