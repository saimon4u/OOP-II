import java.util.*;

public class ChatRoom{
    public ArrayList<User> getUserList(){
        return userList;
    }

    private ArrayList <User> userList;
    private String roomId;
    private ArrayList <Message> messageList;

    public ChatRoom(String roomId){
        this.roomId = roomId;
        this.userList = new ArrayList<>();
        this.messageList = new ArrayList<>();
    }

    public void addUser(User user){
        userList.add(user);
    }
    public void leaveRoom(User user){
        for(User u : userList){
            if(Objects.equals(u,user)){
                userList.remove(user);
                user.removeRoom(ChatRoom.this);
                break;
            }
        }
    }
    public void sendMessage(User sender,User receiver,StringBuilder content){
        Message message = new Message(sender,receiver,content);
//        System.out.println(message);
        messageList.add(message);
    }
    public ArrayList<Message> getMessageList(User receiver){
        ArrayList <Message> list = new ArrayList<>();
        for(Message message: messageList){
            if(Objects.equals(receiver,message.getReceiver())){
                list.add(message);
            }
        }
        return list;
    }
    public void printMessages(){
        for(Message message: messageList){
            System.out.println(message);
        }
    }
}
