package hexlet.code;

import java.util.Random;

public class Utils {
    static final int MAX_RANDOM_INT = 100;

    public static int getRandomInt() {
        Random r = new Random();
        return r.nextInt(MAX_RANDOM_INT);
    }

    public static int getRandomInt(int maxInt) {
        Random r = new Random();
        return r.nextInt(maxInt);
    }

    public static String booleanToString(boolean bool) {
        return (bool) ? "yes" : "no";

    }
}
