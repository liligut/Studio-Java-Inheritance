package Quiz;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class QuizRunner {
    private static Quiz quiz;

    public static void main(String[] args) {
       String question;
       ArrayList<String> possibleAnswers;
       ArrayList<Integer> correctAnswers;
       Question question1;
       quiz = new Quiz();

       question = "What is the purpose of inheritance in OOP?";
       possibleAnswers = new ArrayList<String>(Arrays.asList("Reuse code", "Duplicate code", "Organize code") );
       correctAnswers = new ArrayList<Integer>(Arrays.asList(0,2));
       question1 = new MultipleChoice(question,possibleAnswers,correctAnswers);
       quiz.addQuestion(question1);

       question = "What is inheritance in OOP?";
       possibleAnswers = new ArrayList<String>(Arrays.asList("A mechanism where you can to derive a class from another class",
                                                              "Different classes can be used with the same interface",
                                                              "Details of the programming codes are hidden away from the user") );
       correctAnswers = new ArrayList<Integer>(Arrays.asList(0));
       question1 = new Checkbox(question,possibleAnswers,correctAnswers);
       quiz.addQuestion(question1);

        question = "In Inheritance a parent class shares its attributes with a child class";
        possibleAnswers = new ArrayList<String>(Arrays.asList("True",
                "False"));
        correctAnswers = new ArrayList<Integer>(Arrays.asList(0));
        question1 = new TrueFalse(question,possibleAnswers,correctAnswers);
        quiz.addQuestion(question1);

        Scanner scanner = new Scanner(System.in);
        for(Question quizQuestion : quiz.getQuiz()){
            if (quizQuestion instanceof MultipleChoice){
                ((MultipleChoice)quizQuestion).printQuestionAndGetTheUserAnswer(scanner);
            }else if (quizQuestion instanceof Checkbox){
                ((Checkbox)quizQuestion).printQuestionAndGetTheUserAnswer(scanner);
            }else{
                ((TrueFalse)quizQuestion).printQuestionAndGetTheUserAnswer(scanner);
            }
        }
        scanner.close();
        System.out.println(quiz.getResult());


    }
}
