import java.security.PublicKey;

public class UsingException {
    public static void throwException() throws Exception{
        try{
            System.out.println("Method throwException");
            throw new Exception();
        }
        catch (RuntimeException runtimeException){
            System.err.println("Exception handled in method throwException");
        }
        finally {
            System.err.println("Finally is always executed");;
        }
    }
//    public static void method1() throws Exception{
//        method2();
//    }
//    public static void method2() throws Exception{
//        method3();
//    }
//    public static void method3() throws Exception{
//        throw new Exception("Exception thrown in method3");
//    }
    public static void method1() throws Exception{
        try {
            method2();
        }
        catch (Exception exception){
            throw new Exception("Exception thrown in method1",exception);
        }
    }
    public static void method2() throws Exception{
        try {
            method3();
        }
        catch (Exception exception){
            throw new Exception("Exception thrown in method2",exception);
        }
    }
    public static void method3() throws Exception{
        throw new Exception("Exception thrown in method3");
    }
}
