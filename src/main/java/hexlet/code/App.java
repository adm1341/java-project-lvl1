package hexlet.code;

import hexlet.code.games.Even;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        int choseUser = 0;
        Scanner sc = new Scanner(System.in);
        boolean exit = false;
        boolean exitWhile = false;
        while (!exitWhile) {
            System.out.println("Please enter the game number and press Enter. \n1 - Greet \n2 - Even \n0 - Exit");
            if (sc.hasNextInt()) {
                choseUser = sc.nextInt();
                switch (choseUser) {
                    case 0:
                        exitWhile = true;
                        exit = true;
                        break;
                    case 1:
                    case 2:
                        exitWhile = true;
                        break;
                    default:
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
            switch (choseUser) {
                case 2:
                    int howManyCorrectAnswer = 3;
                    int maxRandomInt = 100;
                    Even.run(nameUser, howManyCorrectAnswer, maxRandomInt);
                default:
            }


        }
    }
}
