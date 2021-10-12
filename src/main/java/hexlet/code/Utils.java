package hexlet.code;

import java.util.Random;

public class Utils {
    static final int MAX_RANDOM_INT = 100;
    static final int MAX_RANDOM10_INT = 10;

    public static int getRandomInt() {
        Random r = new Random();
        return r.nextInt(MAX_RANDOM_INT);
    }

    public static int getRandomIn10() {
        Random r = new Random();
        return r.nextInt(MAX_RANDOM10_INT);
    }

    public static String getBooleanOfString(boolean bool) {
        if (bool) {
            return "yes";
        } else {
            return "no";
        }

    }
}
