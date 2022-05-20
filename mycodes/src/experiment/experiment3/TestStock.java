package experiment.experiment3;

public class TestStock {
	public static void main(String[] args) {
			Stock l1 = new Stock();
			l1.previousClosingPrice= 34.5;
			l1.currentPrice= 34.35;
            l1.getsymbol("ORCL");
			l1.getname("Oracle Copration");
            System.out.println(l1.getsymbol());
            System.out.println(l1.getname());
			System.out.printf("%.2f",l1.getChangePercent());
			System.out.println("%");
	}
}
class Stock{
    String symbol;
    String name;
    double previousClosingPrice;
    double currentPrice;
    public String getsymbol(){
        return symbol;
    }
    public void getsymbol(String symbol){
        this.symbol = symbol;
    }
    public String getname(){
        return name;
    }
    public void getname(String name){
        this.name = name;
    }
    public double getpreviousClosingPrice(){
        return previousClosingPrice;
    }
    public void getpreviousClosingPrice(double previousClosingPrice){
        this.previousClosingPrice = previousClosingPrice;
    }
    public double getcurrentPrice(){
        return currentPrice;
    }
    public void getcurrentPrice(double currentPrice){
        this.currentPrice = currentPrice;
    }
    public double getChangePercent(){
        double Percent = (currentPrice - previousClosingPrice) / previousClosingPrice;
        return Percent * 100;
    }
}
