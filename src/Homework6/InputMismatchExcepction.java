package Homework6;
import java.util.InputMismatchException;
import java.util.Scanner;

public class InputMismatchExcepction {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number1 = 0, number2 = 0;
        boolean validInput = false;
        while (!validInput) {
            try {
                System.out.print("The first number:");
                number1 = scanner.nextInt();
                validInput = true;
            } catch (InputMismatchException e) {
                System.out.println("Exception number, try again");
                scanner.next();
            }
        }
        validInput = false;
        while (!validInput) {
            try {
                System.out.print("The second number: ");
                number2 = scanner.nextInt();
                validInput = true;
            } catch (InputMismatchException e) {
                System.out.println("Exception number, try again");
                scanner.next();
            }
        }
        System.out.println("The sum numbers: " + (number1 + number2));
    }
}

