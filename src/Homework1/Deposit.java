package Homework1;
public class Deposit {
    public static void main(String[] args){
        Account myAcc = new Account(050514,27438,15 );
        System.out.println("Monthly interest rate:" + myAcc.getMonthlyInterestRate() );
        System.out.println("Monthly payment of money to the account:" + myAcc.getMonthlyInterest());
        // Создаем один объект класса Account и вызоваем своим методам
        myAcc.deposit(350);
        System.out.println("My balance after I deposit it:" + myAcc.getBalance());
        myAcc.withdraw(280);
        System.out.println("Balance after withdrawal:" + myAcc.getBalance());
    }
}


