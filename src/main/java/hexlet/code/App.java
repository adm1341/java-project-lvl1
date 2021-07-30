package hexlet.code;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.println("Welcome to the Brain Games!");
        Scanner scIn = new Scanner(System.in);
        Cli.askAndHello(scIn);
    }
}
