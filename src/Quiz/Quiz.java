package Quiz;

import java.util.ArrayList;

public class Quiz {


    private ArrayList<Question> quiz = new ArrayList<Question>();

    public Quiz() {
    }

    public Quiz(ArrayList<Question> quiz) {
        this.quiz = quiz;
    }

    public void addQuestion(Question question){
        quiz.add(question);
    }
    public ArrayList<Question> getQuiz() {
        return quiz;
    }

    public String getResult(){
        String result = "Results for the Quiz\n";

        for(Question question : quiz){

            result += question;
            result +="The correct answer is\n";
            for (Number option : question.getCorrectAnswers()) {
                result += "option:" + option + "\n";
            }
            if (question.isCorrect()){
                result += "Your answer is correct\n";
            }else{
                result += "Your answer is incorrect\n";
            }
        }
        return result;
    }
}

