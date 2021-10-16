package hexlet.code.games;

import hexlet.code.Utils;

import java.util.HashMap;
import java.util.Map;

import static hexlet.code.Engine.runInGame;

public class GCD {
    static final int HOW_MANY_QUESTION_GENERATE = 3;
    static final String RULE_GAME = "Find the greatest common divisor of given numbers.";

    public static void run() {
        Map<String, String> returnMap = new HashMap<>();
        for (int questionGenerate = 0; questionGenerate < HOW_MANY_QUESTION_GENERATE; questionGenerate++) {

            final int randomInt1 = Utils.getRandomInt();
            final int randomInt2 = Utils.getRandomInt();

            final int correctAnswer = generateAnswer(randomInt1, randomInt2);
            final String question = generateQuestion(randomInt1, randomInt2);
            returnMap.put(question, String.valueOf(correctAnswer));

        }
        runInGame(returnMap, RULE_GAME);
    }

    public static String generateQuestion(int randomInt1, int randomInt2) {
        return "Question: " + randomInt1 + " " + randomInt2;
    }

    private static int generateAnswer(int x, int y) {
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
