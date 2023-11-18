import java.util.InputMismatchException;
import java.util.Scanner;

public class CustomExceptionTest {
    public static void main(String[] args) {
        int val = 1;
        Scanner scanner = new Scanner(System.in);
        try{
            System.out.print("Enter a integer number greater than 10: ");
            val = scanner.nextInt();
            if(val < 10) throw new MyException("Input must be greater than 10");
        }
        catch(InputMismatchException e){
            e.printStackTrace();
        }
        catch(MyException e){
            e.printStackTrace();
        }
        finally{
            System.out.println("You entered: " + val);
        }
    }
}
