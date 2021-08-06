package hexlet.code;

import hexlet.code.games.GamesEnum;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        int choseUser = 0;
        Scanner sc = new Scanner(System.in);
        boolean exit = false;
        boolean exitWhile = false;
        while (!exitWhile) {
            System.out.println("Please enter the game number and press Enter.");
            System.out.println("1 - Greet \n2 - Even \n3 - Calc \n4 - GCD \n0 - Exit");
            if (sc.hasNextInt()) {
                choseUser = sc.nextInt();
                exitWhile = true;
                if (choseUser == 0) {
                    exit = true;
                }
            } else {
                System.out.println("Это не число программа будет завершена");
                exitWhile = true;
                exit = true;
            }
        }
        System.out.println("Your choice: " + choseUser);
        if (!exit) {

            System.out.println("Welcome to the Brain Games!");
            String nameUser = Cli.askAndHello();
            switch ((Integer.toString(choseUser))) {
                case "2":
                    Engine.run(nameUser, GamesEnum.Even);
                case "3":
                    Engine.run(nameUser, GamesEnum.Calc);
                case "4":
                    Engine.run(nameUser, GamesEnum.GCD);
                default:
            }


        }
    }
}
