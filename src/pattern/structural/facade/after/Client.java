package pattern.structural.facade.after;

public class Client {

    public static void main(String[] args) {
        EmailSettings emailSettings = new EmailSettings();
        emailSettings.setHost("127.0.0.1");

        EmailSender emailSender = new EmailSender(emailSettings);

        EmailMessage emailMessage = new EmailMessage();
        emailMessage.setFrom("yj");
        emailMessage.setTo("triple");
        emailMessage.setCc("aa");
        emailMessage.setSubject("subject");
        emailMessage.setText("text");

        emailSender.sendEmail(emailMessage);
    }
}

