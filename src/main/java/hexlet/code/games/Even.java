package hexlet.code.games;

import hexlet.code.Engine;

import static hexlet.code.Engine.checkWin;
import static hexlet.code.Engine.sayCorrect;

public class Even {


    public static void run(int correctAn, String nameUser) {
        System.out.println(" What is the result of the expression?");
        while (true) {
            if (checkWin(correctAn, nameUser)) {
                break;
            }
            if (checkRuleEven(nameUser)) {
                sayCorrect();
                correctAn += 1;
            } else {
                break;
            }
        }
    }

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
            System.out.println("Let's try again, " + playerName + "!");
            return false;
        }
    }


}
