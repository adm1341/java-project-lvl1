package hexlet.code.games;

import hexlet.code.Utils;

import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;

import static hexlet.code.Engine.runInGame;

public class Prime {
    static final int HOW_MANY_QUESTION_GENERATE = 3;
    static final String RULE_GAME = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";

    public static void run() {
        Map<String, String> returnMap = new HashMap<>();
        for (int questionGenerate = 0; questionGenerate < HOW_MANY_QUESTION_GENERATE; questionGenerate++) {
            final int randomInt = Utils.getRandomInt();
            final String question = generateQuestion(randomInt);
            boolean isPrime = generateAnswer(randomInt);

            returnMap.put(question, Utils.booleanToString(isPrime));
        }
        runInGame(returnMap, RULE_GAME);
    }

    public static String generateQuestion(int randomInt) {
        return "Question: " + randomInt;
    }


    private static boolean generateAnswer(int num) {
        if (num == 0) {
            return false;
        }
        BigInteger bigInteger = BigInteger.valueOf(num);
        return bigInteger.isProbablePrime((int) Math.log(num));
    }
}
