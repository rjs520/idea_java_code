package experiment.experiment4;

import java.util.Calendar;
import java.util.Date;

/**
 * @author 松哥
 */
public class TestTv {
    public static void main(String[] args) {
        Tv tv = new Tv("sony", new Date());
        tv.setChannel(1);
        tv.setVolumeLevel(1);
        tv.setOn(1);
        Date date = new Date();
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        System.out.println(tv);
    }

    }

