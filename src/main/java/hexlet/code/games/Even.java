package hexlet.code.games;

import hexlet.code.Utils;

import java.util.HashMap;
import java.util.Map;

import static hexlet.code.Engine.runInGame;

public class Even {
    static final int HOW_MANY_QUESTION_GENERATE = 3;
    static final String RULE_GAME = "Answer 'yes' if number even otherwise answer 'no'.";

    public static void run() {
        Map<String, String> returnMap = new HashMap<>();

        for (int questionGenerate = 0; questionGenerate < HOW_MANY_QUESTION_GENERATE; questionGenerate++) {
            final int randomInt = Utils.getRandomInt();
            String correctAnswer = Utils.booleanToString(generateAnswer(randomInt));
            String question = generateQuestion(randomInt);
            returnMap.put(question, correctAnswer);
        }
        runInGame(returnMap, RULE_GAME);
    }

    public static String generateQuestion(int randomInt) {
        return "Question: " + randomInt;
    }

    private static boolean generateAnswer(int randomInt) {
        return randomInt % 2 == 0;
    }

}
