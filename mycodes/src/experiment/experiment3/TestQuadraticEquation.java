package experiment.experiment3;

import java.util.Scanner;

public class TestQuadraticEquation {
    public static void main(String[] args) {
    System.out.println("Enter the a,b,c is :");
    try (Scanner input = new Scanner(System.in)) {
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        QuadraticEquation x = new QuadraticEquation(a, b, c);
        double y = x.getDiscriminant();

            if (y > 1){
                System.out.printf("%.3f %.3f\n", x.getRoot1(), x.getRoot2());
            } else if (y < 0.0001 && y > -0.0001){
                System.out.printf("%.3f\n", x.getRoot1());
            } else {
                System.out.printf("The equation has no roots");
            }
    }
}
}
class QuadraticEquation{
    double a;
    double b;
    double c; 
    QuadraticEquation(double A,double B,double C){
        this.a = A;
        this.b = B;
        this.c = C;
    }
    public double getA(){
        return a;
    }
    public void setA(double A){
        this.a = A;
    }
    public double getB(){
        return b;
    }
    public void setB(double B){
        this.b = B;
    }
    public double getC(){
        return c;
    }
    public void setC(double C){
        this.c = C;
    }
    public double getDiscriminant(){
        double Discriminant = (b * b) - (4 * a * c);
        return Discriminant;
    }
    public double getRoot1(){
        double n1 = Math.sqrt((b * b) - (4 * a * c));
        double Root1 = (n1 - b) /(2 * a);
        return Root1;
  
        }
    
    public double getRoot2(){
        double n2 = Math.sqrt((b * b) - (4 * a * c));
        double Root2 = (- n2 - b) /(2 * a);
        return Root2;
    }
}