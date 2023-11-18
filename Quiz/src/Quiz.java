import java.io.File;
import java.util.*;
public class Quiz{
    public static ArrayList <QuizQuestion> questionList;
    private Scanner scanner;

    public ArrayList<QuizQuestion> getQuestionList() {
        return questionList;
    }

    public Quiz(){
        questionList = new ArrayList<>();
        String question,answer,options;
        try{
            File file = new File("Files/Questions.txt");
            scanner = new Scanner(file);
            ArrayList<String> optionList;
            while(scanner.hasNext()){
                optionList = new ArrayList<>();
                question = scanner.nextLine();
                options = scanner.nextLine();
                answer = scanner.nextLine();
                question = processString(question);
                answer = processString(answer);
                options = processString(options);
                optionList = processOption(options);
                QuizQuestion quizQuestion = new QuizQuestion(optionList,question,answer);
                questionList.add(quizQuestion);
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
    public ArrayList<String> processOption(String options){
        List <String> list = new ArrayList<>();
        ArrayList<String> result = new ArrayList<>();
        list = Arrays.asList(options.split(" "));
        for(int i=0; i<list.size(); i++){
            if(list.get(i).equals("A.") || list.get(i).equals("B.") || list.get(i).equals("C.") || list.get(i).equals("D.") || list.get(i).equals("")) continue;
            else result.add(list.get(i));
        }
        return result;
    }
    public String processString(String str){
        List <String> list = new ArrayList<>();
        list = Arrays.asList(str.split(":",-1));
        str = list.get(1).trim();
        return str;
    }
}
