package Quiz;

import java.util.ArrayList;
import java.util.Scanner;

public class TrueFalse extends Question{
    TrueFalse(String question, ArrayList<String> possibleAnswers, ArrayList<Integer> correctAnswers) {
        super(question, possibleAnswers, correctAnswers);
    }

    @Override
    public String toString() {
        String toString = "Enter the correct choice (True or False):\n"+ getQuestion()+"\n";
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
