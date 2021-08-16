package hexlet.code;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;


public class Engine {
    static final int MAX_RANDOM_INT = 100;

    public static int getRandomInt() {
        Random r = new Random();
        return r.nextInt(MAX_RANDOM_INT);
    }

    public static String getInputKey() {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String inPut = "";
        try {
            inPut = bufferedReader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return inPut;
    }

    public static String getBooleanOfString(boolean bool) {
        if (bool) {
            return "yes";
        } else {
            return "no";
        }

    }
}
