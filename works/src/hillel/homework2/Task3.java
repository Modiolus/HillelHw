package hillel.homework2;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите сумму денежного вклада(грн): ");
        double deposit = scan.nextInt();
        System.out.print("Введите процент годовых: ");
        int percent = scan.nextInt();
        System.out.print("На сколько лет вы хотите разместить вклад?: ");
        int years = scan.nextInt();

        for (int i = 0; i < years; i++) {
            double profit = (deposit * percent / 100);
            deposit = deposit + (deposit * percent / 100);

            System.out.println("Накопленная сумма за " + (i + 1) + " год: " + deposit + " грн; " +
                    "начисленные проценты: " + profit + " грн;");

        }
    }
}
