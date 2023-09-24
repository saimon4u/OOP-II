import java.util.EmptyStackException;

public class Stack <E>  {
    private final int size;
    private int top;
    private E[] elements;
    public Stack(){
        this(10);
    }
    public Stack(int size){
        this.size = size > 0 ? size : 10;
        top = -1;
        elements = (E[]) new Object[size];
    }
    public void push(E pushValue){
        if(top == size-1){
            throw new FullStackException(String.format("Stack is full, cannot push %s",pushValue));
        }
        elements[++top] = pushValue;
    }
    public E pop(){
        if(top ==-1){
            throw new EmptyStackExceptions("Stack is empty, cannot pop");
        }
        E val = elements[top];
        top--;
        return val;
    }
}
