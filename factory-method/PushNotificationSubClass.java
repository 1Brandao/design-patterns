public class PushNotificationSubClass extends NotificationFactory {

    @Override
    public Notification createNotification() {
        return new PushNotification();
    }
}