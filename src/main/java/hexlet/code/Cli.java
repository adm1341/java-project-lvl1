package hexlet.code;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Cli {
    public static String askAndHello() {

        BufferedReader scAsk = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("May I have your name?");
        String name = null;
        try {
            name = scAsk.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("Hello," + name);

        return name;
    }

}
