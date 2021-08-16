package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;

public class Calc {
    static final int HOW_MANY_OPERATION = 3;

    public static boolean checkRuleCalc(String playerName) {
        int randomInt1 = 0;
        int randomInt2 = 0;
        int randomOperation = 0;
        randomInt1 = Engine.getRandomInt();
        randomInt2 = Engine.getRandomInt();
        randomOperation = getRandomOperation();

        System.out.println("Question: " + randomInt1 + getOperationOfString(randomOperation) + randomInt2);
        int correctAnswer = getCorrectAnswer(randomInt1, randomInt2, randomOperation);
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

    private static int getRandomOperation() {
        Random r = new Random();
        return r.nextInt(HOW_MANY_OPERATION);
    }

    private static String getOperationOfString(int operation) {
        switch (operation) {
            case 0:
                return "+";
            case 1:
                return "-";
            case 2:
                return "*";
            default:
                return "";
        }
    }

    private static int getCorrectAnswer(int randomInt1, int randomInt2, int operation) {
        switch (operation) {
            case 0:
                return randomInt1 + randomInt2;
            case 1:
                return randomInt1 - randomInt2;
            case 2:
                return randomInt1 * randomInt2;
            default:
                return 0;
        }
    }
}
