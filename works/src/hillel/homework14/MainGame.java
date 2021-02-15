package hillel.homework14;

import java.io.*;
import java.util.Locale;
import java.util.Scanner;

public class MainGame {
int a;
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Выберите язык: \n1 - українська, 2 - русский, 3 - english ");

        int choiceLang = scanner.nextInt();
        switch (choiceLang) {
            case 1:
                ResManager.changeResource(new Locale("uk"));
                LogicGame.codeGame();
                break;
            case 2:
                ResManager.changeResource(new Locale("ru"));
                LogicGame.codeGame();
                break;
            case 3:
                ResManager.changeResource(new Locale("en"));
                LogicGame.codeGame();
                break;
        }
    }

}
