import java.util.Stack;

public class Main {
    public static void main(String args[]){
//        try{
//            UsingException.throwException();
//        }
//        catch(Exception exception){
//            System.err.println("Exception handled in main");
//        }



//        try{
//            UsingException.method1();
//        }
//        catch (Exception exception){
//            System.err.printf("%s\n\n",exception.getMessage());
//            exception.printStackTrace();
//            StackTraceElement [] traceElements = exception.getStackTrace();
//            System.out.println("\nStack trace from getStackTrace:");
//            System.out.println("Class\t\tFile\t\t\tLine\tMethod");
//            for(StackTraceElement element : traceElements){
//                System.out.printf("%s\t",element.getClassName());
//                System.out.printf("%s\t",element.getFileName());
//                System.out.printf("%s\t",element.getLineNumber());
//                System.out.printf("%s\n",element.getMethodName());
//            }
//
//        }

        try{
            UsingException.method1();
        }
        catch (Exception exception){
            exception.printStackTrace();
        }
    }
}
