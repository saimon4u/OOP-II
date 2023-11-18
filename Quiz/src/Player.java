import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;
public class Player{
    public static Scanner receiver;
    public static PrintStream toServer;
    public static Scanner input;
    public static void main(String[] args) throws Exception{
        Socket server = new Socket("127.0.0.1",1400);
        int i=0;
        receiver=new Scanner(server.getInputStream());
        toServer = new PrintStream(server.getOutputStream());
        input = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = input.nextLine();
        toServer.println(name);
        while (true){
            if(receiver.hasNextDouble()){
                System.out.println("Game Over" + "\n" + "UwU");
                receiver.close();
                toServer.close();
                server.close();
                break;
            }
            String question,options;
            question = receiver.nextLine();
            options = receiver.nextLine();
            System.out.println(question + "\n" + options);
            System.out.print("Choose the answer: ");
            String answer = input.nextLine();
            toServer.println(answer);
            String output = receiver.nextLine();
            String score = receiver.nextLine();
            System.out.println(output);
            System.out.println(score);
            i++;
        }
    }
}