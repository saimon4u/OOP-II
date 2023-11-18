import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args){
        ChatRoom room1 = new ChatRoom("107");
        User rifat = new User("oopKimg","ooperraja");
        User saimon = new User("saimon","a");
        User yasin = new User("yasin","b");
        User tausif = new User("tausif","c");
        rifat.joinRoom(room1);
        saimon.joinRoom(room1);
        yasin.joinRoom(room1);
        tausif.joinRoom(room1);
        ExecutorService executorService = Executors.newCachedThreadPool();
        executorService.execute(saimon);
        executorService.execute(yasin);
        executorService.execute(rifat);
        executorService.execute(tausif);
        executorService.shutdown();
        try{
            boolean isFinished = executorService.awaitTermination(1, TimeUnit.SECONDS);
            if(isFinished){
                for(Message message: tausif.getAllMessage(room1)){
                    System.out.println(message);
                }
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}