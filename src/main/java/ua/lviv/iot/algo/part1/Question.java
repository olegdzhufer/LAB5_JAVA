package ua.lviv.iot.algo.part1;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Question {
    public static void main(final String[] args) {
        Question question = new Question();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter text: ");
        final String text = scanner.nextLine();
        System.out.println("Enter line: ");
        final String q = scanner.nextLine();
        StringBuilder result = question.remove(text, q);
        System.out.println(result);
        scanner.close();
    }

    public StringBuilder remove(final String text, final String q) {
        if (text == null) {
            return new StringBuilder();
        }
        String[] sentencesArray = text.split("(?<=[.!?])");
        StringBuilder resultBuilder = new StringBuilder();
        Pattern p = Pattern.compile(q);
        for (String sentence : sentencesArray) {
            Matcher m = p.matcher(sentence);
            String lastChar = sentence.substring(sentence.length() - 1);
            if (m.find()) {
                if (lastChar.equals("?")) {
                    sentence = "";
                    resultBuilder.append(sentence);
                } else {
                    resultBuilder.append(sentence);
                }
            } else {
                resultBuilder.append(sentence);
            }
        }
        return resultBuilder;
    }
}
