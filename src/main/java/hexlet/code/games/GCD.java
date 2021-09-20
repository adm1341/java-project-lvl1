package hexlet.code.games;

import hexlet.code.Engine;

import static hexlet.code.Engine.checkWin;
import static hexlet.code.Engine.sayCorrect;

public class GCD {
    public static void run(int correctAn, String nameUser) {
        System.out.println("Find the greatest common divisor of given numbers.");
        while (true) {
            if (checkWin(correctAn, nameUser)) {
                break;
            }
            if (checkRuleGCD(nameUser)) {
                sayCorrect();
                correctAn += 1;
            } else {
                break;
            }
        }
    }

    public static boolean checkRuleGCD(String playerName) {
        int randomInt1 = 0;
        int randomInt2 = 0;
        randomInt1 = Engine.getRandomInt();
        randomInt2 = Engine.getRandomInt();

        System.out.println("Question: " + randomInt1 + " " + randomInt2);
        int correctAnswer = mostCommonMultiple(randomInt1, randomInt2);
        System.out.print("Your answer: ");
        String inPut = Engine.getInputKey();

        if (inPut.equals(Integer.toString(correctAnswer))) {
            return true;
        } else {
            System.out.println(inPut + " is wrong answer ;(. Correct answer was " + correctAnswer);
            System.out.println("Let's try again, " + playerName + "!");
            return false;
        }

    }

    private static int mostCommonMultiple(int x, int y) {
        while (x != 0 && y != 0) {
            if (x > y) {
                x = x % y;
            } else {
                y = y % x;
            }
        }
        return x + y;
    }
}
