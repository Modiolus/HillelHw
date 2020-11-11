package hillel.homework2;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        double sum = 0d;
        Scanner scan = new Scanner(System.in);
        System.out.println("To calculate the arithmetic mean,\nenter the number of numbers");
        int enterNumber = scan.nextInt();

        for (int i = 0; i < enterNumber; i++) {
            System.out.print("enter " + (i + 1) + " number: ");
            double number = scan.nextDouble();
            sum += number;

        }
        double average = sum / enterNumber;

        System.out.println("The arithmetic mean is: " + average);

    }
}
