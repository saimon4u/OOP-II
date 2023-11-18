import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
public class QuizServer{
    public static void main(String[] args) throws Exception{
        new Quiz();
        ServerSocket serverSocket = new ServerSocket(1400);
        System.out.println("Server running on port: " + serverSocket.getLocalPort());
        Socket client = null;
        while(true){
            try{
                client=serverSocket.accept();
            }
            catch(IOException e) {
                System.out.println("I/O error: " + e);
            }
            new QuizThread(client).start();
        }
    }
}