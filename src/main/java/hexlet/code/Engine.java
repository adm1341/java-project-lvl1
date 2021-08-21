package hexlet.code;

import java.util.Random;
import java.util.Scanner;


public class Engine {
    static final int MAX_RANDOM_INT = 100;
    static final int MAX_RANDOM10_INT = 10;
    static final int HOW_MANY_CORRECT_ANSWER = 3;

    public static int getRandomInt() {
        Random r = new Random();
        return r.nextInt(MAX_RANDOM_INT);
    }

    public static int getRandomIn10() {
        Random r = new Random();
        return r.nextInt(MAX_RANDOM10_INT);
    }

    public static String getInputKey() {
        String inPut = "";
        Scanner sc = new Scanner(System.in);
        inPut = sc.next();
        return inPut;
    }

    public static boolean checkWin(int correctAn, String nameUser) {
        if (correctAn == HOW_MANY_CORRECT_ANSWER) {
            System.out.println("Congratulations, " + nameUser + "!");
            return true;
        }
        return false;
    }

    public static void sayCorrect() {
        System.out.println("Correct!");
    }

    public static String getBooleanOfString(boolean bool) {
        if (bool) {
            return "yes";
        } else {
            return "no";
        }

    }
}
