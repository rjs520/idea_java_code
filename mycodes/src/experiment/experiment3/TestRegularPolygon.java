package experiment.experiment3;

public class TestRegularPolygon{
        public static void main(String[] args) {
            RegularPolygon regularPolygon1 = new RegularPolygon();
            RegularPolygon regularPolygon2 = new RegularPolygon(6,4);
            RegularPolygon regularPolygon3 = new RegularPolygon(10,4,5.6,7.8);
            System.out.println("regularPolygon1 perimeter is " + regularPolygon1.getPerimeter() + " and regularPolygon1 area is " + regularPolygon1.getArea());
            System.out.println("regularPolygon2 perimeter is " + regularPolygon2.getPerimeter() + " and regularPolygon2 area is " + regularPolygon2.getArea());
            System.out.println("regularPolygon3 perimeter is " + regularPolygon3.getPerimeter() + " and regularPolygon3 area is " + regularPolygon3.getArea());
        }
    }

class RegularPolygon{
    int n = 3;
    double side = 1;
    double x = 0;
    double y = 0;
    public RegularPolygon() {
        this(3, 1, 0, 0);
    }
    RegularPolygon(int newN,double newside){
        this.n = newN;
        this.side = newside;
        this.x = 0;
        this.n = 0;
    }
    RegularPolygon(int newN,double newside,double newX,double newY){
        this.n = newN;
        this.side = newside;
        this.x = newX;
        this.y = newY;
    }
    public int getN(){
        return n;
    }
    public void setN(int newN){
        this.n = newN;
    }
    public double getSide(){
        return side;
    }
    public void setSide(double newSide){
        this.side=  newSide;
    }
    public double getX(){
        return x;
    }
    public void setX(double newX){
        this.x = newX;
    }
    public double getY(){
        return y;
    }
    public void setY(double newY){
        this.y = newY;
    }
    public double getPerimeter(){
        return n * side;
    }
    public double getArea(){
        double Area = (n * side * side) / (4 * Math.tan(Math.PI / n));
        return Area;
    }
}