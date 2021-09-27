package hexlet.code.games;

import hexlet.code.Engine;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

import static hexlet.code.Engine.runInGame;
import static hexlet.code.Engine.sayString;

public class Calc {
    static final int HOW_MANY_OPERATION = 3;
    static final int HOW_MANY_QUESTION_GENERATE = 50;

    public static void run(int correctAn, String nameUser) {
        sayString(" What is the result of the expression?");
        runInGame(generateQuestion(), correctAn, nameUser);

    }

    public static Map<String, String> generateQuestion() {
        int questionGenerate = 0;
        Map<String, String> returnMap = new HashMap<>();
        while (true) {
            if (questionGenerate == HOW_MANY_QUESTION_GENERATE) {
                break;
            }
            int randomInt1 = 0;
            int randomInt2 = 0;
            int randomOperation = 0;
            randomInt1 = Engine.getRandomInt();
            randomInt2 = Engine.getRandomInt();
            randomOperation = getRandomOperation();
            int correctAnswer = getCorrectAnswer(randomInt1, randomInt2, randomOperation);
            String question;
            question = "Question: " + randomInt1 + " " + getOperationOfString(randomOperation) + " " + randomInt2;
            returnMap.put(question, String.valueOf(correctAnswer));

            questionGenerate += 1;
        }
        return returnMap;
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
