package hillel.homework3;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        int i = 1;
        while (i <= 100) {
            System.out.println(i);
            i += 2;
        }

        System.out.println("===================================");

        Scanner enter = new Scanner(System.in);
        System.out.print("Эта программа считает факториал числа n. \nВведите число n: ");
        int input = enter.nextInt();
        long result = 1L;
        int i2 = 1;
        while (i2 <= input) {
            result = result * i2;
            i2 += 1;
        }
        System.out.println("Факториал числа " + input + " равен: " + result);
    }
}
