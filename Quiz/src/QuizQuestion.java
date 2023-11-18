import java.util.ArrayList;
public class QuizQuestion {
    private ArrayList<String> options;
    private String question;
    private String answer;

    public QuizQuestion(ArrayList<String> options, String question, String answer) {
        this.options = options;
        this.question = question;
        this.answer = answer;
    }

    public String getAnswer() {
        return answer;
    }

    @Override
    public String toString() {
        return
                "Question: " + question + "\n" +
                        "Options: A. " + options.get(0) + " B. " + options.get(1) + " C. " + options.get(2) + " D. " + options.get(3);
    }
}
