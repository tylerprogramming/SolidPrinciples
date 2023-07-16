package principles.dependencyinversionprinciple.after;

import java.text.MessageFormat;

public class SMSServiceImpl implements MessageSender {
    @Override
    public void sendMessage(String recipient, String message) {
        System.out.println(MessageFormat.format("Text: Hello {0}, {1}", recipient, message));
    }
}
