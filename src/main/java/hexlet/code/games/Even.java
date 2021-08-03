package hexlet.code.games;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class Even {

    public static void run(String playerName, int howManyCorrectAnswer, int maxRandomInt) {

        System.out.println("Answer 'yes' if number even otherwise answer 'no'.");
        int correctAn = 0;
        int randomInt = 0;
        while (true) {
            if (correctAn == howManyCorrectAnswer) {
                System.out.println("Congratulations, " + playerName);
                break;
            }
            randomInt = getRandom(maxRandomInt);
            System.out.println("Question: " + randomInt);
            boolean even = randomInt % 2 == 0;
            String inPut = getInputKey();
            System.out.println("Your answer: " + inPut);

            if (inPut.equals("yes") && even || inPut.equals("no") && !even) {
                correctAn = correctAn + 1;
                System.out.println("Correct!");
            } else {
                System.out.println(inPut + " is wrong answer ;(. Correct answer was " + getBooleanOfString(even));
                System.out.println("Let's try again, " + playerName);
                break;
            }
        }
    }

    private static int getRandom(int maxRandomInt) {
        Random r = new Random();
        return r.nextInt(maxRandomInt);
    }

    private static String getBooleanOfString(boolean bool) {
        if (bool) {
            return "yes";
        } else {
            return "no";
        }

    }

    private static String getInputKey() {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String inPut = "";
        try {
            inPut = bufferedReader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return inPut;
    }
}
