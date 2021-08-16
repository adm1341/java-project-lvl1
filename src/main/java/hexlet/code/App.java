package hexlet.code;

import hexlet.code.games.Calc;
import hexlet.code.games.Even;
import hexlet.code.games.GCD;
import hexlet.code.games.Prime;
import hexlet.code.games.Progression;

import java.util.Scanner;

public class App {
    static final int HOW_MANY_CORRECT_ANSWER = 3;

    public static void main(String[] args) {
        int choseUser = 0;
        Scanner sc = new Scanner(System.in);
        boolean isInt = false;
        printMenu();
        System.out.print("Your choice: ");
        if (sc.hasNextInt()) {
            choseUser = sc.nextInt();
            isInt = true;
        }
        if (isInt) {
            System.out.println("Welcome to the Brain Games!");
            String nameUser = "";
            int correctAn = 0;
            switch ((Integer.toString(choseUser))) {
                case "0":
                    break;
                case "1":
                    nameUser = Cli.askAndHello();
                    break;
                case "2":
                    nameUser = Cli.askAndHello();
                    System.out.println("Answer 'yes' if number even otherwise answer 'no'.");

                    while (true) {
                        if (correctAn == HOW_MANY_CORRECT_ANSWER) {
                            System.out.println("Congratulations, " + nameUser);
                            break;
                        }
                        boolean returnCheck;
                        returnCheck = Even.checkRuleEven(nameUser);
                        if (returnCheck) {
                            System.out.println("Correct!");
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
                        if (correctAn == HOW_MANY_CORRECT_ANSWER) {
                            System.out.println("Congratulations, " + nameUser);
                            break;
                        }
                        boolean returnCheck;
                        returnCheck = Calc.checkRuleCalc(nameUser);
                        if (returnCheck) {
                            System.out.println("Correct!");
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
                        if (correctAn == HOW_MANY_CORRECT_ANSWER) {
                            System.out.println("Congratulations, " + nameUser);
                            break;
                        }
                        boolean returnCheck;
                        returnCheck = GCD.checkRuleGCD(nameUser);
                        if (returnCheck) {
                            System.out.println("Correct!");
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
                        if (correctAn == HOW_MANY_CORRECT_ANSWER) {
                            System.out.println("Congratulations, " + nameUser);
                            break;
                        }
                        boolean returnCheck;
                        returnCheck = Progression.checkRuleProgression(nameUser);
                        if (returnCheck) {
                            System.out.println("Correct!");
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
                        if (correctAn == HOW_MANY_CORRECT_ANSWER) {
                            System.out.println("Congratulations, " + nameUser);
                            break;
                        }
                        boolean returnCheck;
                        returnCheck = Prime.checkRulePrime(nameUser);
                        if (returnCheck) {
                            System.out.println("Correct!");
                            correctAn += 1;
                        } else {
                            break;
                        }
                    }
                    break;
                default:
                    System.out.println("Неверное значение.");
            }


        } else {
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
