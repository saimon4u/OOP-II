import java.time.LocalDate;
import java.time.LocalTime;
public class Message{
    private String timeStamp;
    private User sender;
    private User receiver;
    private StringBuilder content;

    public User getReceiver() {
        return receiver;
    }
    public Message(User sender, User receiver, StringBuilder content) {
        this.timeStamp = LocalDate.now().toString() + " " + LocalTime.now().withNano(0).toString();
        this.sender = sender;
        this.receiver = receiver;
        this.content = content;
        encrypt();
    }
    private void encrypt(){
        content.reverse();
    }
    private void decrypt(){
        encrypt();
    }

    @Override
    public String toString() {
        decrypt();
        String str = content.toString();
        encrypt();
        String format = sender.getUserName() + ": " + str + "\t" + receiver.getUserName() + " " + timeStamp;
        return format;
    }
}
