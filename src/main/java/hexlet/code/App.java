package hexlet.code;

import hexlet.code.games.Calc;
import hexlet.code.games.Even;
import hexlet.code.games.GCD;
import hexlet.code.games.Prime;
import hexlet.code.games.Progression;

import java.util.Scanner;

import static hexlet.code.Engine.checkWin;
import static hexlet.code.Engine.sayCorrect;

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
                System.out.println("Answer 'yes' if number even otherwise answer 'no'.");

                while (true) {
                    if (checkWin(correctAn, nameUser)) {
                        break;
                    }
                    if (Even.checkRuleEven(nameUser)) {
                        sayCorrect();
                        correctAn += 1;
                    } else {
                        break;
                    }
                }
                break;
            case "3":
                nameUser = Cli.askAndHello();
                System.out.println(" What is the result of the expression?");
                while (true) {
                    if (checkWin(correctAn, nameUser)) {
                        break;
                    }
                    if (Calc.checkRuleCalc(nameUser)) {
                        sayCorrect();
                        correctAn += 1;
                    } else {
                        break;
                    }
                }
                break;
            case "4":
                nameUser = Cli.askAndHello();
                System.out.println("Find the greatest common divisor of given numbers.");
                while (true) {
                    if (checkWin(correctAn, nameUser)) {
                        break;
                    }
                    if (GCD.checkRuleGCD(nameUser)) {
                        sayCorrect();
                        correctAn += 1;
                    } else {
                        break;
                    }
                }
                break;
            case "5":
                nameUser = Cli.askAndHello();
                System.out.println("What number is missing in the progression?");
                while (true) {
                    if (checkWin(correctAn, nameUser)) {
                        break;
                    }
                    if (Progression.checkRuleProgression(nameUser)) {
                        sayCorrect();
                        correctAn += 1;
                    } else {
                        break;
                    }
                }
                break;
            case "6":
                nameUser = Cli.askAndHello();
                System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'.");
                while (true) {
                    if (checkWin(correctAn, nameUser)) {
                        break;
                    }
                    if (Prime.checkRulePrime(nameUser)) {
                        sayCorrect();
                        correctAn += 1;
                    } else {
                        break;
                    }
                }
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
