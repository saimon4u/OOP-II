import java.util.Scanner;

public class AssertTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number between 0 and 10: ");
        int number = input.nextInt();
        assert(number>=0 && number<=10): "bad Number: " + number;
        System.out.println("You entered : " + number);
    }
}
