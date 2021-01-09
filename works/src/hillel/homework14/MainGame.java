package hillel.homework14;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class MainGame {

    public void primaryWrite(String str)
            throws IOException {

        BufferedWriter writer = new BufferedWriter(new FileWriter("D:\\Projects\\HW\\works\\src\\hillel\\homework14\\result.txt"));
        writer.write(str);

        writer.close();
    }

    public void nextWrite(String str)
            throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter("D:\\Projects\\HW\\works\\src\\hillel\\homework14\\result.txt", true));
        writer.append("\n");
        writer.append(str);

        writer.close();
    }

    public static String time() {
        LocalDateTime ldt = LocalDateTime.now();
        String str = "Дата и время: " + ldt.format(DateTimeFormatter.ofPattern("dd.MM.yy" + "\nHH:mm:ss"));

        return str;
    }

    public static void main(String[] args) throws IOException {
        int countGames = 0;
        int scoringComp = 0;
        int scoringUser = 0;

        User user = new User();

        System.out.println("Введите своё имя: " + "\nИмя: ");
        Scanner scanner = new Scanner(System.in);
        String n = scanner.nextLine();
        user.setName(n);
        System.out.println("Вы ввели имя: " + user.getName());
        System.out.println("Сколько игр вы хотите сыграть?: ");
        int numbersGames = scanner.nextInt();

        if (numbersGames <= 0) {
            System.out.println("Введите число игр больше 0");
        } else {
            System.out.println("Выибарайте ROCK, PAPER, SCISSORS цифрами от 1 до 3 " +
                    "\nЧтобы прервать игру выберите цифру 4");
            do {
                System.out.println("Выберите цифрой: \n1 - ROCK \n2 - PAPER \n3 - SCISSORS \n4 - STOP");

                int enterUser = scanner.nextInt();
                if (enterUser == 1) {
                    System.out.println("Вы ввели: ROCK ");
                } else if (enterUser == 2) {
                    System.out.println("Вы ввели: PAPER ");
                } else if (enterUser == 3) {
                    System.out.println("Вы ввели: SCISSORS ");
                } else if (enterUser == 4) {
                    System.out.println("Вы прервали игру!");
                    break;
                } else {
                    System.out.println("Неверный выбор!! ");
                    break;
                }

                int randomComp = (int) (Math.random() * 3 + 1);

                switch (randomComp) {
                    case 1:
                        System.out.println("Комп ввёл: " + RockPaperScissors.ROCK);
                        break;
                    case 2:
                        System.out.println("Комп ввёл: " + RockPaperScissors.PAPER);
                        break;
                    case 3:
                        System.out.println("Комп ввёл: " + RockPaperScissors.SCISSORS);
                        break;
                }

                if (randomComp == 1 && enterUser == 2) {
                    System.out.println("Вы выиграли");
                    scoringUser++;
                } else if (randomComp == 2 && enterUser == 3) {
                    System.out.println("Вы выиграли");
                    scoringUser++;
                } else if (randomComp == 3 && enterUser == 1) {
                    System.out.println("Вы выиграли");
                    scoringUser++;
                } else if (randomComp == enterUser) {
                    System.out.println("Ничья ");
                } else {
                    System.out.println("Выиграл компьютер");
                    scoringComp++;
                }
                countGames++;

            }
            while (countGames < numbersGames);

            System.out.println("================================");

            System.out.println("Очки компьютер: " + scoringComp);
            System.out.println("Очки пользователь: " + scoringUser);

            MainGame mainGAme = new MainGame();

            if (scoringComp > scoringUser) {
                System.out.println("По итогу игры выиграл компьютер со счетом: " + scoringComp + " : " + scoringUser);
                if (countGames == 1) {
                    mainGAme.primaryWrite(time() + "\nИмя: " + user.getName() + "\nПо итогу игры выиграл компьютер со счетом: " + scoringComp
                            + " : " + scoringUser + "\n================================================");
                } else if (countGames <= numbersGames) {
                    mainGAme.nextWrite(time() + "\nИмя: " + user.getName() + "\nПо итогу игры выиграл компьютер со счетом: " + scoringComp
                            + " : " + scoringUser + "\n================================================");
                }
            } else if (scoringComp < scoringUser) {
                System.out.println("Имя: " + user.getName() + "\nПо итогу игры вы выиграли со счетом: " + scoringUser + " : " + scoringComp);
                if (countGames == 1) {
                    mainGAme.primaryWrite(time() + "\nИмя: " + user.getName() + "\nПо итогу игры вы выиграли со счетом: " + scoringUser
                            + " : " + scoringComp + "\n================================================");
                } else if (countGames <= numbersGames) {
                    mainGAme.nextWrite(time() + "\nИмя: " + user.getName() + "\nПо итогу игры вы выиграли со счетом: " + scoringUser
                            + " : " + scoringComp + "\n================================================");
                }
            } else {
                System.out.println("Вы сыграли в ничью с компьютером со счетом: " + scoringComp + " : " + scoringUser);
                if (countGames == 1) {

                    mainGAme.primaryWrite(time() + "\nИмя: " + user.getName() + "\nВы сыграли в ничью с компьютером со счетом: " + scoringComp
                            + " : " + scoringUser + "\n================================================");
                } else if (countGames <= numbersGames) {

                    mainGAme.nextWrite(time() + "\nИмя: " + user.getName() + "\nВы сыграли в ничью с компьютером со счетом: " + scoringComp
                            + " : " + scoringUser + "\n================================================");
                }
            }

        }
    }
}
