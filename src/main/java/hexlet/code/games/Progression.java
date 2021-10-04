package hexlet.code.games;

import hexlet.code.Engine;

import java.util.HashMap;
import java.util.Map;

import static hexlet.code.Engine.runInGame;

public class Progression {
    static final int MAX_LENGTH_PROG = 9;
    static final int MIN_LENGTH_PROG = 5;
    static final int HOW_MANY_QUESTION_GENERATE = 3;

    public static void run() {
        final String ruleString = ("What number is missing in the progression?");
        runInGame(generateQuestion(), ruleString);
    }

    public static Map<String, String> generateQuestion() {

        Map<String, String> returnMap = new HashMap<>();
        for (int questionGenerate = 0; questionGenerate <= HOW_MANY_QUESTION_GENERATE; questionGenerate++) {

            int beginNumber = Engine.getRandomIn10();
            int difNumber = Engine.getRandomIn10();
            int progLength = randomOfRange(MIN_LENGTH_PROG, MAX_LENGTH_PROG);
            int indexAnswer = randomOfRange(0, progLength);
            StringBuilder stringBuffer = new StringBuilder();
            stringBuffer.append("Question:");
            for (int i = 0; progLength >= i; i++) {
                if (i != indexAnswer) {
                    stringBuffer.append(" ").append(calcProgression(beginNumber, i, difNumber));
                } else {
                    stringBuffer.append(" ..");
                }
            }
            int correctAnswer = calcProgression(beginNumber, indexAnswer, difNumber);
            returnMap.put(stringBuffer.toString(), String.valueOf(correctAnswer));

        }
        return returnMap;
    }


    private static int calcProgression(int begin, int index, int dif) {
        return begin + index * dif;

    }

    public static int randomOfRange(int min, int max) {
        max -= min;
        return (int) (Math.random() * ++max) + min;
    }
}
