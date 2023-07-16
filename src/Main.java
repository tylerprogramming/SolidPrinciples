import principles.dependencyinversionprinciple.after.EmailServiceImpl;
import principles.dependencyinversionprinciple.after.NewMesssageService;
import principles.dependencyinversionprinciple.after.SMSServiceImpl;

public class Main {
    public static void main(String[] args) {
        EmailServiceImpl emailService = new EmailServiceImpl();
        SMSServiceImpl smsService = new SMSServiceImpl();

        NewMesssageService messsageService = new NewMesssageService(smsService);

        messsageService.sendMessage("tyler@example.com", "This is an sms message.");
    }
}