import java.io.File;
import java.util.Scanner;

public class Authentication {
    Scanner input;
    public void Login(){
        String username,password,path;
        input = new Scanner(System.in);
        System.out.println("Welcome to the Login Page!!\n");
        System.out.print("Enter Your Username: ");
        username = input.nextLine();
        path = "Data/" + username + ".txt";
        File name = new File(path);
        if(!name.exists()){
            System.err.println("There is no user with this username!!");
            return;
        }
        System.out.print("Enter Your Password: ");
        password = input.nextLine();
        ReadTextFile readTextFile = new ReadTextFile(username,password,path);
    }
    public void Register(){
        String username,password,path;
        input = new Scanner(System.in);
        System.out.println("Welcome to the Account Registration page!!\n");
        System.out.print("Enter Your Username: ");
        username = input.nextLine();
        path = "Data/" + username + ".txt";
        File name = new File(path);
        if(name.exists()){
            System.err.println("A user is already registered with this username!!");
            return;
        }
        System.out.print("Enter Your Password: ");
        password = input.nextLine();
        CreateTextFile createTextFile = new CreateTextFile(username,password,path,0);
        System.out.println("Congratulations Registration Complete!!");
        System.out.println("Now feel free to login and play the game!");
        Login();
    }
}
