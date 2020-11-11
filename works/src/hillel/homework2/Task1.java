package hillel.homework2;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        double sum = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("To calculate the arithmetic mean of two numbers");

        for (int i = 0; i < 2; i++) {
            System.out.print("enter " + (i + 1) + " number: ");
            sum += scan.nextInt();
        }
        double average = sum / 2;
        System.out.println("The arithmetic mean is: " + average);
    }
}
