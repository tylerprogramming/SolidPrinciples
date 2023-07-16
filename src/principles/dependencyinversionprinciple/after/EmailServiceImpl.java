package principles.dependencyinversionprinciple.after;

import java.text.MessageFormat;

public class EmailServiceImpl implements MessageSender {

    @Override
    public void sendMessage(String recipient, String message) {
        System.out.println(MessageFormat.format("Email: Hello {0}, {1}", recipient, message));
    }
}
