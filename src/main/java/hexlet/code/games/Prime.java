package hexlet.code.games;

import hexlet.code.Engine;

import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;

import static hexlet.code.Engine.runInGame;
import static hexlet.code.Engine.sayString;

public class Prime {
    static final int HOW_MANY_QUESTION_GENERATE = 50;

    public static void run(int correctAn, String nameUser) {
        sayString("Answer 'yes' if given number is prime. Otherwise answer 'no'.");
        runInGame(generateQuestion(), correctAn, nameUser);
    }

    public static Map<String, String> generateQuestion() {
        int questionGenerate = 0;
        Map<String, String> returnMap = new HashMap<>();
        while (true) {
            if (questionGenerate == HOW_MANY_QUESTION_GENERATE) {
                break;
            }
            int randomInt = Engine.getRandomInt();
            String question = "Question: " + randomInt;
            boolean isPrime = isPrime(randomInt);

            returnMap.put(question, Engine.getBooleanOfString(isPrime));
            questionGenerate += 1;
        }
        return returnMap;
    }


    private static boolean isPrime(int num) {
        Integer integer = num;
        BigInteger bigInteger = BigInteger.valueOf(num);
        boolean probablePrime = bigInteger.isProbablePrime((int) Math.log(integer));
        return probablePrime;
    }
}
