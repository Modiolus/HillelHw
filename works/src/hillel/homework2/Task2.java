package hillel.homework2;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        double sum = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("To calculate the arithmetic mean,\nenter the number of numbers");
        int enter = scan.nextInt();

        double[] numbers = new double[enter];
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("enter " + (i + 1) + " number: ");
            numbers[i] = scan.nextDouble();
            sum = sum + numbers[i];

        }
        double average = sum / enter;

        System.out.println("The arithmetic mean is: " + average);

    }
}
