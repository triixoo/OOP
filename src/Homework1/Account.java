package Homework1;

public class Account {
    private int id;
    private double balance;
    private double annualInterestRate;

    public Account(int id, double balance, double annualInterestRate) {
        this.id = id;
        this.balance = balance;
        this.annualInterestRate = annualInterestRate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }
    // Для того что бы узнать нашим методом годовую ставку ежемесечную и создаем таким образом метод
    public double getMonthlyInterestRate() {
        return annualInterestRate / 12;
    }
    // Тут уже понятно что, на сколько наша сумма будет увеличеваться
    public double getMonthlyInterest() {
        return balance * getMonthlyInterestRate();
    }
    // Снимаем когда деньги используем этот метод void withdraw(double amount)
    public void withdraw(double amount){
        if (amount>balance){
            System.out.println("U tebya netu deneg");
        }else{
            balance -= amount;
        }
    }
    //вносим наши деньги на баланс
    public void deposit(double amount) {
        balance += amount;
    }
}

