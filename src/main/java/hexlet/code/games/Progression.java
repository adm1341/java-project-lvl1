package hexlet.code.games;

import hexlet.code.Utils;

import java.util.HashMap;
import java.util.Map;

import static hexlet.code.Engine.runInGame;

public class Progression {
    static final int MAX_LENGTH_PROG = 9;
    static final int MIN_LENGTH_PROG = 5;
    static final int HOW_MANY_QUESTION_GENERATE = 3;
    static final int MAX_RANDOM10_INT = 10;
    static final String RULE_GAME = "What number is missing in the progression?";

    public static void run() {
        Map<String, String> returnMap = new HashMap<>();
        for (int questionGenerate = 0; questionGenerate < HOW_MANY_QUESTION_GENERATE; questionGenerate++) {

            int beginNumber = Utils.getRandomInt(MAX_RANDOM10_INT);
            int difNumber = Utils.getRandomInt(MAX_RANDOM10_INT);
            int progLength = randomOfRange(MIN_LENGTH_PROG, MAX_LENGTH_PROG);
            int indexAnswer = randomOfRange(0, progLength);

            String question = generateQuestion(beginNumber, difNumber, progLength, indexAnswer);
            int correctAnswer = calcProgression(beginNumber, indexAnswer, difNumber);
            returnMap.put(question, String.valueOf(correctAnswer));

        }

        runInGame(returnMap, RULE_GAME);
    }

    public static String generateQuestion(int beginNumber, int difNumber, int progLength, int indexAnswer) {
        StringBuilder stringBuffer = new StringBuilder();
        stringBuffer.append("Question:");
        for (int i = 0; progLength >= i; i++) {
            if (i != indexAnswer) {
                stringBuffer.append(" ").append(calcProgression(beginNumber, i, difNumber));
            } else {
                stringBuffer.append(" ..");
            }
        }
        return stringBuffer.toString();
    }


    private static int calcProgression(int begin, int index, int dif) {
        return begin + index * dif;

    }

    public static int randomOfRange(int min, int max) {
        max -= min;
        return (int) (Math.random() * ++max) + min;
    }
}
