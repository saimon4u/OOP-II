import java.io.FileNotFoundException;
import java.util.NoSuchElementException;
import java.util.Scanner;
import java.io.File;

public class ReadTextFile {
    private Scanner input;
    public ReadTextFile(String username,String password,String fileName){
        openFile(fileName);
        readData(username,password,fileName);
        closeFile();
    }
    public void  openFile(String fileName){
        try {
            input = new Scanner(new File(fileName));
        }
        catch (FileNotFoundException fileNotFoundException){
            System.err.println("Error opening file");
            System.exit(1);
        }
    }
    public void readData(String username,String password,String fileName){
        String user,pass;
        int highScore;
        try{
            user = input.nextLine();
            pass = input.nextLine();
            highScore = input.nextInt();
            if(user.equals(username) && pass.equals(password)){
                System.out.println("Congratulations Login Successful!");
                closeFile();
                FlappyBird flappyBird = new FlappyBird(username,password,fileName,highScore);
            }
            else{
                System.err.println("Password Mismatch! Try again later");
            }
        }
        catch (NoSuchElementException noSuchElementException){
            System.err.println("File improperly formed");
            input.close();
            System.exit(1);
        }
        catch (IllegalStateException illegalStateException){
            System.err.println("Error reading from file");
            System.exit(1);
        }
    }
    public void closeFile(){
        if(input != null) input.close();
    }
}
