package Homework6;

import java.util.Random;
import java.util.Scanner;

public class ArrayIndexOutOfBoundsException {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int[] numbbers = new int[20];
        for (int i = 0; i < numbbers.length; i++) {
            numbbers[i] = random.nextInt(100);
        }
        System.out.println("Massive is create");
        while (true){
            try {
                System.out.println("Please enter a number ot 0 do 19:");
                int index = scanner.nextInt();
                System.out.println("The value before the element " + index + " equally: " + numbbers[index]);
                break;
            }catch (java.lang.ArrayIndexOutOfBoundsException e){
                System.out.println("An error har occurred ");
            }catch (Exception e){
                System.out.println("YOU have mistake, please try again");
                scanner.nextInt();
            }
        }
    }
}