package hillel.homework3;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner enter = new Scanner(System.in);
        System.out.print("Эта программа считает факториал числа n. \nВведите число n: ");
        int input = enter.nextInt();
        long result = 1L;
        for (int i = 1; i <= input; i++) {
            result = result * i;

        }
        System.out.println("Факториал числа " + input + " равен: " + result);

    }
}
