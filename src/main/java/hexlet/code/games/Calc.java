package hexlet.code.games;

import hexlet.code.Utils;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

import static hexlet.code.Engine.runInGame;

public class Calc {
    static final int HOW_MANY_OPERATION = 3;
    static final int HOW_MANY_QUESTION_GENERATE = 3;

    public static void run() {
        final String ruleString = (" What is the result of the expression?");
        runInGame(generateQuestion(), ruleString);

    }

    public static Map<String, String> generateQuestion() {
        Map<String, String> returnMap = new HashMap<>();
        for (int questionGenerate = 0; questionGenerate < HOW_MANY_QUESTION_GENERATE; questionGenerate++) {
            final int randomInt1 = Utils.getRandomInt();
            final int randomInt2 = Utils.getRandomInt();
            final int randomOperation = getRandomOperation();
            int correctAnswer = getCorrectAnswer(randomInt1, randomInt2, randomOperation);
            String question = new StringBuilder().append("Question: ")
                    .append(randomInt1).append(" ")
                    .append(getOperationOfString(randomOperation))
                    .append(" ")
                    .append(randomInt2).toString();
            returnMap.put(question, String.valueOf(correctAnswer));

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
