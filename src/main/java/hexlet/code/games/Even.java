package hexlet.code.games;

import hexlet.code.Engine;

import java.util.HashMap;
import java.util.Map;

import static hexlet.code.Engine.runInGame;

public class Even {
    static final int HOW_MANY_QUESTION_GENERATE = 3;

    public static void run() {
        final String ruleString = ("Answer 'yes' if number even otherwise answer 'no'.");

        runInGame(generateQuestion(), ruleString);

    }

    public static Map<String, String> generateQuestion() {

        Map<String, String> returnMap = new HashMap<>();

        for (int questionGenerate = 0; questionGenerate <= HOW_MANY_QUESTION_GENERATE; questionGenerate++) {
            final int randomInt = Engine.getRandomInt();
            boolean even = randomInt % 2 == 0;
            returnMap.put("Question: " + randomInt, Engine.getBooleanOfString(even));
        }

        return returnMap;


    }


}
