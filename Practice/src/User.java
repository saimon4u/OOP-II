import java.time.LocalTime;
import java.util.*;

public class User implements Runnable{
    private String userName;
    private String password;
    private boolean isActive;
    private List <ChatRoom> joinedRooms;
    private Random random;

    public User(String userName, String password){
        this.userName = userName;
        this.password = password;
        this.isActive = true;
        this.joinedRooms = new Vector<>();
        this.random = new Random();
    }
    public void joinRoom(ChatRoom chatRoom){
        joinedRooms.add(chatRoom);
        chatRoom.addUser(this);
    }
    public void removeRoom(ChatRoom chatRoom){
        for(ChatRoom cr: joinedRooms){
            if(Objects.equals(cr,chatRoom)){
                joinedRooms.remove(chatRoom);
                break;
            }
        }
    }
    public synchronized void sendMessage(User receiver,StringBuilder content,ChatRoom chatRoom){
        chatRoom.sendMessage(this,receiver,content);
    }
    public ArrayList<Message> getAllMessage(ChatRoom chatRoom){
        ArrayList<Message> list = chatRoom.getMessageList(this);
        return list;
    }
    public String getUserName() {
        return userName;
    }

    @Override
    public void run(){
        try{
            for(User user : joinedRooms.get(0).getUserList()){
                if(Objects.equals(this,user)) continue;
                int x = random.nextInt(1500);
//                System.out.println(this.getUserName() + " is going to sleep for " + x + " at " + LocalTime.now().toString());
                Thread.sleep(x);
                sendMessage(user,new StringBuilder("Hello"),joinedRooms.get(0));
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}
