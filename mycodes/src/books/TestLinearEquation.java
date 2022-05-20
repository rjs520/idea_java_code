package books;

import java.util.Scanner;

class LinearEquation {
    private double a;
    private double b;
    private double c;
    private double d;
    private double e;
    private double f;

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    public double getD() {
        return d;
    }

    public void setD(double d) {
        this.d = d;
    }

    public double getE() {
        return e;
    }

    public void setE(double e) {
        this.e = e;
    }

    public double getF() {
        return f;
    }

    public void setF(double f) {
        this.f = f;
    }
    public boolean isSolveable(){
        if ((a*d - b*c) != 0){
            return true;
        }
        return false;
    }
    public double getX(){
       return  ((e*d - b*f) / (a*d - b*c));
    }
    public double getY(){
        return ((a*f - e*c) / (a*d - b*c));
    }
}
/**
 * @author 松哥
 */
public class TestLinearEquation{
    public static void main(String[] args) {
        System.out.println("请输入a,b,c,d,e,f的值：");
        Scanner sc = new Scanner(System.in);
        LinearEquation le = new LinearEquation();
        le.setA(sc.nextDouble());
        le.setB(sc.nextDouble());
        le.setC(sc.nextDouble());
        le.setD(sc.nextDouble());
        le.setE(sc.nextDouble());
        le.setF(sc.nextDouble());
        if (le.isSolveable()){
            System.out.println("true");
        }
        else {
            System.out.println("The equation has no solution");
        }
        System.out.println("x = " + le.getX());
        System.out.println("y = " + le.getY());
    }
}
