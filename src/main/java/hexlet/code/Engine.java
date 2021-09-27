package hexlet.code;

import java.util.Map;
import java.util.Random;
import java.util.Scanner;


public class Engine {
    static final int MAX_RANDOM_INT = 100;
    static final int MAX_RANDOM10_INT = 10;
    static final int HOW_MANY_CORRECT_ANSWER = 3;

    public static void runInGame(Map<String, String> mapQuestion, int correctAn, String nameUser) {
        for (Map.Entry<String, String> entry : mapQuestion.entrySet()) {
            if (checkWin(correctAn, nameUser)) {
                break;
            }
            if (checkRule(nameUser, entry.getKey(), entry.getValue())) {
                sayCorrect();
                correctAn += 1;
            } else {
                break;
            }
        }
    }

    public static boolean checkRule(String nameUser, String question, String correctAnswer) {

        System.out.println(question);
        System.out.print("Your answer: ");
        String inPut = Engine.getInputKey();

        if (inPut.equals(correctAnswer)) {
            return true;
        } else {
            System.out.println(inPut + " is wrong answer ;(. Correct answer was " + correctAnswer);
            System.out.println("Let's try again, " + nameUser + "!");
            return false;
        }
    }

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

    public static void sayString(String str) {
        System.out.println(str);
    }

    public static String getBooleanOfString(boolean bool) {
        if (bool) {
            return "yes";
        } else {
            return "no";
        }

    }
}
