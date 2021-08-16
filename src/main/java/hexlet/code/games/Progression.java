package hexlet.code.games;

import hexlet.code.Engine;

public class Progression {
    static final int MAX_LENGTH_PROG = 9;
    static final int MIN_LENGTH_PROG = 5;

    public static boolean checkRuleProgression(String playerName) {
        int beginNumber = Engine.getRandomIn10();
        int difNumber = Engine.getRandomIn10();
        int progLength = randomOfRange(MIN_LENGTH_PROG, MAX_LENGTH_PROG);
        int indexAnswer = randomOfRange(0, progLength);
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("Question:");
        for (int i = 0; progLength >= i; i++) {
            if (i != indexAnswer) {
                stringBuffer.append(" " + calcProgression(beginNumber, i, difNumber));
            } else {
                stringBuffer.append(" ..");
            }
        }
        System.out.println(stringBuffer);
        int correctAnswer = calcProgression(beginNumber, indexAnswer, difNumber);
        System.out.print("Your answer: ");
        String inPut = Engine.getInputKey();


        if (inPut.equals(Integer.toString(correctAnswer))) {
            return true;
        } else {
            System.out.println(inPut + " is wrong answer ;(. Correct answer was " + correctAnswer);
            System.out.println("Let's try again, " + playerName + "!");
            return false;
        }

    }

    private static int calcProgression(int begin, int index, int dif) {
        return begin + index * dif;

    }

    public static int randomOfRange(int min, int max) {
        max -= min;
        return (int) (Math.random() * ++max) + min;
    }
}
