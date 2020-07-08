package Quiz;

import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;


import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

public class MultipleChoiceTest {
    private String question;
    private ArrayList<String> possibleAnswers;
    private ArrayList<Integer> correctAnswers;
    MultipleChoice question1;
    @Before
    public void initializeValues(){
        question = "What is the purpose of inheritance in OOP?";
        possibleAnswers = new ArrayList<String>(Arrays.asList("Reuse code ", "Duplicate code", "Organize code") );
        correctAnswers = new ArrayList<Integer>(Arrays.asList(0,2));
        question1 = new MultipleChoice(question,possibleAnswers,correctAnswers);
    }
    @Test
    public void testIsCorrectMethod(){
        Assertions.assertTrue(question1.isCorrect());
    }



}