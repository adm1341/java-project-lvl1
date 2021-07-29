package hexlet.code;

import java.util.Scanner;

public class Cli {
    private Scanner sc;

    public Cli(Scanner sc) {
        this.sc = sc;
    }
    public void askAndHello(){
        System.out.println("May I have your name?");

        String name = this.sc.nextLine();

        System.out.println("Hello," + name);

    }

}
