package Quiz;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Checkbox extends Question {

    Checkbox(String question, ArrayList<String> possibleAnswers, ArrayList<Integer> correctAnswers) {
        super(question, possibleAnswers, correctAnswers);
    }

    @Override
    public String toString() {
        String toString = "Enter the correct choice (Only one is correct):\n"+ getQuestion()+"\n";
        int i = 0;
        for (String possibleAnswer : getPossibleAnswers()){
            toString += i+": "+possibleAnswer+"\n";
            i++;
        }
        return toString;
    }

    public void printQuestionAndGetTheUserAnswer(Scanner scanner){
        System.out.println(toString());
        if (scanner.hasNextInt()) {
            Integer userAnswer = scanner.nextInt();
            addUserAnswer(userAnswer);
        }
    }

}
