package hexlet.code.games;

import hexlet.code.Engine;

import java.util.HashMap;
import java.util.Map;

import static hexlet.code.Engine.runInGame;
import static hexlet.code.Engine.sayString;

public class GCD {
    static final int HOW_MANY_QUESTION_GENERATE = 50;

    public static void run(int correctAn, String nameUser) {
        sayString("Find the greatest common divisor of given numbers.");
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
            randomInt1 = Engine.getRandomInt();
            randomInt2 = Engine.getRandomInt();
            String question = "Question: " + randomInt1 + " " + randomInt2;
            int correctAnswer = mostCommonMultiple(randomInt1, randomInt2);
            returnMap.put(question, String.valueOf(correctAnswer));
            questionGenerate += 1;
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
