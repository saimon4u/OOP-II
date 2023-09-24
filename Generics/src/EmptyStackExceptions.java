public class EmptyStackExceptions extends RuntimeException{
    public EmptyStackExceptions(){
        this("Stack is empty");
    }
    public EmptyStackExceptions(String exception){
        super(exception);
    }
}
