package principles.dependencyinversionprinciple.after;

public class NewMesssageService {
    private MessageSender messageSender;

    public NewMesssageService(MessageSender messageSender) {
        this.messageSender = messageSender;
    }

    public void sendMessage(String recipient, String message) {
        messageSender.sendMessage(recipient, message);
    }
}
