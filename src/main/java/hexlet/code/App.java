package hexlet.code;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.println("Welcome to the Brain Games!");
        Cli cli = new Cli( new Scanner(System.in));
        cli.askAndHello();
    }
}
