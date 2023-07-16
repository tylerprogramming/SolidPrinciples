package principles.dependencyinversionprinciple.before;

public class MessagingService {
    private EmailService emailService;

    public MessagingService() {
        this.emailService = new EmailService();
    }

    public void sendMessage(String recipient, String message) {
        emailService.sendEmail(recipient, message);
    }
}
