package quiz;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class QuizApp {

    public static void main(String[] args) {

        List<QuizQuestion> question = new ArrayList<>();
        question.add(new QuizQuestion("Which of the following is not a primitive data type?", Arrays.asList("int", "float", "String", "boolean"), 2));
        question.add(new QuizQuestion("Which keyword is used to create a class in Java?", Arrays.asList("class", "object", "new", "define"), 0));
        question.add(new QuizQuestion("What is the default value of a boolean variable in Java?", Arrays.asList("true", "false", "0", "null"), 1));
        question.add(new QuizQuestion("Which method is the entry point of any Java program?", Arrays.asList("start()", "main()", "run()", "init()"), 1));
        question.add(new QuizQuestion("Which of the following is used to handle exceptions in Java?", Arrays.asList("exception-block", "throw-catch", "error-handler", "try-catch"), 3));

        Scanner sc = new Scanner(System.in);
        int score = 0;
        System.out.println("Welcome to the Java Quiz !!! \n");

        for (int i = 0; i < question.size(); i++) {
            QuizQuestion q = question.get(i);
            System.out.println("Q" + (i + 1) + ": " + q.getQuestion());
            List<String> options = q.getOptions();

            for (int j = 0; j < options.size(); j++) {
                System.out.println((j + 1) + ". " + options.get(j));
            }

            System.out.print("Enter your answer (1-" + options.size() + "): ");
            String input = sc.nextLine();

            int select;
            try {
                select = Integer.parseInt(input) - 1;
            } catch (Exception e) {
                select = -1;
            }

            if (select == q.getCorrectoption()) {
                score++;
                System.out.println("Correct Answer. \n");
            } else {
                System.out.println("Incorrect Answer. \n");
            }
        }

        System.out.println("Your Score is: " + score + " out of " + question.size());
        System.out.println("Thank you for writting the test. Thank You !!!");
        sc.close();
    }
}
