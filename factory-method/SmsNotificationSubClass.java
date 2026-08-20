public class SmsNotificationSubClass extends NotificationFactory {

    @Override
    public Notification createNotification() {
        return new SmsNotification();
    }
}