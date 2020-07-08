package Quiz;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class MultipleChoice extends Question {

    MultipleChoice(String question, ArrayList<String> possibleAnswers, ArrayList<Integer> correctAnswers) {
        super(question, possibleAnswers, correctAnswers);
    }

    @Override
    public String toString() {
        String toString = "Enter the correct choices (more than one could be correct):\n"+ getQuestion()+"\n";
        int i = 0;
        for (String possibleAnswer : getPossibleAnswers()){
            toString += i+": "+possibleAnswer+"\n";
            i++;
        }
        return toString;
    }

    public void printQuestionAndGetTheUserAnswer(Scanner scanner){
        System.out.println(toString());
        while (scanner.hasNextInt()) {
            Integer userAnswer = scanner.nextInt();
            addUserAnswer(userAnswer);
            System.out.println("Enter other answer or type any character to exit");
        }
       scanner.next();
    }
}
