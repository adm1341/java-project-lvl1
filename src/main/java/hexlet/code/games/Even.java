package hexlet.code.games;

import hexlet.code.Engine;

public class Even {


    public static boolean checkRuleEven(String playerName) {
        int randomInt = 0;
        randomInt = Engine.getRandomInt();
        System.out.println("Question: " + randomInt);
        boolean even = randomInt % 2 == 0;
        System.out.print("Your answer: ");
        String inPut = Engine.getInputKey();

        if (inPut.equals("yes") && even || inPut.equals("no") && !even) {
            return true;
        } else {
            System.out.println(inPut + " is wrong answer ;(. Correct answer was " + Engine.getBooleanOfString(even));
            System.out.println("Let's try again, " + playerName);
            return false;
        }
    }


}
