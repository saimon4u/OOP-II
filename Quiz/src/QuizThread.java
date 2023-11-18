import java.io.*;
import java.net.Socket;
import java.util.Random;
import java.util.Scanner;
public class QuizThread extends Thread{
    protected Socket client;
    private Scanner input;
    private PrintStream result;
    private Random random;
    private int score = 0;
    private String userName;
    private double closeValue = 404;
    public QuizThread(Socket clientSocket) {
        this.client = clientSocket;
        random = new Random();
    }
    public void run(){
        int i=0;
        try {
            input = new Scanner(client.getInputStream());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        userName = input.nextLine();
        while(i<Quiz.questionList.size()){
            QuizQuestion quizQuestion = Quiz.questionList.get(i);
            try{
                result = new PrintStream(client.getOutputStream());
                result.println(quizQuestion);
                String answer = input.nextLine();
                if(quizQuestion.getAnswer().equals(answer)){
                    result.println(userName + " your answer is correct!");
                    result.println(userName + " your score is: " + (score+=5));
                }
                else{
                    result.println("Opppppspspsppspsspspspss");
                    result.println(userName + " your score is: " + (score));
                    result.println(closeValue);
                    input.close();
                    result.close();
                    client.close();
                }
            }catch (IOException e){
                return;
            }
            catch (Exception e){
                return;
            }
            i++;
        }
    }
}