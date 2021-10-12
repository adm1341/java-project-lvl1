package hexlet.code.games;

import hexlet.code.Utils;

import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;

import static hexlet.code.Engine.runInGame;

public class Prime {
    static final int HOW_MANY_QUESTION_GENERATE = 3;

    public static void run() {
        final String ruleString = ("Answer 'yes' if given number is prime. Otherwise answer 'no'.");
        runInGame(generateQuestion(), ruleString);
    }

    public static Map<String, String> generateQuestion() {

        Map<String, String> returnMap = new HashMap<>();
        for (int questionGenerate = 0; questionGenerate < HOW_MANY_QUESTION_GENERATE; questionGenerate++) {
            final int randomInt = Utils.getRandomInt();
            final String question = "Question: " + randomInt;
            boolean isPrime = isPrime(randomInt);

            returnMap.put(question, Utils.getBooleanOfString(isPrime));
        }
        return returnMap;
    }


    private static boolean isPrime(int num) {
        if (num == 0) {
            return false;
        }
        BigInteger bigInteger = BigInteger.valueOf(num);
        return bigInteger.isProbablePrime((int) Math.log(num));
    }
}
