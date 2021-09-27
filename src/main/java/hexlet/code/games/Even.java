package hexlet.code.games;

import hexlet.code.Engine;

import java.util.HashMap;
import java.util.Map;

import static hexlet.code.Engine.runInGame;
import static hexlet.code.Engine.sayString;

public class Even {
    static final int HOW_MANY_QUESTION_GENERATE = 50;

    public static void run(int correctAn, String nameUser) {
        sayString("Answer 'yes' if number even otherwise answer 'no'.");

        runInGame(generateQuestion(), correctAn, nameUser);

    }

    public static Map<String, String> generateQuestion() {
        int questionGenerate = 0;
        Map<String, String> returnMap = new HashMap<>();

        while (true) {
            if (questionGenerate == HOW_MANY_QUESTION_GENERATE) {
                break;
            }
            int randomInt = 0;
            randomInt = Engine.getRandomInt();
            boolean even = randomInt % 2 == 0;
            returnMap.put("Question: " + randomInt, Engine.getBooleanOfString(even));

            questionGenerate += 1;
        }

        return returnMap;


    }


}
