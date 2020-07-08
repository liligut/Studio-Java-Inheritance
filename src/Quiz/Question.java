package Quiz;

import java.util.ArrayList;
import java.util.Collections;

public abstract class Question {
    private String question;
    private ArrayList<String> possibleAnswers;
    private ArrayList<Integer> correctAnswers;
    private ArrayList<Integer> userAnswerList;

    Question(String question, ArrayList<String> possibleAnswers, ArrayList<Integer> correctAnswers ){
        setQuestion(question);
        setPossibleAnswers(possibleAnswers);
        setCorrectAnswers(correctAnswers);
        userAnswerList = new ArrayList<Integer>();
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public ArrayList<String> getPossibleAnswers() {
        return possibleAnswers;
    }

    public void setPossibleAnswers(ArrayList<String> possibleAnswers) {
        this.possibleAnswers = possibleAnswers;
    }

    public ArrayList<Integer> getCorrectAnswers() {
        return correctAnswers;
    }

    public void setCorrectAnswers(ArrayList<Integer> correctAnswers) {
        this.correctAnswers = correctAnswers;
    }

    public ArrayList<Integer> getUserAnswerList() {
        return userAnswerList;
    }

    public void setUserAnswerList(ArrayList<Integer> userAnswerList) {
        this.userAnswerList = userAnswerList;
    }

    public void addUserAnswer(Integer answer){
        userAnswerList.add(answer);
    }

    public boolean isCorrect(){
        Collections.sort(getCorrectAnswers());
        Collections.sort(userAnswerList);
        return getCorrectAnswers().equals(userAnswerList);

    }


}
