package hexlet.code;

import hexlet.code.games.Calc;
import hexlet.code.games.Even;
import hexlet.code.games.GCD;
import hexlet.code.games.Prime;
import hexlet.code.games.Progression;

import java.util.Scanner;

public class App {


    public static void main(String[] args) {
        String choseUser = "";
        Scanner sc = new Scanner(System.in);
        printMenu();
        System.out.print("Your choice: ");
        choseUser = sc.next();
        System.out.println();
        System.out.println("Welcome to the Brain Games!");
        String nameUser = "";
        int correctAn = 0;
        switch (choseUser) {
            case "0":
                break;
            case "1":
                nameUser = Cli.askAndHello();
                break;
            case "2":
                nameUser = Cli.askAndHello();
                Even.run(correctAn, nameUser);
                break;
            case "3":
                nameUser = Cli.askAndHello();
                Calc.run(correctAn, nameUser);
                break;
            case "4":
                nameUser = Cli.askAndHello();
                GCD.run(correctAn, nameUser);
                break;
            case "5":
                nameUser = Cli.askAndHello();
                Progression.run(correctAn, nameUser);
                break;
            case "6":
                nameUser = Cli.askAndHello();
                Prime.run(correctAn, nameUser);
                break;
            default:
                System.out.println("Неверное значение.");
        }


    }

    private static void printMenu() {
        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("3 - Calc");
        System.out.println("4 - GCD");
        System.out.println("5 - Progression");
        System.out.println("6 - Prime");
        System.out.println("0 - Exit");
    }
}
