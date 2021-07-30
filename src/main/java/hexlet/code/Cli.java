package hexlet.code;

import java.util.Scanner;

public class Cli {
    public static void askAndHello(Scanner scIn) {
        System.out.println("May I have your name?");

        String name = scIn.nextLine();

        System.out.println("Hello," + name);

    }

}
