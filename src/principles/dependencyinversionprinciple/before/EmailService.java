package principles.dependencyinversionprinciple.before;

import java.text.MessageFormat;

public class EmailService {
    public void sendEmail(String recipient, String message) {
        System.out.println(MessageFormat.format("Email: Hello {}, {}", recipient, message));
    }
}
