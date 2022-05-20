package books;

import java.util.Date;

/**
 * @author 松哥
 */
class Account {
    private double balance;
    private int id;
    private double annualInterestRate;
    private Date dateCreated;

    public Account() {
        dateCreated = new Date();
    }
    public void account(int id , double balance){
        this.id = id;
        this.balance = balance;
        dateCreated = new Date();
    }
    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id = id;
    }
    public double getBalance(){
        return balance;
    }
    public void setBalance(double balance){
        this.balance = balance;
    }
    public double getAnnualInterestRate(){
        return annualInterestRate;
    }
    public void setAnnualInterestRate(double annualInterestRate){
        this.annualInterestRate = annualInterestRate;
    }
    public double getMonthlyInterestRate(){
        return annualInterestRate / 12;
    }
    public double getMonthlyinterest(){
        return balance * getMonthlyInterestRate();
    }
    public void withdraw(double amount){
        balance -= amount;
    }
    public void deposit(double amount){
        balance += amount;
    }
}
public class TestAccount {
    public static void main(String[] args) {
        Account account = new Account();
        account.setId(1122);
        account.setBalance(20000);
        account.setAnnualInterestRate(4.5);
        System.out.println("Account ID: " + account.getId());
        System.out.println("Balance: " + account.getBalance());
        System.out.println("Monthly Interest Rate: " + account.getMonthlyInterestRate());
        System.out.println("Monthly Interest: " + account.getMonthlyinterest());
        account.withdraw(2500);
        System.out.println("Balance: " + account.getBalance());
        account.deposit(3000);
        System.out.println("Balance: " + account.getBalance());
    }
}
