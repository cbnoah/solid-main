public class NotificationService {

    public void envoyer(String message, int choix) {

        if (choix == 1) {
            EmailSender sender = new EmailSender();
            sender.send(message);

        } else if (choix == 2) {
            SmsSender sender = new SmsSender();
            sender.send(message);

        } else if (choix == 3) {
            PushNotificationSender sender = new PushNotificationSender();
            sender.send(message);
        }
    }
}
