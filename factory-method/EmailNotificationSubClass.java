public class EmailNotificationSubClass extends NotificationFactory {

    @Override
    public Notification createNotification() {
        return new EmailNotification();
    }
}