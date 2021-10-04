package hexlet.code.games;

import hexlet.code.Engine;

import java.util.HashMap;
import java.util.Map;

import static hexlet.code.Engine.runInGame;

public class GCD {
    static final int HOW_MANY_QUESTION_GENERATE = 3;

    public static void run() {
        final String ruleString = ("Find the greatest common divisor of given numbers.");
        runInGame(generateQuestion(), ruleString);
    }

    public static Map<String, String> generateQuestion() {

        Map<String, String> returnMap = new HashMap<>();
        for (int questionGenerate = 0; questionGenerate <= HOW_MANY_QUESTION_GENERATE; questionGenerate++) {

            final int randomInt1 = Engine.getRandomInt();
            final int randomInt2 = Engine.getRandomInt();
            final String question = "Question: " + randomInt1 + " " + randomInt2;
            final int correctAnswer = mostCommonMultiple(randomInt1, randomInt2);
            returnMap.put(question, String.valueOf(correctAnswer));
        }
        return returnMap;
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
