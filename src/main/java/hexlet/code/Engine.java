package hexlet.code;

import java.util.Map;
import java.util.Scanner;


public class Engine {
    public static boolean runInGame(Map<String, String> mapQuestion, String ruleString) {
        System.out.print("May I have your name? ");
        Scanner sc = new Scanner(System.in);
        final String nameUser = sc.next();
        System.out.println("Hello, " + nameUser + "!");

        System.out.println(ruleString);

        for (Map.Entry<String, String> entry : mapQuestion.entrySet()) {
            if (checkRule(nameUser, entry.getKey(), entry.getValue())) {
                System.out.println("Correct!");
            } else {
                return false;
            }
        }
        System.out.println("Congratulations, " + nameUser + "!");

        return true;
    }

    public static boolean checkRule(String nameUser, String question, String correctAnswer) {

        System.out.println(question);
        System.out.print("Your answer: ");
        Scanner sc = new Scanner(System.in);
        String inPut = sc.next();

        if (inPut.equals(correctAnswer)) {
            return true;
        } else {
            System.out.println(inPut + " is wrong answer ;(. Correct answer was " + correctAnswer);
            System.out.println("Let's try again, " + nameUser + "!");
            return false;
        }
    }

}
