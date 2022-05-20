package experiment.experiment4;

import java.util.Date;

/**
 * @author 松哥
 */
public class Tv extends Household {
    private int channel = 1;
    private int volumeLevel = 1;
    private int on = 0;
    private Date date;

    public Tv(String brand, Date productionDate) {
        super(brand, productionDate);
    }

    public int getChannel() {
        return channel;
    }

    public void setChannel(int channel) {
        this.channel = channel;
    }

    public int getVolumeLevel() {
        return volumeLevel;
    }

    public void setVolumeLevel(int volumeLevel) {
        this.volumeLevel = volumeLevel;
    }

    public int getOn() {
        return on;
    }

    public void setOn(int on) {
        this.on = on;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "TV{" +
                "channel=" + channel +
                ", volumeLevel=" + volumeLevel +
                ", brand=" + brand +
                ", productionDate=" + productionDate +
                '}';
    }
}
