package hillel.homework3;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Таблицу умножения на какое число вы хотите увидеть? \nВведите число: ");
        int number = scan.nextInt();
        int result;
        System.out.println("Таблица умножения на " + number);

        for (int i = 1; i <= 10; i++) {
            result = number * i;
            System.out.println(number + "*" + i + "=" + result);
        }
    }
}
