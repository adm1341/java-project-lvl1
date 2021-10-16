package hexlet.code;

import java.util.Map;
import java.util.Scanner;


public class Engine {
    public static void runInGame(Map<String, String> mapQuestion, String ruleString) {
        System.out.print("May I have your name? ");
        Scanner sc = new Scanner(System.in);
        final String nameUser = sc.next();
        System.out.println("Hello, " + nameUser + "!");

        System.out.println(ruleString);

        for (Map.Entry<String, String> entry : mapQuestion.entrySet()) {

            System.out.println(entry.getKey());
            System.out.print("Your answer: ");
            Scanner scanner = new Scanner(System.in);
            String inPut = scanner.next();

            if (inPut.equals(entry.getValue())) {
                System.out.println("Correct!");
            } else {
                System.out.println(inPut + " is wrong answer ;(. Correct answer was " + entry.getValue());
                System.out.println("Let's try again, " + nameUser + "!");
                return;
            }
        }
        System.out.println("Congratulations, " + nameUser + "!");
    }


}
