package hillel.homework3;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {

        Scanner enter = new Scanner(System.in);
        System.out.println("Эта программа выводит результат: число x в степени n.");
        System.out.print("Введите число x: ");

        int x = enter.nextInt();
        System.out.print("Введите число n: ");
        int n = enter.nextInt();

        int a = (int) Math.pow(x, n);
        System.out.println(x + " в степени " + n + " = " + a);
    }
}
