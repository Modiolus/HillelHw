package com.homework19;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.util.Scanner;

public class GameMain {
    private static final Logger loggerDebug = LoggerFactory.getLogger("logger.debug");
    private static final Logger loggerWarn = LoggerFactory.getLogger("logger.warn");

    public static void main(String[] args) throws IOException {
        int countGames = 0;
        int scoringComp = 0;
        int scoringUser = 0;


        User user = new User();

        System.out.println("Введите своё имя: " + "\nИмя: ");
        Scanner scanner = new Scanner(System.in);
        String n = scanner.nextLine();
        user.setName(n);
        loggerDebug.debug("Пользователь: " + user.toString() + " вошёл в игру");

        System.out.println("Вы ввели имя: " + user.getName());
        System.out.println("Сколько игр вы хотите сыграть?: ");
        int numbersGames = scanner.nextInt();


        if (numbersGames <= 0) {
            System.out.println("Введите число игр больше 0");
        } else {
            System.out.println("Выибирайте ROCK, PAPER, SCISSORS цифрами от 1 до 3 " +
                    "\nЧтобы прервать игру выберите цифру 4");
            do {
                System.out.println("Выберите цифрой: \n1 - ROCK \n2 - PAPER \n3 - SCISSORS \n4 - STOP");

                int enterUser = scanner.nextInt();
                if (enterUser == 1) {
                    loggerDebug.debug("Пользователь: " + user.toString() + " ввел: ROCK ");
                    System.out.println("Вы ввели: ROCK ");
                } else if (enterUser == 2) {
                    loggerDebug.debug("Пользователь: " + user.toString() + " ввел: PAPER ");
                    System.out.println("Вы ввели: PAPER ");
                } else if (enterUser == 3) {
                    loggerDebug.debug("Пользователь: " + user.toString() + " ввел: SCISSORS ");
                    System.out.println("Вы ввели: SCISSORS ");
                } else if (enterUser == 4) {
                    loggerDebug.debug("Пользователь: " + user.toString() + " прервал игру");
                    System.out.println("Вы прервали игру!");
                    break;
                } else {
                    loggerWarn.warn("Пользователь: " + user.toString() + " сделал неправильный выбор хода");
                    System.out.println("Неверный выбор!! ");
                    break;
                }

                int randomComp = (int) (Math.random() * 3 + 1);

                switch (randomComp) {
                    case 1:
                        loggerDebug.debug("Компьютер ввел: " + RockPaperScissors.ROCK);
                        System.out.println("Комп ввёл: " + RockPaperScissors.ROCK);
                        break;
                    case 2:
                        loggerDebug.debug("Компьютер ввел: " + RockPaperScissors.PAPER);
                        System.out.println("Комп ввёл: " + RockPaperScissors.PAPER);
                        break;
                    case 3:
                        loggerDebug.debug("Компьютер ввел: " + RockPaperScissors.SCISSORS);
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
                loggerDebug.debug("Всего игр: " + numbersGames);
                loggerDebug.debug("Всего сыгранных игр: " + countGames);
                loggerDebug.debug("Осталось сыграть: " + (numbersGames-countGames));
            }
            while (countGames < numbersGames);

            System.out.println("================================");

            System.out.println("Очки компьютер: " + scoringComp);
            System.out.println("Очки пользователь: " + scoringUser);


            if (scoringComp > scoringUser) {
                loggerDebug.debug("По итогу игры выиграл компьютер со счетом: " + scoringComp + " : " + scoringUser);
                System.out.println("По итогу игры выиграл компьютер со счетом: " + scoringComp + " : " + scoringUser);

                WriteAndTime.write(WriteAndTime.time() + "\nИмя: " + user.getName() + "\nПо итогу игры выиграл компьютер со счетом: " + scoringComp
                        + " : " + scoringUser + "\n================================================");

            } else if (scoringComp < scoringUser) {
                loggerDebug.debug("По итогу игры выиграл " +user.getName()+ " со счетом: " + scoringUser + " : " + scoringComp);
                System.out.println("Имя: " + user.getName() + "\nПо итогу игры вы выиграли со счетом: " + scoringUser + " : " + scoringComp);

                WriteAndTime.write(WriteAndTime.time() + "\nИмя: " + user.getName() + "\nПо итогу игры вы выиграли со счетом: " + scoringUser
                        + " : " + scoringComp + "\n================================================");

            } else {
                loggerDebug.debug("Пользователь " + user.getName() + " сыграл в ничью с компьютером со счетом: " + scoringComp + " : " + scoringUser);
                System.out.println("Вы сыграли в ничью с компьютером со счетом: " + scoringComp + " : " + scoringUser);


                WriteAndTime.write(WriteAndTime.time() + "\nИмя: " + user.getName() + "\nВы сыграли в ничью с компьютером со счетом: " + scoringComp
                        + " : " + scoringUser + "\n================================================");

            }
        }
    }
}
