import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int choice;
        Authentication authentication = new Authentication();
        System.out.println("Welcome to Flappy Bird Game!");
        System.out.println("1.Login if you have an account already.");
        System.out.println("2.Register if you don't have any.");
        System.out.println("3.Exit!");
        System.out.print("Enter your choice: ");
        choice = input.nextInt();
        if(choice == 1){
            authentication.Login();
        }
        else if(choice == 2){
            authentication.Register();
        }
    }
}