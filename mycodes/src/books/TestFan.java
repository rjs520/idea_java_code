package books;

import java.awt.*;

import static java.awt.Color.blue;
import static java.awt.Color.yellow;

class Fan {
    int SLOW = 1;
    int MEDIUM = 2;
    int FAST = 3;
    private int speed;
    private boolean on;
    private double radius;
    Color color;

    public int getSpeed(){
        return speed;
    }
    public void setSpeed(int speed){
        this.speed = speed;
    }
    public boolean getOn(){
        return on;
    }
    public void setOn(boolean on){
        this.on = on;
    }

    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius){
        this.radius = radius;
    }
    public Color getColor(){
        return color;
    }
    public void setColor(Color color){
        this.color = color;
    }
    public void fan(int SLOW, int MEDIUM, int FAST){
        this.SLOW = SLOW;
        this.MEDIUM = MEDIUM;
        this.FAST = FAST;
    }
    public String toString(){
        String str = "";
        if (on){
            str += "The fan is on. ";
        }
        else {
            str += "The fan is off. ";
        }
        str += "The fan speed is " + speed + ". ";
        str += "The fan radius is " + radius + ". ";
        str += "The fan color is " + color + ". ";
        return str;
    }
    }
    /**
     * @author 松哥
     */
    public class TestFan {
        public static void main(String[] args) {
            Fan f1 = new Fan();
            f1.setSpeed(f1.FAST);
            f1.setRadius(10);
            f1.setColor(yellow);
            f1.setOn(true);
            Fan f2 = new Fan();
            f2.setSpeed(f2.MEDIUM);
            f2.setRadius(5);
            f2.setColor(blue);
            f2.setOn(false);
            System.out.println(f1.toString());
            System.out.println(f2.toString());
        }
    }





