package hexlet.code;

import java.util.Scanner;


public class Cli {
    public static String askAndHello() {
        System.out.print("May I have your name? ");
        String name = null;
        Scanner sc = new Scanner(System.in);
        name = sc.next();
        System.out.println("Hello, " + name + "!");

        return name;
    }

}
