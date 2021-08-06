package hexlet.code;

import hexlet.code.games.Calc;
import hexlet.code.games.Even;
import hexlet.code.games.GamesEnum;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;


public class Engine {
    static final int HOW_MANY_CORRECT_ANSWER = 3;
    static final int MAX_RANDOM_INT = 100;

    public static void run(String playerName, GamesEnum gamesEnum) {

        boolean isEven = gamesEnum.equals(GamesEnum.Even);
        boolean isCalc = gamesEnum.equals(GamesEnum.Calc);
        if (isEven) {
            System.out.println("Answer 'yes' if number even otherwise answer 'no'.");
        } else if (isCalc) {
            System.out.println(" What is the result of the expression?");
        }
        int correctAn = 0;

        while (true) {
            if (correctAn == HOW_MANY_CORRECT_ANSWER) {
                System.out.println("Congratulations, " + playerName);
                break;
            }
            boolean returnCheck = false;
            if (isEven) {
                returnCheck = Even.checkRuleEven(playerName);
            } else if (isCalc) {
                returnCheck = Calc.checkRuleCalc(playerName);
            }
            if (returnCheck) {
                System.out.println("Correct!");
                correctAn += 1;
            } else {
                break;
            }
        }

    }

    public static int getRandomInt() {
        Random r = new Random();
        return r.nextInt(MAX_RANDOM_INT);
    }

    public static String getInputKey() {
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