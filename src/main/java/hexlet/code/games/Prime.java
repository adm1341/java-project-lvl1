package hexlet.code.games;

import hexlet.code.Engine;

import java.math.BigInteger;

public class Prime {
    public static boolean checkRulePrime(String playerName) {
        int randomInt = Engine.getRandomInt();
        System.out.println("Question: " + randomInt);
        boolean isPrime = isPrime(randomInt);
        System.out.print("Your answer: " );
        String inPut = Engine.getInputKey();


        if (inPut.equals("yes") && isPrime || inPut.equals("no") && !isPrime) {
            return true;
        } else {
            System.out.println(inPut + " is wrong answer ;(. Correct answer was " + Engine.getBooleanOfString(isPrime));
            System.out.println("Let's try again, " + playerName);
            return false;
        }
    }

    private static boolean isPrime(int num) {
        Integer integer = num;
        BigInteger bigInteger = BigInteger.valueOf(num);
        boolean probablePrime = bigInteger.isProbablePrime((int) Math.log(integer));
        return probablePrime;
    }
}
