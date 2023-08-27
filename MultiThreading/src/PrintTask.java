import java.util.Random;
import java.util.random.RandomGenerator;

public class PrintTask implements Runnable{
    private final int sleepTime;
    private final String taskName;
    private final static Random generator = new Random();
    public PrintTask(String taskName){
        this.taskName = taskName;
        sleepTime = generator.nextInt(4000);
    }
    public void run(){
        try {
            System.out.printf("%s going to sleep for %d miliseconds\n",taskName,sleepTime);
            Thread.sleep(sleepTime);
        }
        catch(InterruptedException exception){
            System.out.printf("%s %s\n",taskName,"terminated prematurely due to interruption");
        }
        System.out.printf("%s done sleeping\n",taskName);
    }
}
